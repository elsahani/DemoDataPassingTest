package sg.edu.rp.c346.id20023841.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswerDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //Step 2
        tvAnswerDouble = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        double dvalue = intentReceived.getDoubleExtra("double",0.0);
        tvAnswerDouble.setText("Double value is " + dvalue);

    }
}