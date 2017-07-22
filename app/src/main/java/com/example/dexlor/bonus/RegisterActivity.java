package com.example.dexlor.bonus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button registerButton;
    private Button cancelButton;
    private EditText username;
    private EditText password;
    private EditText comfirmPassword;
    private EditText nickname;
    private RadioGroup sexRadioGroup;
    private RadioButton male;
    private RadioButton female;
    String mSex;
    String mUername;
    String mPassword;
    String mComirmPassword;
    String mNickName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus_registerscreen);

        username = (EditText) findViewById(R.id.inputUsername);
        nickname = (EditText) findViewById(R.id.inputNickname);
        password = (EditText) findViewById(R.id.inputPassword);
        username = (EditText) findViewById(R.id.inputConfirmPassword);
        sexRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        registerButton = (Button) findViewById(R.id.registerbutton);
        cancelButton = (Button) findViewById(R.id.cancelbutton);
        male = (RadioButton) findViewById(R.id.radioMale);
        female = (RadioButton) findViewById(R.id.radioFemale);
        registerButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
        sexRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                                     @Override
                                                     public void onCheckedChanged(RadioGroup arg0, int checkedId) {
                                                         if (male.getId() == checkedId)
                                                             mSex = male.getText().toString();
                                                         else
                                                             mSex = female.getText().toString();
                                                         Log.d("sex is ",mSex);
                                                         }
                                                    }
                                                    );
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.registerbutton:
               Log.d("registerbutton clicked","register");
                break;
            case R.id.cancelbutton:
                finish();
                break;
        }

    }
}