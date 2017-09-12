package com.company;

import com.company.Flyg.Flygplan;
import com.company.Flyg.Helikopter;
import com.company.Land.Bil;
import com.company.Person.Fordonshandlare;
import com.company.Person.Köpare;
import com.company.Person.Person;
import com.company.Person.Säljare;

public class Fordonsprogrammet {

    public static void main(String[] args) {
	// write your code here


        Helikopter helix = new Helikopter();
        helix.setNamn("Helix");
        Flygplan viggen = new Flygplan();
        viggen.setNamn("Viggen");
        Bil volvo = new Bil();
        volvo.setNamn("Volvo");

        Fordonshandlare handlare = new Fordonshandlare("David", "Fordonshandlare,", 33, 2000);
        Köpare andreas = new Köpare("Andreas", "Köpare", 20, 2000,null);
        Köpare alexander = new Köpare("Alexander", "Köpare", 11, 2000,null);
        Köpare hulda = new Köpare("Hulda", "Köpare", 22, 2000, null);
        Säljare linda = new Säljare("Linda", "Säljare", 40, 2000, helix, viggen);
        Säljare maggan = new Säljare("Maggan", "Säljare", 50, 2000, volvo);

        System.out.println(handlare);
        System.out.println(andreas);
        System.out.println(alexander);
        System.out.println(hulda);
        System.out.println(linda);
        System.out.println(maggan);

        helix.fly(false);
        System.out.println(helix.getAltitude());

        handlare.ägarbyte(andreas,volvo);
        System.out.println(maggan);












        /*System.out.println(andreas);
        andreas.setÅlder(13);
        System.out.println(andreas);
        System.out.println(andreas.getÅlder());
        System.out.println(linda);
        linda.setEfternamn("apan");
        System.out.println(linda);
        linda.setFörnamn("mamma");
        System.out.println(linda);
        System.out.println();
        andreas.setName("johan","karlsson");
        System.out.println(andreas);
        System.out.println(linda.getEfternamn());
        System.out.println(linda);
        System.out.println(alexander.getEfternamn());
        julia.setName("maja","johansson");
        System.out.println(julia);*/



    }
}
