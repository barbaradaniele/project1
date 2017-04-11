package br.projecao.barbaradanielesilva.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.projecao.barbaradanielesilva.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button finalizar = (Button) findViewById(R.id.btFinalizar);
        final Button iniciar = (Button) findViewById(R.id.btIniciar);

        finalizar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                finish();
                Toast.makeText(getApplicationContext(), "App Finalizado com Sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

        iniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(it);
            }
        });
    }
}
