package com.shefaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText editID, editPassword;
    private Button loginButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUi();
    }

    private void initUi() {
        editID = (EditText) findViewById(R.id.edit_login_screen_id);
        editPassword = (EditText) findViewById(R.id.edit_login_screen_password);
        loginButt = (Button) findViewById(R.id.login_butt);

        editID.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus) {
                    if(editID.getText().toString().length()>=6)
                        editID.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_done_24dp, 0);
                    else
                        editID.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_error_24dp, 0);
                } else {
                    editID.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
        });

        loginButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
