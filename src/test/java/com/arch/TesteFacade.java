package com.arch;

public class TesteFacade {
    public static void main(String[] args) {
        CervejariaFachada cervejaria = new CervejariaFachada();
        cervejaria.produzirCerveja("IPA", 14);
    }
}