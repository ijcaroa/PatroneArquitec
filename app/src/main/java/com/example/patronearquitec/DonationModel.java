package com.example.patronearquitec;

import android.util.Log;

//este es el modelo
public class DonationModel {

    private int donationAmount;

    public DonationModel() {
        this.donationAmount = 0;
    }

    //Acumulador suma acumulando las donaciones
    public boolean saveDonation(String donation) {
        int amount = validateString(donation);
        if (amount <= 0) {
            return false;
        } else {
            this.donationAmount += amount;
            return true;
        }

//getter de la donación que devuelve el total

    }
    public int validateString(String value){
        try {
            int donation = Integer.parseInt(value);
            return donation;
        } catch (NumberFormatException error){
            Log.e("Error", error.toString());
            return -1;
        }
        }
        public String checkAmountDonation(){
        if(donationAmount>=200){
            return "#D62222";
        } else if (donationAmount >= 500){
            return "#34C83A";
        } else {
            return "FF3700B3";
        }
        }


    public int getDonationAmount(){ return donationAmount;

    }
}

