package com.company;

import com.company.Person.Person;

public class Fordon {
    private int vikt;
    private int pris;
    private String namn;
    private Person person;

    /*public Fordon(int vikt, int pris, Person person){
        this.setVikt(vikt);
        this.setPris(pris);
        this.setPerson(person);
    }*/


    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
