package Modelo;

import javax.persistence.*;

@Entity
@Table(name ="questoes")
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pergunta;
    private boolean verdadeira;
    private boolean ativa;

    public Questao(){

    }

    public Questao(String pergunta, boolean verdadeira, boolean ativa){
        this.pergunta = pergunta;
        this.verdadeira = verdadeira;
        this.ativa = ativa;
    }

    public String getPergunta() {
        return pergunta;
    }

    public boolean getVerdadeira() {
        return verdadeira;
    }

    public boolean getAtiva() {
        return ativa;
    }
}
