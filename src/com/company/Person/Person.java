package com.company.Person;

import com.company.Fordon;

public class Person {
    private String namn;
    private int ålder;
    private String jobb;
    private int konto;
    private Fordon fordon;
    private Fordon fordon2;


    public Person(String namn, String jobb, int ålder, int konto, Fordon fordon, Fordon fordon2){
        this.namn = namn;
        this.jobb = jobb;
        this.ålder = ålder;
        this.fordon = fordon;
        this.fordon2 = fordon2;
        this.konto = konto;
    }


    public Person(String namn, String jobb, int ålder, int konto, Fordon fordon){
        this.namn = namn;
        this.jobb = jobb;
        this.ålder = ålder;
        this.fordon = fordon;
        this.konto = konto;
    }

    public Person(String namn, String jobb, int ålder, int konto){
        this.namn = namn;
        this.jobb = jobb;
        this.ålder = ålder;
        this.konto = konto;

    }


    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public String getJobb() {
        return jobb;
    }

    public void setJobb(String jobb) {
        this.jobb = jobb;
    }

    public int getKonto() {
        return konto;
    }

    public void setKonto(int konto) {
        this.konto = konto;
    }

    public Fordon getFordon() {
        return fordon;
    }

    public void setFordon(Fordon fordon) {
        this.fordon = fordon;
    }

    /*@Override
    public String toString() {
        return  namn + jobb + ;
    }*/
}
