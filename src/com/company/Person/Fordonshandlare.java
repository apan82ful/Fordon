package com.company.Person;

//Gör metoder till fordonshandlaren så ett fordon kan byta ägare. Ett fordon ska inte bara byta ägare,
//utan säljaren ska få pengar av köparen och fordonshandlaren ska få sin andel. Säljaren ska bara
//kunna bli av med ett fordon och en köpare ska bara kunna få ett.

/* person säljer fordon till köpare.
fordonet byter ägare.
såljaren får pengar av köparen
fordonshandlaren får sin del.
säljaren blir av med ett fordon
köparen får ett.
 */



import com.company.Fordon;

public class Fordonshandlare extends Person {


    public Fordonshandlare(String namn, String jobb, int ålder, int konto, Fordon fordon){
        super(namn, jobb, ålder, konto, fordon);

    }

    public Fordonshandlare(String namn, String jobb, int ålder, int konto){
        super(namn, jobb, ålder, konto);
    }

    public void ägarbyte(Person köpare, Fordon fordon){
        Person säljare = fordon.getPerson();
        fordon.setPerson(köpare);

        int köpebelopp = fordon.getPris();
        köpare.setKonto(köpare.getKonto() - köpebelopp);
        setKonto(getKonto() + (int)(köpebelopp * 0.1));

        säljare.setKonto(säljare.getKonto() + köpebelopp - (int)(köpebelopp * 0.1));



    }

    @Override
    public String toString() {
        return "Namn: " + getNamn()+"," + " Jobb: " + getJobb() + " Ålder: " + getÅlder()+"," +" konto: " +getKonto();
    }
}
