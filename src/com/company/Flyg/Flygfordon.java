package com.company.Flyg;

import com.company.Fordon;

public class Flygfordon extends Fordon {
    private int altitude;

    public void fly(boolean isFlying){
        if(isFlying){
            setAltitude(getAltitude() + 1);
        }
        else{
            setAltitude(0);
        }
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}




