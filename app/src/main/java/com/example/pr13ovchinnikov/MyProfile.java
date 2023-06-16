package com.example.pr13ovchinnikov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MyProfile extends AppCompatActivity implements View.OnClickListener {
    ImageView iv7, iv8, iv9,iv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        iv7 = findViewById(R.id.imageView7);
        iv8 = findViewById(R.id.imageView8);
        iv9 = findViewById(R.id.imageView9);
        iv10 = findViewById(R.id.imageView10);
        iv7.setOnClickListener(this);
        iv8.setOnClickListener(this);
        iv9.setOnClickListener(this);
        iv10.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView7:
                Toast.makeText(this, "Спокойствие",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView8:
                Toast.makeText(this, "Привет",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView9:
                Toast.makeText(this, "Пока",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView10:
                Toast.makeText(this, "Взволнованным",Toast.LENGTH_LONG).show();
                break;
        }

    }
}