package com.example.trabalho_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText edtCep;
    private Button btnEnviar;
    private TextView tvDados;
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.idbtnKey);
        edtCep = findViewById(R.id.edtTextKey);
        tvDados = findViewById(R.id.txtViewKey);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solicitarCotacao();
            }
        });

        //inicializar retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl("http://data.fixer.io/api/")                                       //parte estatica do endpoint
                .addConverterFactory(GsonConverterFactory.create())                         //biblioteca de conversao para json
                .build();
    }//fim onCreate

    private void solicitarCotacao() {

        cotacaoService service = retrofit.create(cotacaoService.class);

        Call<Cotacao> call = service.getCotacao();

        call.enqueue(new Callback<Cotacao>() {
            @Override
            public void onResponse(Call<Cotacao> call, Response<Cotacao> response) {
                if (response.isSuccessful()) {
                    Cotacao cotacao = response.body();

                    String strCotacao = "Base: " + cotacao.getBase() + "\n" +
                            "Date: " + cotacao.getDate() + "\n" +
                            "USD: " + cotacao.getRates().getUSD() + "\n" +
                            "AUD: " + cotacao.getRates().getAUD() + "\n" +
                            "CAD: " + cotacao.getRates().getCAD() + "\n" +
                            "MXN: " + cotacao.getRates().getMXN() + "\n" +
                            "BRL: " + cotacao.getRates().getBRL() + "\n" +
                            "PLN: " + cotacao.getRates().getPLN();

                    tvDados.setText(strCotacao);
                }
            }

            @Override
            public void onFailure(Call<Cotacao> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Não foi possível realizar a requisição", Toast.LENGTH_SHORT).show();
            }
        });

    }//fim solicitarCotacao
}//fim MainActivity