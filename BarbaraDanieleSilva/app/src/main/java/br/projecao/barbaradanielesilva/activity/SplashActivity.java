package br.projecao.barbaradanielesilva.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.projecao.barbaradanielesilva.R;
import br.projecao.barbaradanielesilva.activity.MainActivity;

public class SplashActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(this, 4000);
    }


    public void run(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
