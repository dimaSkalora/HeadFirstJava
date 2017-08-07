package head_14;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        File myFile = new File("Head_14/head_14/MyText.txt");
        try {
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while((line=reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
