package com.ismailhakkiaydin.edittextcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editUser, editPassword;

    private void init(){

        editUser = findViewById(R.id.editUser);
        editPassword = findViewById(R.id.editPassword);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        pressedEnter();

    }

    public void clickCancel(View view){

        this.finish();

    }

    public void clickLogin(View view){

        String user = editUser.getText().toString();
        String pass = editPassword.getText().toString();

        if (user.equals("iha")&&pass.equals("ihaydin")){
            this.setTitle("Login is succesfull");
        }
        else{
           // Toast.makeText(this,"Login Failed!!!",Toast.LENGTH_LONG).show();
            Toast t;
            t=Toast.makeText(this,"Login Failed!!!",Toast.LENGTH_LONG);
            t.show();
        }


    }

    private void pressedEnter(){
        editPassword.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {

                if(i == KeyEvent.KEYCODE_ENTER){
                    MainActivity.this.setTitle(editPassword.getText().toString());
                    return true;
                }

                return false;
            }
        });
    }

}
