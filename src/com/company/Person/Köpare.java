package com.company.Person;


import com.company.Fordon;

public class Köpare extends Person {

    public Köpare(String namn, String jobb, int ålder, int konto, Fordon fordon){
        super(namn, jobb, ålder, konto, fordon);
    }

    @Override
    public String toString() {
        return "Namn: " + getNamn()+"," + " Jobb: " + getJobb() + " Ålder: " + getÅlder()+"," +" konto: " +getKonto() + " fordon " + getFordon();
    }
}
