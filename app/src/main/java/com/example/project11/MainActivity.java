package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToFruitLayout(View view) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();

    }
    public void moveToAnimalLayout(View view) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();

    }
}
