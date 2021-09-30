package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    TextView tx;
    Boolean add,sub,div,mul,mod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx=findViewById(R.id.screen);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        b10=findViewById(R.id.btn10);
        b11=findViewById(R.id.btn11);
        b12=findViewById(R.id.btn12);
        b13=findViewById(R.id.btn13);
        b14=findViewById(R.id.btn14);
        b15=findViewById(R.id.btn15);
        b16=findViewById(R.id.btn16);
        b17=findViewById(R.id.btn17);
        b18=findViewById(R.id.btn18);
        b19=findViewById(R.id.btn19);

        b2.setText("<");
        add=sub=div=mul=mod=false;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(" ");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(" ");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"%");
                mod=true;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"/");
                div=true;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"7");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"8");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"9");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"X");
                mul=true;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"4");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"5");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"6");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"+");
                add=true;
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"1");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"2");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"3");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"-");
                sub=true;
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+"0");
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx.setText(tx.getText()+".");
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add==true){
                    String s = tx.getText().toString();
                    int index = s.indexOf("+");
                     String val1 = s.substring(0,index);
                     String val2 = s.substring(index+1);

                     float ans=Float.parseFloat(val1)+Float.parseFloat(val2);
                     tx.setText(""+ans);
                }
                if(sub==true){
                    String s = tx.getText().toString();
                    int index = s.indexOf("-");
                    String val1 = s.substring(0,index);
                    String val2 = s.substring(index+1);

                    float ans=Float.parseFloat(val1)-Float.parseFloat(val2);
                    tx.setText(""+ans);
                }
                if(div==true){
                    String s = tx.getText().toString();
                    int index = s.indexOf("/");
                    String val1 = s.substring(0,index);
                    String val2 = s.substring(index+1);

                    float ans=Float.parseFloat(val1)/Float.parseFloat(val2);
                    tx.setText(""+ans);
                }
                if(mod==true){
                    String s = tx.getText().toString();
                    int index = s.indexOf("%");
                    String val1 = s.substring(0,index);
                    String val2 = s.substring(index+1);

                    float ans=Float.parseFloat(val1)%Float.parseFloat(val2);
                    tx.setText(""+ans);
                }
                if(mul==true){
                    String s = tx.getText().toString();
                    int index = s.indexOf("X");
                    String val1 = s.substring(0,index);
                    String val2 = s.substring(index+1);

                    float ans=Float.parseFloat(val1)*Float.parseFloat(val2);
                    tx.setText(""+ans);
                }
            }
        });

    }
}