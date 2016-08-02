package com.example.administrator.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showp();
    }
    public void showp()
    {
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = String.valueOf(e1.getText());
                StringTokenizer ob = new StringTokenizer(st,", ");
                count = ob.countTokens();
                e2.setText(Integer.toString(count));
            }
        });
    }
}
