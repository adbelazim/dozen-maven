/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.dozen.www.facade;

import cl.dozen.www.entities.HistorialPagos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cristobal
 */
@Stateless
public class HistorialPagosFacade extends AbstractFacade<HistorialPagos> implements HistorialPagosFacadeLocal {
    @PersistenceContext(unitName = "cl.dozen_Dozen-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HistorialPagosFacade() {
        super(HistorialPagos.class);
    }
    
}
