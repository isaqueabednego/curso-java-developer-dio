
package com.dio.desafios.desafios_de_codigo;


public class SmartTv {

    boolean ligada = false;

    int canal = 1;


    int volume = 25;


    public void mudarCanal(int novocanal){
        canal = novocanal;
    }


    public void aumentarCanal() {
        canal++;
    }


    public void diminuirCanal() {
        canal--;
    }


    public void aumentarVolume() {
        volume++;
    }


    public void diminuirVolume() {
        volume--;
    }


    public void ligar() {
        ligada = true;
    }


    public void desligar() {
        ligada = false;
    }


    public static void main(String[] args) {


        SmartTv smartTv = new SmartTv();


        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);


        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();


        smartTv.aumentarVolume();



        smartTv.mudarCanal(16);


        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
    }
}

