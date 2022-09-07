package Controller;

import Modelo.Questao;

import javax.persistence.EntityManager;
import java.util.List;

public class QuestaoController {

    public List<Questao> listarQuestoes(EntityManager entityManager){
        try {
            String jpql = "Select q from Questao q where q.ativa = :ativa";
            return entityManager.createQuery(jpql, Questao.class)
                    .setParameter("ativa", true)
                    .getResultList();
        }catch (Exception e){
            return null;
        }
    }

    public void fechaEntity(EntityManager entityManager){entityManager.close();}
}
