package com.company.Person;

import com.company.Fordon;

public class Säljare extends Person {


    public Säljare(String namn, String jobb, int ålder, int konto, Fordon fordon, Fordon fordon2){
        super(namn, jobb, ålder, konto, fordon, fordon2);
    }
    public Säljare(String namn, String jobb, int ålder, int konto, Fordon fordon) {
        super(namn, jobb, ålder, konto, fordon);
    }

    @Override
    public String toString() {
        return "Namn: " + getNamn()+"," + " Jobb: " + getJobb() + " Ålder: " + getÅlder()+"," +" konto: " +getKonto() + " fordon " + getFordon();
    }

}
