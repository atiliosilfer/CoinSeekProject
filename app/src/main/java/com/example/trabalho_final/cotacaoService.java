package com.example.trabalho_final;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface cotacaoService {
    @GET("latest?access_key=7e31d08d185893a4d2d05a1c0473541f&symbols= ARS,AUD,BOB,BRL,BTC,CAD,CHF,CLP,CNY,COP,EGP,EUR,GBP,HKD,INR,JPY,KPW,KRW,MXN,NZD,PEN,PYG,RUB,SEK,SGD,USD,UYU,VEF,XAG,XAU,XCD")
    Call<Cotacao> getCotacao();
}
