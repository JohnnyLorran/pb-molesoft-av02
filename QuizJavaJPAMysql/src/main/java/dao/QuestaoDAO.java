package dao;

import Controller.QuestaoController;
import Modelo.Questao;
import util.funcoes.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class QuestaoDAO {

    private EntityManager entityManager = JPAUtil.getEntityManager();

    QuestaoController questaoController = new QuestaoController();

    public List<Questao> listarQuestoes(){
        return questaoController.listarQuestoes(entityManager);
    }

    public void fechaEntity(){questaoController.fechaEntity(entityManager);}
}
