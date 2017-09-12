package com.company.Vatten;

import com.company.Fordon;
import com.company.Person.Person;

import java.util.Random;

public class Vattenfordon extends Fordon {
    int gps;

    /*public Vattenfordon(int vikt, int pris, Person person) {
        super(vikt, pris, person);
    }*/

    public void go(){
        Random rand = new Random();
        gps = rand.nextInt();


    }
}
