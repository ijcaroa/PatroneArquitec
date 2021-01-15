package com.example.patronearquitec;

public class DonationPresenter {
    //Variables para hablar con la vista y el modelo.
    private IViewPresenter view;
    private DonationModel model;


    public DonationPresenter(IViewPresenter view) {
        this.view = view;
        this.model = new DonationModel();
    }

    public void saveDonation(String donation){
        checkTotal();
        if (model.saveDonation(donation)){
            view.displayConfirmationMessage();
            view.updateTotalDonation(model.getDonationAmount());
        } else {
            view.displayErrorMessage();
        }
    }
    public void checkTotal(){
         view.displayColorAlert(model.checkAmountDonation());

        }
    }




