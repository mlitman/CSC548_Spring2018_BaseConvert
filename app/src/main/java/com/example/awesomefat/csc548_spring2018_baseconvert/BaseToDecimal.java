package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BaseToDecimal extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_to_decimal);

        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }

    private int baseToDecimal(String num, int base)
    {
        int sum = 0;
        int place = 1;
        String map = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        num = num.toUpperCase();

        for(int i = num.length()-1; i >= 0; i--)
        {
            sum = sum + (map.indexOf(num.charAt(i)) * place);
            place *= base;
        }
        return sum;
    }

    public void base2ButtonPressed(View v)
    {
        String input = this.inputET.getText().toString();
        int answer = this.baseToDecimal(input, 2);
        this.answerTV.setText("" + answer);
    }

    public void base8ButtonPressed(View v)
    {
        String input = this.inputET.getText().toString();
        int answer = this.baseToDecimal(input, 8);
        this.answerTV.setText("" + answer);    }

    public void base10ButtonPressed(View v)
    {
        String input = this.inputET.getText().toString();
        int answer = this.baseToDecimal(input, 10);
        this.answerTV.setText("" + answer);    }

    public void base16ButtonPressed(View v)
    {
        String input = this.inputET.getText().toString();
        int answer = this.baseToDecimal(input, 16);
        this.answerTV.setText("" + answer);
    }
}
