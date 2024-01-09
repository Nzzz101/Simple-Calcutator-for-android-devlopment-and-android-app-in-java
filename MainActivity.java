package com.threez101210.calcutatorfor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText en1,en2;
    public TextView rt;
    public Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        en1 =(EditText) findViewById(R.id.en1);
        en2 =(EditText)findViewById(R.id.en2);
        rt =(TextView) findViewById(R.id.rt);
        b1 =(Button) findViewById(R.id.b1);
        b2 =(Button) findViewById(R.id.b2);
        b3 =(Button) findViewById(R.id.b3);
        b4 =(Button) findViewById(R.id.b4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp1 = Integer.parseInt(en1.getText().toString());
                int temp2 = Integer.parseInt(en2.getText().toString());
                int sum = temp1 + temp2;
                rt.setText("Answer =   " + String.valueOf(sum));
              Toast.makeText(MainActivity.this , "Answer is :" + String.valueOf(sum) , Toast.LENGTH_LONG).show();;
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t1 = Integer.parseInt(en1.getText().toString());
                int t2 = Integer.parseInt(en2.getText().toString());
                int sub = t1 - t2;
                rt.setText("Answer: -" + String.valueOf(sub));
                Toast.makeText(MainActivity.this , "Answer is :" + String.valueOf(sub) , Toast.LENGTH_LONG).show();;
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int e1 = Integer.parseInt((en1.getText().toString()));
                int e2 = Integer.parseInt((en2.getText().toString()));
                int mulyipy = e1 / e2;
                rt.setText("Answer : x" + String.valueOf(mulyipy));
                Toast.makeText(MainActivity.this , "Answer is :" + String.valueOf(mulyipy) , Toast.LENGTH_LONG).show();;
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int m1 = Integer.parseInt(en1.getText().toString());
                int m2 = Integer.parseInt(en2.getText().toString());
                int div = m1 * m2;
                rt.setText("Answer: *" + String.valueOf(div));
                Toast.makeText(MainActivity.this , "Answer is :" + String.valueOf(div) , Toast.LENGTH_LONG).show();
                ;
            }
        });


    }
}