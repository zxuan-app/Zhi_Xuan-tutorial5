package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;
    private int number;
    int[] image = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img = findViewById(R.id.img1);
        btn = findViewById(R.id.btn1);

        img.setBackgroundResource(image[0]);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number ++;
                number = number%image.length;
                img.setBackgroundResource(image[number]);
            }
        });

    }
}