// Pacote onde esta classe está localizada dentro do projeto.
// Ajuda a organizar melhor o código em pastas/lógicas.
package com.dio.desafios.desafios_de_codigo;

// Declaração da classe pública SmartTv.
// Representa uma "Smart TV" com atributos e comportamentos.
public class SmartTv {

    // VARIÁVEIS DE INSTÂNCIA (ATRIBUTOS)

    // Indica se a TV está ligada (true) ou desligada (false).
    // Inicialmente, a TV começa desligada.
    boolean ligada = false;

    // Representa o canal atual da TV.
    // Inicialmente, começa no canal 1.
    int canal = 1;

    // Representa o volume atual da TV.
    // Inicialmente, começa no volume 25.
    int volume = 25;

    // MÉTODOS (AÇÕES/COMPORTAMENTOS DA TV)

    // Altera o canal da TV para um número específico.
    // Exemplo: smartTv.mudarCanal(16);
    public void mudarCanal(int novocanal){
        canal = novocanal;
    }

    // Aumenta o canal em 1.
    public void aumentarCanal() {
        canal++;
    }

    // Diminui o canal em 1.
    public void diminuirCanal() {
        canal--;
    }

    // Aumenta o volume em 1.
    public void aumentarVolume() {
        volume++;
    }

    // Diminui o volume em 1.
    public void diminuirVolume() {
        volume--;
    }

    // Liga a TV (atributo 'ligada' recebe true).
    public void ligar() {
        ligada = true;
    }

    // Desliga a TV (atributo 'ligada' recebe false).
    public void desligar() {
        ligada = false;
    }

    // ---------- MÉTODO PRINCIPAL (PONTO DE ENTRADA DO PROGRAMA) ----------
    public static void main(String[] args) {

        // Cria um objeto SmartTv chamado 'smartTv'.
        // Esse objeto será usado para chamar métodos e alterar atributos.
        SmartTv smartTv = new SmartTv();

        // Exibe o estado inicial da TV no console.
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        // Liga a TV e exibe o novo status.
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        // Desliga a TV e exibe o novo status.
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        // Diminui o volume duas vezes para simular ajuste.
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        // Aumenta o volume duas vezes para simular ajuste.
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        // Muda o canal diretamente para o canal 16.
        smartTv.mudarCanal(16);

        // Exibe o canal e volume final no console.
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
    }
}

