/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import jpa.EntityManagerUtil;
import model.entidade.Intimacao;

/**
 *
 * @author f5078775
 */
public class IntimacaoDAO {

    EntityManager em = EntityManagerUtil.getEntityManager();
    
    
    public List<Intimacao> buscarParaLerAjureResponsavel() {
    
        return  em.createQuery("From Intimacao i").getResultList();
        



    }

    public void salvar(Intimacao intimacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
