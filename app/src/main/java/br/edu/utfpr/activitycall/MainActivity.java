package br.edu.utfpr.activitycall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPhrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPhrase = findViewById(R.id.editTextPhrase);
    }

    public void send(View view) {
        Intent intent = new Intent(this, ShowData.class);

        intent.putExtra(ShowData.PHRASE, editTextPhrase.getText().toString());
        startActivity(intent);
    }
}