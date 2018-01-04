package com.example.pranav.masterclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;
    EditText edit,edit1;
    float i,j,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.add);
        edit=findViewById(R.id.Text1);
        text=findViewById(R.id.text);

    }

    public void addition(View view) {

        String s= edit.getText().toString();
        i =Float.parseFloat(s);
        String t= edit1.getText().toString();
        j=Float.parseFloat(t);
        c= i+j;
        text.setText(c+"");
    }

    public void subtract(View view) {

        String s= edit.getText().toString();
        i =Float.parseFloat(s);
        String t= edit1.getText().toString();
        j=Float.parseFloat(t);
        c = i-j;
        text.setText(c+"");
    }

    public void multiply(View view) {

        String s= edit.getText().toString();
        i =Float.parseFloat(s);
        String t= edit1.getText().toString();
        j=Float.parseFloat(t);
        c = i*j;
        text.setText(c+"");

    }

    public void divide(View view) {

        String s= edit.getText().toString();
        i =Float.parseFloat(s);
        String t= edit1.getText().toString();
        j=Float.parseFloat(t);
        if(j==0)
            text.setText("Error");
        else {
            c = i / j;
            text.setText(c + "");
        }
    }
}
