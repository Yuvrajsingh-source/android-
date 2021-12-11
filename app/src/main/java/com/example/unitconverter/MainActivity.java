package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      private Button button;
      private TextView textView;
      private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView1);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        String S= editText.getText().toString();
//                         int a = Integer.parseInt(S);
//                             double pounds= 2.205 * a ;
//                        textView.setText("The corresponding value of pounds is :" + pounds);
//                    }
//                }
//        );
    }
        public void calculate(View view)  {
            String s= editText.getText().toString();
            int a=Integer.parseInt(s);
             double pounds= 2.025*a;
             textView.setText("The corresponding value of pounds is :" + pounds);
             Toast.makeText(MainActivity.this,"Thanks for using this app",Toast.LENGTH_SHORT).show();
    }

}