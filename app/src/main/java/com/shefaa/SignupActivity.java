package com.shefaa;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * * Created by Ahmed Adel Al-Desouqy on 06-May-18.
 */

public class SignupActivity extends AppCompatActivity {

    private Button nextButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        nextButton = (Button) findViewById(R.id.sign_up_next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, SpecialitiesHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
