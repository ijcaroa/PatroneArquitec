package com.example.patronearquitec;
//este es el modelo
public class DonationModel {

    private int donationAmount;

    public DonationModel() {
        this.donationAmount = 0;
    }

    //Acumulador suma acumulando las donaciones
    public boolean saveDonation(String donation) {

        Integer amount = Integer.valueOf(donation);
        if (amount <= 0) {
            return false;
        } else {
            this.donationAmount += amount;
            return true;
        }
//getter de la donación que devuelve el total

    }
    public int getDonationAmount(){ return donationAmount;

    }
}

