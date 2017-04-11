package br.projecao.barbaradanielesilva.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

import br.projecao.barbaradanielesilva.R;

public class InformacaoActivity extends AppCompatActivity {

    private TextView txNome;
    private TextView txIdade ;
    private TextView txPeso ;
    private TextView txAltura ;
    private TextView txImc;
    private TextView txObesidadeGrau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao);

        txNome = (TextView) findViewById(R.id.txNome);
        txIdade = (TextView) findViewById(R.id.txIdade);
        txAltura = (TextView) findViewById(R.id.txAltura);
        txPeso = (TextView) findViewById(R.id.txPeso);
        txImc = (TextView) findViewById(R.id.txImc);
        txObesidadeGrau = (TextView) findViewById(R.id.txObesidadeGrau);

        String nome = getIntent().getStringExtra("nome");
        String idade = getIntent().getStringExtra("idade");
        String altura = getIntent().getStringExtra("altura");
        String peso = getIntent().getStringExtra("peso");
        String imc = getIntent().getStringExtra("imc");
        String grau = getIntent().getStringExtra("grau");

        txNome.setText(nome);
        txIdade.setText("Idade: " + getIntent().getIntExtra("idade", 1));
        txAltura.setText("Altura: " + getIntent().getFloatExtra("altura", 2));
        txPeso.setText("Peso: "+ getIntent().getFloatExtra("peso", 2) + "KG");
        DecimalFormat df = new DecimalFormat("0.00");
        txImc.setText("IMC: " + df.format(getIntent().getFloatExtra("imc", 2)));
        txObesidadeGrau.setText(grau);


    }
}
