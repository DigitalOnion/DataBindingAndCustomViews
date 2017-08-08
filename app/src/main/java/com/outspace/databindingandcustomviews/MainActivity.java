package com.outspace.databindingandcustomviews;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.outspace.databindingandcustomviews.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BasicNumber number = new BasicNumber();
        number.setTheNumber(3.14159264f);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setBasicNumber(number);
        setContentView(R.layout.activity_main);
    }
}
