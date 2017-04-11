package br.projecao.barbaradanielesilva.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.projecao.barbaradanielesilva.R;

public class CadastroActivity extends AppCompatActivity {

    private Button btCadastrar;
    private EditText txNome;
    private EditText txIdade ;
    private EditText txPeso ;
    private EditText txAltura ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btCadastrar = (Button) findViewById(R.id.btCadastrar);
        txNome = (EditText) findViewById(R.id.txNome);
        txIdade = (EditText) findViewById(R.id.txIdade);
        txAltura = (EditText) findViewById(R.id.txAltura);
        txPeso = (EditText) findViewById(R.id.txPeso);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Integer idade = Integer.parseInt(txIdade.getText().toString());
                Float altura = Float.parseFloat(txAltura.getText().toString());
                Float peso = Float.parseFloat(txPeso.getText().toString());

                Float imc = peso/(altura*altura);

                String grau = null;

                if(imc<18) {
                    grau = "Magresa";
                }else if(imc >= 18 && imc <=25){
                    grau = "Normal";
                }else if(imc >=26 && imc <= 30){
                    grau = "Sobrepeso";
                }else if(imc >=31 && imc <=35){
                    grau = "Obesidade Grau I";
                }else if(imc >=36 && imc <=40){
                    grau = "Obesidade Grau II";
                }else if( imc >40) {
                    grau = "Obesidade Morbida";
                }

                Intent resultado = new Intent(getBaseContext(), InformacaoActivity.class);
                resultado.putExtra("nome", txNome.getText().toString());
                resultado.putExtra("idade",idade);
                resultado.putExtra("altura",altura);
                resultado.putExtra("peso",peso);
                resultado.putExtra("imc",imc);
                resultado.putExtra("grau", grau);

                startActivity(resultado);
            }
        });
    }
}
