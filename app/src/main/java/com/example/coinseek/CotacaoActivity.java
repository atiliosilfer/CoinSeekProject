package com.example.coinseek;

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

public class CotacaoActivity extends AppCompatActivity {

    private EditText edtCep;
    private Button btnEnviar;
    private TextView tvDados;
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotacao);

        setupActivity();
//        setupToolbar();
        solicitarCotacao();


        //inicializar retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl("http://data.fixer.io/api/")                                       //parte estatica do endpoint
                .addConverterFactory(GsonConverterFactory.create())                         //biblioteca de conversao para json
                .build();
    }

    private void setupActivity() {
        btnEnviar = findViewById(R.id.idbtnKey);
        edtCep = findViewById(R.id.edtTextKey);
        tvDados = findViewById(R.id.txtViewKey);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solicitarCotacao();
            }
        });
    }

    private void solicitarCotacao() {

        APIService service = retrofit.create(APIService.class);

        Call<Cotacao> call = service.getCotacao();

        call.enqueue(new Callback<Cotacao>() {
            @Override
            public void onResponse(Call<Cotacao> call, Response<Cotacao> response) {
                if (response.isSuccessful()) {
                    Cotacao cotacao = response.body();

                    String strCotacao = "Base: " + cotacao.getBase() + "\n" +
                            "Date: " + cotacao.getDate() + "\n" +
                            "ARS: " + cotacao.getRates().getARS() + "\n" +
                            "AUD: " + cotacao.getRates().getAUD() + "\n" +
                            "BOB: " + cotacao.getRates().getBOB() + "\n" +
                            "BRL: " + cotacao.getRates().getBRL() + "\n" +
                            "BTC: " + cotacao.getRates().getBTC() + "\n" +
                            "CAD: " + cotacao.getRates().getCAD() + "\n" +
                            "CHF: " + cotacao.getRates().getCHF() + "\n" +
                            "CLP: " + cotacao.getRates().getCLP() + "\n" +
                            "CNY: " + cotacao.getRates().getCNY() + "\n" +
                            "COP: " + cotacao.getRates().getCOP() + "\n" +
                            "EGP: " + cotacao.getRates().getEGP() + "\n" +
                            "EUR: " + cotacao.getRates().getEUR() + "\n" +
                            "GBP: " + cotacao.getRates().getGBP() + "\n" +
                            "HKD: " + cotacao.getRates().getHKD() + "\n" +
                            "INR: " + cotacao.getRates().getINR() + "\n" +
                            "JPY: " + cotacao.getRates().getJPY() + "\n" +
                            "KPW: " + cotacao.getRates().getKPW() + "\n" +
                            "KRW: " + cotacao.getRates().getKRW() + "\n" +
                            "MXN: " + cotacao.getRates().getMXN() + "\n" +
                            "NZD: " + cotacao.getRates().getNZD() + "\n" +
                            "PEN: " + cotacao.getRates().getPEN() + "\n" +
                            "PYG: " + cotacao.getRates().getPYG() + "\n" +
                            "RUB: " + cotacao.getRates().getRUB() + "\n" +
                            "SEK: " + cotacao.getRates().getSEK() + "\n" +
                            "SGD: " + cotacao.getRates().getSGD() + "\n" +
                            "USD: " + cotacao.getRates().getUSD() + "\n" +
                            "UYU: " + cotacao.getRates().getUYU() + "\n" +
                            "VEF: " + cotacao.getRates().getVEF() + "\n" +
                            "XAG: " + cotacao.getRates().getXAG() + "\n" +
                            "XAU: " + cotacao.getRates().getXAU() + "\n" +
                            "XCD: " + cotacao.getRates().getXCD();
                    ;

                    tvDados.setText(strCotacao);
                }
            }

            @Override
            public void onFailure(Call<Cotacao> call, Throwable t) {
                Toast.makeText(CotacaoActivity.this, "Não foi possível realizar a requisição", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
