package com.example.trabalho_final;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rates {

    @SerializedName("ARS")
    @Expose
    private Double aRS;
    @SerializedName("AUD")
    @Expose
    private Double aUD;
    @SerializedName("BOB")
    @Expose
    private Double bOB;
    @SerializedName("BRL")
    @Expose
    private Double bRL;
    @SerializedName("BTC")
    @Expose
    private Double bTC;
    @SerializedName("CAD")
    @Expose
    private Double cAD;
    @SerializedName("CHF")
    @Expose
    private Double cHF;
    @SerializedName("CLP")
    @Expose
    private Double cLP;
    @SerializedName("CNY")
    @Expose
    private Double cNY;
    @SerializedName("COP")
    @Expose
    private Double cOP;
    @SerializedName("EGP")
    @Expose
    private Double eGP;
    @SerializedName("EUR")
    @Expose
    private Integer eUR;
    @SerializedName("GBP")
    @Expose
    private Double gBP;
    @SerializedName("HKD")
    @Expose
    private Double hKD;
    @SerializedName("INR")
    @Expose
    private Double iNR;
    @SerializedName("JPY")
    @Expose
    private Double jPY;
    @SerializedName("KPW")
    @Expose
    private Double kPW;
    @SerializedName("KRW")
    @Expose
    private Double kRW;
    @SerializedName("MXN")
    @Expose
    private Double mXN;
    @SerializedName("NZD")
    @Expose
    private Double nZD;
    @SerializedName("PEN")
    @Expose
    private Double pEN;
    @SerializedName("PYG")
    @Expose
    private Double pYG;
    @SerializedName("RUB")
    @Expose
    private Double rUB;
    @SerializedName("SEK")
    @Expose
    private Double sEK;
    @SerializedName("SGD")
    @Expose
    private Double sGD;
    @SerializedName("USD")
    @Expose
    private Double uSD;
    @SerializedName("UYU")
    @Expose
    private Double uYU;
    @SerializedName("VEF")
    @Expose
    private Double vEF;
    @SerializedName("XAG")
    @Expose
    private Double xAG;
    @SerializedName("XAU")
    @Expose
    private Double xAU;
    @SerializedName("XCD")
    @Expose
    private Double xCD;

    /**
     * No args constructor for use in serialization
     *
     */
    public Rates() {
    }

    /**
     *
     * @param hKD
     * @param eUR
     * @param cOP
     * @param cAD
     * @param uSD
     * @param eGP
     * @param bTC
     * @param uYU
     * @param sGD
     * @param vEF
     * @param pEN
     * @param sEK
     * @param xCD
     * @param nZD
     * @param bRL
     * @param xAG
     * @param cHF
     * @param mXN
     * @param aRS
     * @param cLP
     * @param iNR
     * @param xAU
     * @param cNY
     * @param aUD
     * @param kRW
     * @param jPY
     * @param kPW
     * @param bOB
     * @param gBP
     * @param rUB
     * @param pYG
     */
    public Rates(Double aRS, Double aUD, Double bOB, Double bRL, Double bTC, Double cAD, Double cHF, Double cLP, Double cNY, Double cOP, Double eGP, Integer eUR, Double gBP, Double hKD, Double iNR, Double jPY, Double kPW, Double kRW, Double mXN, Double nZD, Double pEN, Double pYG, Double rUB, Double sEK, Double sGD, Double uSD, Double uYU, Double vEF, Double xAG, Double xAU, Double xCD) {
        super();
        this.aRS = aRS;
        this.aUD = aUD;
        this.bOB = bOB;
        this.bRL = bRL;
        this.bTC = bTC;
        this.cAD = cAD;
        this.cHF = cHF;
        this.cLP = cLP;
        this.cNY = cNY;
        this.cOP = cOP;
        this.eGP = eGP;
        this.eUR = eUR;
        this.gBP = gBP;
        this.hKD = hKD;
        this.iNR = iNR;
        this.jPY = jPY;
        this.kPW = kPW;
        this.kRW = kRW;
        this.mXN = mXN;
        this.nZD = nZD;
        this.pEN = pEN;
        this.pYG = pYG;
        this.rUB = rUB;
        this.sEK = sEK;
        this.sGD = sGD;
        this.uSD = uSD;
        this.uYU = uYU;
        this.vEF = vEF;
        this.xAG = xAG;
        this.xAU = xAU;
        this.xCD = xCD;
    }

    public Double getARS() {
        return aRS;
    }

    public void setARS(Double aRS) {
        this.aRS = aRS;
    }

    public Double getAUD() {
        return aUD;
    }

    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    public Double getBOB() {
        return bOB;
    }

    public void setBOB(Double bOB) {
        this.bOB = bOB;
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

    public Double getCHF() {
        return cHF;
    }

    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    public Double getCLP() {
        return cLP;
    }

    public void setCLP(Double cLP) {
        this.cLP = cLP;
    }

    public Double getCNY() {
        return cNY;
    }

    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    public Double getCOP() {
        return cOP;
    }

    public void setCOP(Double cOP) {
        this.cOP = cOP;
    }

    public Double getEGP() {
        return eGP;
    }

    public void setEGP(Double eGP) {
        this.eGP = eGP;
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

    public Double getHKD() {
        return hKD;
    }

    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    public Double getINR() {
        return iNR;
    }

    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    public Double getJPY() {
        return jPY;
    }

    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getKPW() {
        return kPW;
    }

    public void setKPW(Double kPW) {
        this.kPW = kPW;
    }

    public Double getKRW() {
        return kRW;
    }

    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    public Double getMXN() {
        return mXN;
    }

    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    public Double getNZD() {
        return nZD;
    }

    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    public Double getPEN() {
        return pEN;
    }

    public void setPEN(Double pEN) {
        this.pEN = pEN;
    }

    public Double getPYG() {
        return pYG;
    }

    public void setPYG(Double pYG) {
        this.pYG = pYG;
    }

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getSEK() {
        return sEK;
    }

    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    public Double getSGD() {
        return sGD;
    }

    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    public Double getUSD() {
        return uSD;
    }

    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    public Double getUYU() {
        return uYU;
    }

    public void setUYU(Double uYU) {
        this.uYU = uYU;
    }

    public Double getVEF() {
        return vEF;
    }

    public void setVEF(Double vEF) {
        this.vEF = vEF;
    }

    public Double getXAG() {
        return xAG;
    }

    public void setXAG(Double xAG) {
        this.xAG = xAG;
    }

    public Double getXAU() {
        return xAU;
    }

    public void setXAU(Double xAU) {
        this.xAU = xAU;
    }

    public Double getXCD() {
        return xCD;
    }

    public void setXCD(Double xCD) {
        this.xCD = xCD;
    }

}
