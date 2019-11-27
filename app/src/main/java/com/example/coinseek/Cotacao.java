package com.example.coinseek;

    /** Exemplo do Retorno
         {
         "success": true,
         "timestamp": 1574792046,
         "base": "EUR",
         "date": "2019-11-26",
         "rates": {
         "ARS": 66.045879,
         "AUD": 1.623833,
         "BOB": 7.620355,
         "BRL": 4.706576,
         "BTC": 0.000156,
         "CAD": 1.463267,
         "CHF": 1.099071,
         "CLP": 881.021272,
         "CNY": 7.750445,
         "COP": 3778.394926,
         "EGP": 17.763592,
         "EUR": 1,
         "GBP": 0.856972,
         "HKD": 8.626535,
         "INR": 78.785434,
         "JPY": 120.220301,
         "KPW": 991.793437,
         "KRW": 1293.173177,
         "MXN": 21.51953,
         "NZD": 1.715257,
         "PEN": 3.725085,
         "PYG": 7099.721291,
         "RUB": 70.49647,
         "SEK": 10.567426,
         "SGD": 1.503306,
         "USD": 1.101933,
         "UYU": 41.635903,
         "VEF": 11.005558,
         "XAG": 0.064535,
         "XAU": 0.000755,
         "XCD": 2.978028
         }
         }
     */

import com.google.gson.annotations.SerializedName;

public class Cotacao {

    @SerializedName("success")
    private Boolean success;
    @SerializedName("timestamp")
    private Integer timestamp;
    @SerializedName("base")
    private String base;
    @SerializedName("date")
    private String date;
    @SerializedName("rates")
    private Rates rates;

    public Cotacao() {
    }

    public Cotacao(Boolean success, Integer timestamp, String base, String date, Rates rates) {
        super();
        this.success = success;
        this.timestamp = timestamp;
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

}
