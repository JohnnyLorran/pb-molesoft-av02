package Controller;

import Modelo.Resultado;

import javax.persistence.EntityManager;
import java.util.List;

public class ResultadoController {


    public void adicionarBancoResultado(EntityManager entityManager, Resultado resultado) {
        entityManager.getTransaction().begin();
        entityManager.persist(resultado);
        entityManager.getTransaction().commit();
    }

    public List<Resultado> verResultadoPlacar(EntityManager entityManager){
        try {
            String jpql = "Select r from Resultado r order by r.acertos desc";
            return entityManager.createQuery(jpql, Resultado.class)
                    .getResultList();
        }catch (Exception e){
            return null;
        }
    }

    public void fechaEntity(EntityManager entityManager){
        entityManager.close();
    }

}
