package util.funcoes;

import Modelo.Resultado;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleColors {
    private static final String RED = "\033[1;91m";     // RED
    private static final String GREEN = "\033[1;92m";   // GREEN
    private static final String BLUE = "\033[1;94m";    // BLUE
    private static final String WHITE = "\033[1;97m";   // WHITE
    private static final String PURPLE = "\033[1;95m";  // PURPLE



    public void mensagemVermelha(String texto){
        System.out.println(ConsoleColors.RED + texto + ConsoleColors.WHITE + "\n");
    };

    public void padraoTexto(String mensagem){
        System.out.println(ConsoleColors.WHITE + mensagem);
    }

    public String formataResultado(String jogador,Long acertos ,Date dataDaPartida){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataPartida = formato.format(dataDaPartida);
        return "JOGADOR: " + ConsoleColors.BLUE + jogador
            + ConsoleColors.WHITE + " ACERTOS: " + ConsoleColors.GREEN + acertos
            + ConsoleColors.WHITE + " DATA: " + ConsoleColors.PURPLE + dataPartida
            + ConsoleColors.WHITE;
    }

    public void respostaCorreta(){
        System.out.println(ConsoleColors.GREEN + "Muito bem, você acertou !" + ConsoleColors.WHITE);
    }

    public void respostaErrada(){
        System.out.println(ConsoleColors.RED + "Que pena, você errou." + ConsoleColors.WHITE);
    }

    public void semPerguntas(){
        System.out.println(ConsoleColors.BLUE + "No momento, o nosso Quíz ainda não possui nenhuma pergunta,"
                + " por favor, volte mais tarde !" + ConsoleColors.WHITE);
    }

    public void semPlacar(){
        System.out.println(ConsoleColors.BLUE + "Ninguém completou o Quiz ainda, seja o primeiro. :)\n\n" + ConsoleColors.WHITE);
    }
    public String formataResultado(Resultado r){
     return "JOGADOR: " + ConsoleColors.BLUE + r.getJogador()
                + ConsoleColors.WHITE + " ACERTOS: " + ConsoleColors.GREEN + r.getAcertos()
                + ConsoleColors.WHITE + " ERROS: " + ConsoleColors.RED + r.getErros() + ConsoleColors.WHITE + "\n\n";

    }


}
