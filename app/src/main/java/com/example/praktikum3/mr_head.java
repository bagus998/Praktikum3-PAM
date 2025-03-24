package com.example.praktikum3;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class mr_head extends AppCompatActivity {
    private ImageView hair, eyebrows, moustache, beard;
    private CheckBox checkBoxHair, checkBoxEyebrow,
            checkBoxMoustache, checkBoxBeard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_head);
        hair = findViewById(R.id.hair);
        eyebrows = findViewById(R.id.eyebrows);
        moustache = findViewById(R.id.moustache);
        beard = findViewById(R.id.beard);
        checkBoxHair = findViewById(R.id.checkboxHair);
        checkBoxEyebrow =
                findViewById(R.id.checkboxEyebrow);
        checkBoxMoustache =
                findViewById(R.id.checkboxMoustache);
        checkBoxBeard = findViewById(R.id.checkboxBeard);
        checkBoxHair.setOnCheckedChangeListener((buttonView,
                                                 isChecked) -> {
            hair.setVisibility(isChecked ? View.INVISIBLE :
                    View.VISIBLE);
        });

        checkBoxEyebrow.setOnCheckedChangeListener((buttonView,
                                                    isChecked) -> {
            eyebrows.setVisibility(isChecked ?
                    View.INVISIBLE : View.VISIBLE);
        });

        checkBoxMoustache.setOnCheckedChangeListener((buttonView,
                                                      isChecked) -> {
            moustache.setVisibility(isChecked ?
                    View.INVISIBLE : View.VISIBLE);
        });

        checkBoxBeard.setOnCheckedChangeListener((buttonView,
                                                  isChecked) -> {
            beard.setVisibility(isChecked ? View.INVISIBLE :
                    View.VISIBLE);
        });
    }
}

