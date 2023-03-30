package org.example;

public class Architect {

    private int length;

    private String units;

   public Architect(int length, String units){
        this.length = length;
        this.units = units;
    }

    public Boolean checkLength(int lengthFromUser, String unitsFromUser){
        if(length == lengthFromUser && units.equals(unitsFromUser))
            return true;
        else return false;
    }
}