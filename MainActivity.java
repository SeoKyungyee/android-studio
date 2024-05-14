package com.example.project4_2_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    CheckBox checkBox;
    RadioGroup radioGroup;
    RadioButton radioButton, radioButton2, radioButton3;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView) findViewById(R.id.textView2);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox.isChecked() == true) {
                    textView2.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                } else {
                    textView2.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    imageView.setVisibility(View.INVISIBLE);

                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedRadio = radioGroup.getCheckedRadioButtonId();
                if (checkedRadio == R.id.radioButton) {
                    imageView.setImageResource(R.drawable.dog);
                } else if ((checkedRadio == R.id.radioButton2)) {
                    imageView.setImageResource(R.drawable.cat);
                } else {
                    imageView.setImageResource(R.drawable.rabbit);
                }
            }
        });
    }
}