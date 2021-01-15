package com.example.patronearquitec;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.example.patronearquitec.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IViewPresenter {

    public ActivityMainBinding mBinding;
    //Variable que referencia al presentador
    private DonationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
       // acá se instancia el presenter.
        presenter = new DonationPresenter(this);
        mBinding.button.setOnClickListener(v -> makeDonation());
    }

    private void makeDonation() {
        presenter.saveDonation(mBinding.editTextDonation.getText()
                .toString());
        mBinding.editTextDonation.setText("");
        presenter.checkTotal();


}//metodos que actualiza la interfaz de usuario
    @Override
    public void updateTotalDonation(int totalAmount) {
        String total = getString(R.string.total_donation, String.valueOf(totalAmount));
        mBinding.textView3.setText(total);
    }

    @Override
    public void displayConfirmationMessage() {
        Toast.makeText(this, "Donación Realizada",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void displayErrorMessage() {
        Toast.makeText(this, "Algo Ocurrio, Error en la donación",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void displayColorAlert(String color) {

        mBinding.tVTotal.setBackgroundColor(Color.parseColor(color));
    }




}