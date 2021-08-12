package br.edu.utfpr.activitycall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    public static final String PHRASE = "PHRASE";

    private TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        setTitle(getString(R.string.received_data));

        textViewData = findViewById(R.id.textViewData);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            String phrase = bundle.getString(PHRASE);

            textViewData.setText(phrase);
        }
    }

    public void goBack(View view) {
        finish();
    }
}