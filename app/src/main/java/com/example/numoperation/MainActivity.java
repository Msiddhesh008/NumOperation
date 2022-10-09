package com.example.numoperation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.numoperation.domain.ChainOfResponsiblity;
import com.example.numoperation.domain.FindFactorial;
import com.example.numoperation.domain.FindNumberOfDigits;
import com.example.numoperation.domain.FindOddEven;
import com.example.numoperation.domain.FindReverseNumber;


public class MainActivity extends AppCompatActivity {
    int user_dv;
    private TextView factorial;
    private TextView numOffDigits;
    private TextView oddEven;
    private TextView reverse;
    private EditText editTextNumber;

    ChainOfResponsiblity responsiblity;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        factorial = findViewById(R.id.factorial);
        oddEven = findViewById(R.id.oddEven);
        reverse = findViewById(R.id.reverse);
        editTextNumber = findViewById(R.id.editTextNumber);
        numOffDigits = findViewById(R.id.numOffDigits);
        Button exit = findViewById(R.id.exit);
        Button clear = findViewById(R.id.clear);

        button.setOnClickListener(v -> {


            Log.e("TAG", "button:setOnClickListener ");
            String s = editTextNumber.getText().toString();
            if (s.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Enter Value", Toast.LENGTH_SHORT).show();
                return;
            }
            user_dv = Integer.parseInt(s);
            responsiblity = new ChainOfResponsiblity();
            numOffDigits.setText(responsiblity.find(new FindNumberOfDigits(user_dv)));
            oddEven.setText(responsiblity.find(new FindOddEven(user_dv)));
            factorial.setText(responsiblity.find(new FindFactorial(user_dv)));
            reverse.setText(responsiblity.find(new FindReverseNumber(user_dv)));


        });

        clear.setOnClickListener(view -> {
            numOffDigits.setText("");
            oddEven.setText("");
            factorial.setText("");
            reverse.setText("");
            editTextNumber.setText("");
        });

        exit.setOnClickListener(view -> {

            finish();
        });

    }

}