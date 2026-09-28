package com.example;

public class Contatore {
    private int valore;
    private int valoreMassimo;

    public Contatore(int valoreMassimo){
        this.valore = 0;
        this.valoreMassimo = valoreMassimo;
    }

    public synchronized boolean incrementa(String nomeThread){
        if(this.valore < this.valoreMassimo){
            this.valore ++;
            System.out.println(nomeThread + " ha incrementato il contatore a: " + this.valore);
            return true;
        }
        return false;
    }

}
