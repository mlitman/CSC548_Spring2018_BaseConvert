package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalToBase extends AppCompatActivity
{

    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_base);

        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }

    private String decimalToBase(int num, int base)
    {
        String answer = "";
        String map = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(num > 0)
        {
            answer = map.charAt(num%base) + answer;
            num = num / base;
        }
        return answer;
    }

    public void base2ButtonPressed(View v)
    {
        int num = Integer.parseInt(this.inputET.getText().toString());
        String answer = this.decimalToBase(num, 2);
        this.answerTV.setText(answer);
    }

    public void base8ButtonPressed(View v)
    {
        int num = Integer.parseInt(this.inputET.getText().toString());
        String answer = this.decimalToBase(num, 8);
        this.answerTV.setText(answer);    }

    public void base10ButtonPressed(View v)
    {
        int num = Integer.parseInt(this.inputET.getText().toString());
        String answer = this.decimalToBase(num, 10);
        this.answerTV.setText(answer);    }

    public void base16ButtonPressed(View v)
    {
        int num = Integer.parseInt(this.inputET.getText().toString());
        String answer = this.decimalToBase(num, 16);
        this.answerTV.setText(answer);
    }
}
