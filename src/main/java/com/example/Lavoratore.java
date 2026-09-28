package com.example;

import java.util.Random;

public class Lavoratore implements Runnable{  
    private Contatore c;
    private String nome; 
    public Lavoratore(Contatore c, String nome){
        this.c = c;
        this.nome = nome;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while(c.incrementa(this.nome)){
            try{
                int nRandom = rand.nextInt((500 - 100) + 1) + 100;
                Thread.sleep(nRandom);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }   
        }
    }
}
