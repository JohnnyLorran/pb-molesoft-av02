package aplicacao;


import Modelo.Questao;
import Modelo.Resultado;
import dao.QuestaoDAO;
import dao.ResultadoDAO;
import util.funcoes.ConsoleColors;
import util.funcoes.EntradaUsuario;

import java.util.List;

public class RodaQuiz {

    public void iniciar(){
        EntradaUsuario entradaUsuario = new EntradaUsuario();
        ConsoleColors consoleColors = new ConsoleColors();
        ResultadoDAO resultadoDAO = new ResultadoDAO();
        int menuOpcoes = 0;

        do{
            consoleColors.padraoTexto("1 - Jogar novamente");
            System.out.println("2 - Ver placar");
            System.out.println("0 - Sair\n");
            System.out.print("Opção: ");
            menuOpcoes = entradaUsuario.lerInteger();

            if(menuOpcoes ==  1){
                System.out.print("\n\n\nDigite o nome do jogador: ");

                Resultado resultado = new Resultado();
                resultado.setJogador(entradaUsuario.lerString());
                resultado.setAcertos(0L);
                resultado.setErros(0L);

                QuestaoDAO questaoDAO = new QuestaoDAO();
                List<Questao> listaQuestoes =  questaoDAO.listarQuestoes();

                if(listaQuestoes.size() <= 0 ) {
                    consoleColors.semPerguntas();
                }else{
                        listaQuestoes.forEach(q -> {
                        System.out.println("\n\n" + q.getPergunta());
                        System.out.print("Resposta: ");
                        String resposta = entradaUsuario.lerStringResposta();
                        boolean converteResposta;

                        if ("verdadeiro".equals(resposta)) {
                            converteResposta = true;
                        } else {
                            converteResposta = false;
                        }

                        if (converteResposta == q.getVerdadeira()) {
                            resultado.setAcertos(resultado.getAcertos() + 1L);
                            consoleColors.respostaCorreta();
                        } else {
                            resultado.setErros(resultado.getErros() + 1L);
                            consoleColors.respostaErrada();
                        }
                    });
                    resultadoDAO.adicionarNovoResultado(resultado);
                    questaoDAO.fechaEntity();
                }
                System.out.println("\n\nFim de jogo !!\n\n");


            }else if(menuOpcoes == 2) {
                List<Resultado> resultadoList = resultadoDAO.verPlacar();

                if (resultadoList.size() <= 0 ) {
                    consoleColors.semPlacar();
                }else{
                    System.out.println("\n\n\nPLACAR");
                    resultadoList.forEach(r -> System.out.println(r));
                    System.out.println("\n\n\n");
                }
            }

        }while(menuOpcoes != 0);

        resultadoDAO.fechaEntity();

    }
}
