package head_11.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExTestDrive {
    public static void main(String[] args) throws IOException {
        System.out.println("yes/no");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String test = br.readLine();

        try{
            System.out.print("t");
            doRisky(test);
            System.out.print("o");
        }catch (MyEx e){
            System.out.print("a");
        }finally {
            System.out.print("w");
        }
        System.out.println("s");
    }

    static void doRisky(String t)throws MyEx{
        System.out.print("h");
        if("yes".equals(t))
            throw new MyEx();
        System.out.print("r");
    }
}
