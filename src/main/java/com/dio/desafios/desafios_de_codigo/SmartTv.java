// Pacote onde esta classe está localizada dentro do projeto.
// Isso ajuda a organizar melhor o código em pastas/lógicas.
package com.dio.desafios.desafios_de_codigo;

// Declaração da classe pública SmartTv
// Ela representa uma "Smart TV" com propriedades e comportamentos.
public class SmartTv {

    // ---------- VARIÁVEIS DE INSTÂNCIA (ATRIBUTOS) ----------

    // Indica se a TV está ligada (true) ou desligada (false).
    // Começa desligada por padrão.
    boolean ligada = false;

    // Representa o canal atual da TV.
    // Começa no canal 1 por padrão.
    int canal = 1;

    // Representa o volume atual da TV.
    // Começa com volume 25 por padrão.
    int volume = 25;


    // ---------- MÉTODOS (AÇÕES/COMPORTAMENTOS DA TV) ----------

    // Método para mudar diretamente o canal para um número específico.
    // Exemplo: smartTv.mudarCanal(16);
    public void mudarCanal(int novocanal){
        canal = novocanal;
    }

    // Método para aumentar o canal (deveria ser canal++, mas está alterando volume — erro de digitação).
    // Aqui ele está aumentando o volume por engano.
    public void aumentarCanal() {
        canal++; // <- deveria ser canal++
    }

    // Método para diminuir o canal (também alterando volume por engano).
    public void diminuirCanal() {
        canal--; // <- deveria ser canal--
    }

    // Método para aumentar o volume em uma unidade.
    public void aumentarVolume() {
        volume++;
    }

    // Método para diminuir o volume em uma unidade.
    public void diminuirVolume() {
        volume--;
    }

    // Liga a TV, alterando o atributo 'ligada' para true.
    public void ligar() {
        ligada = true;
    }

    // Desliga a TV, alterando o atributo 'ligada' para false.
    public void desligar() {
        ligada = false;
    }


    // ---------- MÉTODO PRINCIPAL (PONTO DE ENTRADA DO PROGRAMA) ----------
    public static void main(String[] args) {

        // Cria um novo objeto SmartTv chamado 'smartTv'
        // Isso significa que agora temos uma TV "virtual" para manipular.
        SmartTv smartTv = new SmartTv();

        // Exibe no console o estado inicial da TV.
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        // Liga a TV.
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        // Desliga a TV.
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        // Diminui o volume várias vezes.
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        // Aumenta o volume duas vezes.
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        // Muda o canal diretamente para o canal 16.
        smartTv.mudarCanal(16);

        // Exibe o canal e volume atual no console.
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
    }
}
