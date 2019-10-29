package com.example.targil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView result,action;
    private EditText num1,num2;
    private Button bt1,plus,minus,multiply,devision;
    private char charAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.result);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        multiply=(Button)findViewById(R.id.multiply);
        devision=(Button)findViewById(R.id.devision);
        bt1 = (Button)findViewById(R.id.bt1);
        action=(TextView)findViewById(R.id.action);
        bt1.setOnClickListener(this);
        plus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        minus.setOnClickListener(this);
        devision.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==plus){
            action.setText("+");
            charAction='+';
        }
        if (v==minus){
            action.setText("-");
            charAction='-';
        }
        if (v==multiply){
            action.setText("*");
            charAction='*';
        }
        if (v==devision){
            action.setText("/");
            charAction='/';
        }

        if (v.getId()==bt1.getId()) {
            int numb1 = Integer.parseInt(num1.getText().toString());
            int numb2 = Integer.parseInt(num2.getText().toString());
            switch (charAction){
                case '+':
                    result.setText(String.valueOf(numb1 + numb2));
                    break;
                case  '-':
                    result.setText(String.valueOf(numb1 - numb2));
                    break;
                case  '*':
                    result.setText(String.valueOf(numb1 * numb2));
                    break;
                case  '/':
                    result.setText(String.valueOf(numb1 / numb2));
                    break;
            }
            Toast.makeText(this,"resulting",Toast.LENGTH_LONG).show();

        }


    }
}
