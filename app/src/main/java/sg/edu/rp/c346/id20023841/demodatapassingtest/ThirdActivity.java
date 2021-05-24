package sg.edu.rp.c346.id20023841.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswerChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswerChar = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char cvalue = intentReceived.getCharExtra("char", 'z');
        tvAnswerChar.setText("Character value received is: " + cvalue);

    }
}