package com.example.numoperation;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int user_dv, rem, rev=0, num, digit=0, even_odd_udv, factorial_udv, fact=1, reverse_udv;

    private TextView factorial;
    private TextView numOffDigits;
    private TextView oddEven;
    private TextView reverse;
    private EditText editTextNumber;


    @SuppressLint("SetTextI18n")
    public void number_of_digit() {
        while (num > 0) {
            num /= 10;
            digit++;
        }
        numOffDigits.setText("Number of digit is : "+digit);
    }

    @SuppressLint("SetTextI18n")
    public void odd_even_numbers() {
        if (even_odd_udv % 2 == 0) {
            oddEven.setText("Number is Even");
        } else {
            oddEven.setText("Number is Odd");
        }
    }

    @SuppressLint("SetTextI18n")
    public void factorial_number() {
        while (factorial_udv > 0) {
            fact = fact * factorial_udv;
            factorial_udv--;
        }
        factorial.setText("Factorial of number is : "+fact);
    }

    @SuppressLint("SetTextI18n")
    public void reverse_number() {
        while (reverse_udv>0) {
            rem=reverse_udv%10;
            rev=rev*10+rem;
            reverse_udv/=10;
        }
        reverse.setText("Reverse of number is : "+rev);

    }

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
            rev=digit=0;
            fact=1;


            String s = editTextNumber.getText().toString();
            if(s.isEmpty()){
                Toast.makeText(getApplicationContext(),"Enter Value",Toast.LENGTH_SHORT).show();
                return;
            }
            user_dv = Integer.parseInt(s);
            num = even_odd_udv = factorial_udv = reverse_udv = user_dv;
            number_of_digit();
            odd_even_numbers();
            factorial_number();
            reverse_number();


        });

        clear.setOnClickListener(view -> {
            num = even_odd_udv = factorial_udv = reverse_udv = 0;
            rev=digit=0;
            fact=1;
            editTextNumber.setText("");
            numOffDigits.setText("Enter Global Variable:");
            oddEven.setText("");
            factorial.setText("");
            reverse.setText("");
        });

        exit.setOnClickListener(view -> {
            finish();
            System.exit(0);
        });

    }
}