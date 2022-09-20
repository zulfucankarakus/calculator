package com.example.hesapmakinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText,editText2;
    private Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);


        textView.setText("0");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alinansayi1=editText.getText().toString();
                String alinansayi2=editText2.getText().toString();

                int sayi1=Integer.parseInt(alinansayi1);
                int sayi2 =Integer.parseInt(alinansayi2);

                int toplam=sayi1+sayi2;

                textView.setText(String.valueOf(toplam));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alinansayi1=editText.getText().toString();
                String alinansayi2=editText2.getText().toString();

                int sayi1=Integer.parseInt(alinansayi1);
                int sayi2 =Integer.parseInt(alinansayi2);

                int carpim=sayi1*sayi2;

                textView.setText(String.valueOf(carpim));
            }
        });
    }
}