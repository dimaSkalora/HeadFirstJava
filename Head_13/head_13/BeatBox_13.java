package head_13;

import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

public class BeatBox_13 {
		JPanel mainPanel;
		//Мы храним флажки в масиве ArrayList
		ArrayList<JCheckBox> checkboxList;
		Sequencer sequencer;
		Sequence sequence;
		Track track;
		JFrame theFrame;

		//Это названия инструментов ввиде строкового масива предназначиные для
		//создания меток в пользовательском интерфейсе(на каждый ряд)
		String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat",
				"Acoustic Shace", "Crash Cymbal", "Hand Clap", "High Tom",
				"Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap",
				"Low-mid Tom", "High Agogo", "Open Hi Conga"};
		//Эти числа представляют собой фактические барабаные клавишы. Канал барабана -
		//- это чтото вроде фортепианино только кажадая клавиша на нем - отдельный
		//барабан. Номер 35 это клавиша для Bass drum a 42 - Closed Hi-Hat
		int[] intstruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

		public static void main(String[] args) {
			BeatBox_13 gui = new BeatBox_13();
			gui.buildGUI();
		}

		public void buildGUI() {
			theFrame = new JFrame("Cuber BeatBox");
			theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			BorderLayout layout = new BorderLayout();
			JPanel background = new JPanel(layout);
			//Пустая граница позволяет создать поля между краями панели и
			//местом размещения компонентов
			background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

			checkboxList = new ArrayList<JCheckBox>();
			Box buttonBox = new Box(BoxLayout.Y_AXIS);

			JButton start = new JButton("Start");
			start.addActionListener(new MyStartListener());
			buttonBox.add(start);

			JButton stop = new JButton("Stop");
			stop.addActionListener(new MyStopListener());
			buttonBox.add(stop);

			JButton upTempo = new JButton("Tempo Up");
			upTempo.addActionListener(new MyUpTempoListener());
			buttonBox.add(upTempo);

			JButton downTempo = new JButton("Tempo Down");
			downTempo.addActionListener(new MyDownTempoListener());
			buttonBox.add(downTempo);

			Box nameBox = new Box(BoxLayout.Y_AXIS);
			for (int i = 0; i < 16; i++) {
				nameBox.add(new Label(instrumentNames[i]));
			}

			background.add(BorderLayout.EAST, buttonBox);
			background.add(BorderLayout.WEST, nameBox);

			theFrame.getContentPane().add(background);

			GridLayout grid = new GridLayout(16, 16);
			grid.setVgap(1);
			grid.setHgap(2);
			mainPanel = new JPanel(grid);
			background.add(BorderLayout.CENTER, mainPanel);

			//Создаем флажки присваиваем им значение false(что бы они не были установленые)
			//а затем добавляем их в масив ArrayList b yf gfytkm
			for (int i = 0; i < 256; i++) {
				JCheckBox c = new JCheckBox();
				c.setSelected(false);
				checkboxList.add(c);
				mainPanel.add(c);
			}//конец цикла

			setUpMidi();

			theFrame.setBounds(50, 50, 300, 300);
			theFrame.pack();
			theFrame.setVisible(true);
		}//закрываем метод

		//Обычный MIDI-код для получения синтезатора секвенсора и дорожки
		public void setUpMidi() {
			try {
				sequencer = MidiSystem.getSequencer();
				sequencer.open();
				sequence = new Sequence(Sequence.PPQ, 4);
				track = sequence.createTrack();
				sequencer.setTempoInMPQ(120);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//Вот здесь все и происходить! Мы преобразуем состояния флажков в MIDI-событие
		//и добавляем их на дорожку
		public void buildTrackAndStart() {
			//Создаем масив из 16 элементов, чтобы хранить значения
			//для каждого инструмента на все 16 тактов
			int[] trackList = null;

			//Избавляемся от старой дорожки и создаем новую
			sequence.deleteTrack(track);
			track = sequence.createTrack();

			//Делаем это для каждого из 16 рядов(тоесть для Bass, Congo,..)
			for (int i = 0; i < 16; i++) {
				trackList = new int[16];

				//Задаем клавишу которая представляет инструмент(Bass, Hi-Hat,...).Масив
				//содержит MIDI-числа для каждого инструмента
				int key = intstruments[i];
				//Делаем это для каждого такто текущего ряда
				for (int j = 0; j < 16; j++) {
					JCheckBox jc = (JCheckBox) checkboxList.get(j + (16 * i));
					//Установлен ли флажок на этом такте? Если да то помещаем
					//значений клавиш в текушую ячейку масива(который представляет такт)
					if (jc.isSelected()) {
						trackList[j] = key;
					} else {
						trackList[j] = 0;
					}
				}

				//Для этого инструмента и для все 16 тактов создаем события
				//и добавляем их на дорожку
				makeTrack(trackList);
				track.add(makeEvent(176, 1, 127, 0, 16));
			}

			//Мы всегда должны быть уверены что событие на 16 тактов существуют
			//(они идут от 0 до 15)
			track.add(makeEvent(192, 9, 1, 0, 15));
			try {
				sequencer.setSequence(sequence);
				//Позволяет задать количество повторений цикла или как
				// в этом случае непрыривный цикл
				sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
				sequencer.start();
				//Тепер мы проигрываем мелодию
				sequencer.setTempoInBPM(120);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//Внутрений класс(Слушатель для кнопки)
		public class MyStartListener implements ActionListener {
			public void actionPerformed(ActionEvent a) {
				buildTrackAndStart();
			}
		}

		public class MyStopListener implements ActionListener {
			public void actionPerformed(ActionEvent a) {
				sequencer.stop();
			}
		}

		public class MyUpTempoListener implements ActionListener {
			public void actionPerformed(ActionEvent a) {
				float tempoFactor = sequencer.getTempoFactor();
				sequencer.setTempoFactor((float) (tempoFactor * 1.03));
			}
		}

		public class MyDownTempoListener implements ActionListener {
			public void actionPerformed(ActionEvent a) {
				float tempoFactor = sequencer.getTempoFactor();
				sequencer.setTempoFactor((float) (tempoFactor * .97));
			}
		}

		//Метод создает события для одного инструмента за каждый проход цикла
		//для всех 16 тактов.
		public void makeTrack(int[] list) {
			for (int i = 0; i < 16; i++) {
				int key = list[i];

				if (key != 0) {
					//Создаем солбытия включения и выключения и добовляем их в дорожку
					track.add(makeEvent(144, 9, key, 100, i));
					track.add(makeEvent(128, 9, key, 100, i + 1));
				}
			}
		}

		public MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick) {
			MidiEvent event = null;
			try {
				ShortMessage a = new ShortMessage();
				a.setMessage(cmd, chan, one, two);
				event = new MidiEvent(a, tick);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return event;
		}

}
