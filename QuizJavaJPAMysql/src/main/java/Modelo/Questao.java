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

    public Questao(){}

    public String getPergunta() {return pergunta;}

    public boolean getVerdadeira() {return verdadeira;}

}
