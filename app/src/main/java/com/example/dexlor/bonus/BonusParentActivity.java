package com.example.dexlor.bonus;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BonusParentActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_parent;
    private Button button_child;
    private EditText editText_username;
    private EditText editText_password;
    private TextView textView_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus_parent);

        //登陆
        textView_register = (TextView) findViewById(R.id.textview_register);
        button_parent = (Button) findViewById(R.id.button_login_parent);
        button_child = (Button) findViewById(R.id.button_login_child);
        editText_username = (EditText) findViewById(R.id.login_username);
        editText_password = (EditText) findViewById(R.id.login_password);
        button_parent.setOnClickListener(this);
        button_child.setOnClickListener(this);
        textView_register.setOnClickListener(this);
        Log.d("BonusParentActivity",getClass().getSimpleName());
    }

    @Override
    public void onClick(View view){
        String inputUsername;
        String inputPassword;
        switch(view.getId()){
            case R.id.button_login_parent:
                inputUsername = editText_username.getText().toString();
                inputPassword = editText_password.getText().toString();

                Log.d("username is",inputUsername);
                Log.d("password is ",inputPassword);
                break;
            case R.id.button_login_child:
                 inputUsername = editText_username.getText().toString();
                 inputPassword = editText_password.getText().toString();

                Log.d("BonusParentActivity","login by child");

                break;
            case R.id.textview_register:
                Intent registerscreen = new Intent(BonusParentActivity.this,RegisterActivity.class);
                startActivity(registerscreen);
            default:
                break;
        }
    }

}
