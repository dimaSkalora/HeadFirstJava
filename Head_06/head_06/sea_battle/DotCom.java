package head_06.sea_battle;

import java.util.ArrayList;

public class DotCom {
    String name;
    ArrayList<String> locationCells = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String stringGuess){
        int index = locationCells.indexOf(stringGuess);
        String result = "Мимо";
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили "+name+" :(");
            }
            else
                result = "Попал";
        }

        return result;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
}
