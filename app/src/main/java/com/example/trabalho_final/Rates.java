package com.example.trabalho_final;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rates {

    @SerializedName("ARS")
    @Expose
    private Double aRS;
    @SerializedName("BRL")
    @Expose
    private Double bRL;
    @SerializedName("BTC")
    @Expose
    private Double bTC;
    @SerializedName("CAD")
    @Expose
    private Double cAD;
    @SerializedName("CNY")
    @Expose
    private Double cNY;
    @SerializedName("EUR")
    @Expose
    private Integer eUR;
    @SerializedName("GBP")
    @Expose
    private Double gBP;
    @SerializedName("JPY")
    @Expose
    private Double jPY;
    @SerializedName("RUB")
    @Expose
    private Double rUB;
    @SerializedName("USD")
    @Expose
    private Double uSD;
    @SerializedName("XAU")
    @Expose
    private Double xAU;

    public Double getARS() {
        return aRS;
    }

    public void setARS(Double aRS) {
        this.aRS = aRS;
    }

    public Double getBRL() {
        return bRL;
    }

    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    public Double getBTC() {
        return bTC;
    }

    public void setBTC(Double bTC) {
        this.bTC = bTC;
    }

    public Double getCAD() {
        return cAD;
    }

    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    public Double getCNY() {
        return cNY;
    }

    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    public Integer getEUR() {
        return eUR;
    }

    public void setEUR(Integer eUR) {
        this.eUR = eUR;
    }

    public Double getGBP() {
        return gBP;
    }

    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    public Double getJPY() {
        return jPY;
    }

    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getUSD() {
        return uSD;
    }

    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getXAU() {
        return xAU;
    }

    public void setXAU(Double xAU) {
        this.xAU = xAU;
    }
}
