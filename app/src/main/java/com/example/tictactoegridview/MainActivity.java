package com.example.tictactoegridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, btnRestart;
    int flag = 0, count = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Imit();


    }


    public void Imit() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        text = findViewById(R.id.text);
    }

    public void Click(View v) {
        Button btnCurrent = (Button) v;


        if (btnCurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                text.setText("X's turn");
                btnCurrent.setText("O");
                flag = 1;
            } else if (flag == 1) {
                text.setText("O's turn");
                btnCurrent.setText("X");
                flag = 0;
            }


            if (count >= 5) {
                b1 = button1.getText().toString();
                b2 = button2.getText().toString();
                b3 = button3.getText().toString();
                b4 = button4.getText().toString();
                b5 = button5.getText().toString();
                b6 = button6.getText().toString();
                b7 = button7.getText().toString();
                b8 = button8.getText().toString();
                b9 = button9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, b1 + " is wiiner", Toast.LENGTH_SHORT).show();

                    restart();
                } else if (b4.equals(b5) && b5.equals(b6) && !b6.equals("")) {
                    Toast.makeText(this, b4 + " is wiiner", Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, b8 + " is wiiner", Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")) {
                    Toast.makeText(this, b1 + " is wiiner", Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, b2 + " is wiiner", Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")) {
                    Toast.makeText(this, b3 + " is wiiner", Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, b1 + " is wiiner", Toast.LENGTH_SHORT).show();
                    restart();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, b7 + " is wiiner", Toast.LENGTH_SHORT).show();
                    restart();
                } else if (count == 9) {
                    Toast.makeText(this, "The game is draw", Toast.LENGTH_SHORT).show();
                    restart();
                }
            }

        }
    }

    public void RestartGame(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        if(flag==0)
        {
            flag=1;
        }
        else
        {
            flag=0;
        }
        count=0;
        Toast.makeText(this, "Your game is reset", Toast.LENGTH_SHORT).show();
    }


    public void restart() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                if(flag==0)
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                }
                count=0;
            }
        },2000);


    }
}