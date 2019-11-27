package com.example.coinseek;

import android.os.Bundle;
import android.util.Pair;
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

import java.util.ArrayList;

public class CotacaoActivity extends AppCompatActivity {

    ArrayList<Pair<String,Double>> cotacoes = new ArrayList();

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

                    cotacoes.add( Pair.create("Argentine Peso",cotacao.getRates().getARS()));
                    cotacoes.add( Pair.create("Australian Dollar",cotacao.getRates().getAUD()));
                    cotacoes.add( Pair.create("Bolivian Boliviano",cotacao.getRates().getBOB()));
                    cotacoes.add( Pair.create("Brazilian Real",cotacao.getRates().getBRL()));
                    cotacoes.add( Pair.create("Bitcoin",cotacao.getRates().getBTC()));
                    cotacoes.add( Pair.create("Canadian Dollar",cotacao.getRates().getCAD()));
                    cotacoes.add( Pair.create("Swiss Franc",cotacao.getRates().getCHF()));
                    cotacoes.add( Pair.create("Chilean Peso",cotacao.getRates().getCLP()));
                    cotacoes.add( Pair.create("Chinese Yuan",cotacao.getRates().getCNY()));
                    cotacoes.add( Pair.create("Colombian Peso",cotacao.getRates().getCOP()));
                    cotacoes.add( Pair.create("Egyptian Pound",cotacao.getRates().getEGP()));
                    cotacoes.add( Pair.create("British Pound Sterling",cotacao.getRates().getGBP()));
                    cotacoes.add( Pair.create("Hong Kong Dollar",cotacao.getRates().getHKD()));
                    cotacoes.add( Pair.create("Indian Rupee",cotacao.getRates().getINR()));
                    cotacoes.add( Pair.create("Japanese Yen",cotacao.getRates().getJPY()));
                    cotacoes.add( Pair.create("North Korean Won",cotacao.getRates().getKPW()));
                    cotacoes.add( Pair.create("South Korean Won",cotacao.getRates().getKRW()));
                    cotacoes.add( Pair.create("Mexican Peso",cotacao.getRates().getMXN()));
                    cotacoes.add( Pair.create("New Zealand Dollar",cotacao.getRates().getNZD()));
                    cotacoes.add( Pair.create("Peruvian Nuevo Sol",cotacao.getRates().getPEN()));
                    cotacoes.add( Pair.create("Paraguayan Guarani",cotacao.getRates().getPYG()));
                    cotacoes.add( Pair.create("Russian Ruble",cotacao.getRates().getRUB()));
                    cotacoes.add( Pair.create("Swedish Krona",cotacao.getRates().getSEK()));
                    cotacoes.add( Pair.create("Singapore Dollar",cotacao.getRates().getSGD()));
                    cotacoes.add( Pair.create("United States Dollar",cotacao.getRates().getUSD()));
                    cotacoes.add( Pair.create("Uruguayan Peso",cotacao.getRates().getUYU()));
                    cotacoes.add( Pair.create("Venezuelan Bolívar Fuerte",cotacao.getRates().getVEF()));
                    cotacoes.add( Pair.create("Silver (troy ounce)",cotacao.getRates().getXAG()));
                    cotacoes.add( Pair.create("Gold (troy ounce)",cotacao.getRates().getXAU()));
                    cotacoes.add( Pair.create("East Caribbean Dollar",cotacao.getRates().getXCD()));


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
