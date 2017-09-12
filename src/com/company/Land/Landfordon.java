package com.company.Land;

import com.company.Fordon;

public class Landfordon extends Fordon {
    int kms;

    public void drive(int km){
        kms += km;
    }
}
