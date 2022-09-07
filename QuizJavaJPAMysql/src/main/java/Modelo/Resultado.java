package Modelo;


import util.funcoes.ConsoleColors;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "resultados")
public class Resultado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jogador;
    private Long acertos;
    private Long erros;
    private Date dataDaPartida = Date.valueOf(LocalDate.now());

    public Resultado(){}

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public void setAcertos(Long acertos) {
        this.acertos = acertos;
    }

    public void setErros(Long erros) {this.erros = erros;}

    public Long getAcertos() {
        return acertos;
    }

    public Long getErros() {return erros;}

    @Override
    public String toString() {
        ConsoleColors consoleColors = new ConsoleColors();
        return consoleColors.formataResultado(this.jogador,this.acertos,this.dataDaPartida);
    }
}
