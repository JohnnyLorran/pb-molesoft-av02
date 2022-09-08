package util.funcoes;

import java.util.Scanner;

public class EntradaUsuario {

    Scanner scanner = new Scanner(System.in);
    ConsoleColors consoleColors = new ConsoleColors();

    public int lerInteger(){
        try {
            int numero = Integer.parseInt(scanner.nextLine());
            if(numero > 2){
                consoleColors.mensagemVermelha("O valor digitado ["+ numero + "] é diferente do menu de opções !");
                return -1;
            }
            return numero;
        }catch (Exception e){
            consoleColors.mensagemVermelha("Digite apenas o número da opção que deseja.");
            return -1;
        }
    }

    public  String lerStringResposta(){
        String texto;
        do {
            try {
                texto = scanner.nextLine().toLowerCase();
                //Se for verdadeiro a condição do if, retorna a String texto, se for falso, continua no loop
                if("verdadeiro".equals(texto) || "falso".equals(texto)) {
                    return texto;
                }else{
                    texto = "erro";
                }
                consoleColors.mensagemVermelha("Resposta fora do padrão. Tente 'verdadeiro' ou 'falso'. ");
            } catch (Exception e) {
                consoleColors.mensagemVermelha("Opçoes válidas: 'verdadeiro' ou 'falso'.");
                texto = "erro";
            }
            System.out.print("Resposta: ");
        }while("erro".equals(texto));

        return texto;
    }

    public String lerString() {
        String texto;
        do {
            try {
                texto = scanner.nextLine();
                if ("".equals(texto)) {
                    texto = "erro";
                }
            } catch (Exception e) {
                consoleColors.mensagemVermelha("Erro( " + e + " ) ao ler a informação, contate o Administrador.");
                return "erro";
            }
        } while ("erro".equals(texto));

        return texto;
    }

}
