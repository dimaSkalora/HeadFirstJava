package head_06.sea_battle;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComArrayList = new ArrayList<>();
    private int numOfGuesses=0;

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComArrayList.add(one);
        dotComArrayList.add(two);
        dotComArrayList.add(three);

        System.out.println("Ваша цель - потопиь три \"сайта\"");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for(DotCom dotCom: dotComArrayList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!dotComArrayList.isEmpty()){
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Мимо";
        for(DotCom dotCom: dotComArrayList){
            result = dotCom.checkYourself(userGuess);
            if(result.equals("Попал"))
                break;
            if(result.equals("Потопил")){
                dotComArrayList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции тепер ничего не стоят.");
        if(numOfGuesses<=18){
            System.out.println("Это заняло у вас всего "+numOfGuesses+" попыток");
            System.out.println("Вы успели выбратся до того как ваши вложения утонули");
        }else{
            System.out.println("Это заняло у вас довольно много времени "+numOfGuesses+" попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
