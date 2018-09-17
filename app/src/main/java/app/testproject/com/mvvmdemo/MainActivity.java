package app.testproject.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import app.testproject.com.mvvmdemo.commands.UserLogin;
import app.testproject.com.mvvmdemo.databinding.ActivityMainBinding;
import app.testproject.com.mvvmdemo.model.User;
import app.testproject.com.mvvmdemo.viewmodel.UserModel;


/**
 * This application shows a simple login screen dev using MVVM Design pattern.
 */
public class MainActivity extends AppCompatActivity {
    
    private ActivityMainBinding activityMainBinding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserModel userModel = new UserModel(new User("Enter your email", "Enter password"));
        activityMainBinding.setLogin(userModel);
        activityMainBinding.setLoginEvent(new UserLogin() {
            @Override
            public void loginClicked() {
                Toast.makeText(getApplicationContext(), activityMainBinding.getLogin().getEmail(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
