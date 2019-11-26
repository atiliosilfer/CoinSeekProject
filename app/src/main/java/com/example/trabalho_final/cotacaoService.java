package com.example.trabalho_final;

import retrofit2.Call;
import retrofit2.http.GET;


public interface cotacaoService {

    @GET("latest?access_key=7e31d08d185893a4d2d05a1c0473541f&symbols=ARS,BRL,BTC,CAD,CNY,EUR,GBP,JPY,RUB,USD,XAU")
    Call<Cotacao> getCotacao();
}