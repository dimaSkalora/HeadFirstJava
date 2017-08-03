package head_06.demo_sea_battle;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for(int cell: locationCells){
            if(guess == cell){
                result ="Попал";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length)
            result = "Потопил";
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
}
