package com.example.patronearquitec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.patronearquitec.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding mBinding;
    private Controller controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.button.setOnClickListener(v -> makeDonation());
    }

    private void makeDonation() {

        boolean donation = controller.saveDonation(mBinding.editTextDonation.getText().toString());
          if (donation){

            int totalDonation = controller.totalDonation();

            String total = getString(R.string.total_donation, String.valueOf(totalDonation));
            mBinding.textView3.setText(total);
            mBinding.editTextDonation.setText("");
        } else{
            showMessage("Donación no realizada");
    }

}

    private  void  showMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}