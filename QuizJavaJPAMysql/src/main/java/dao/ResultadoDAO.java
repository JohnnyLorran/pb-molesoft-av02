package dao;

import Modelo.Resultado;
import Controller.ResultadoController;
import util.funcoes.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class ResultadoDAO {

    private EntityManager entityManager = JPAUtil.getEntityManager();

    ResultadoController resultadoController = new ResultadoController();

    public void adicionarNovoResultado(Resultado resultado){resultadoController.adicionarBancoResultado(entityManager, resultado);}

    public List<Resultado> verPlacar(){
        return resultadoController.verResultadoPlacar(entityManager);
    }

    public void fechaEntity(){resultadoController.fechaEntity(entityManager);};

}
