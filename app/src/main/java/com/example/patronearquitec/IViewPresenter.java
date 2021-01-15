package com.example.patronearquitec;

public interface IViewPresenter {
    void updateTotalDonation(int totalAmount);
    void displayConfirmationMessage();
    void displayErrorMessage();
    void displayColorAlert(String color);

}
