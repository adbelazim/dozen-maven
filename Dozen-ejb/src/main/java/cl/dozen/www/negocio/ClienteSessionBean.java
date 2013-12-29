/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.dozen.www.negocio;

import cl.dozen.www.entities.Cliente;
import cl.dozen.www.entities.Plan;
import cl.dozen.www.entities.PlanContratado;
import cl.dozen.www.facade.ClienteFacadeLocal;
import cl.dozen.www.facade.PlanContratadoFacadeLocal;
import cl.dozen.www.facade.PlanFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cristobal
 */
@Stateless
public class ClienteSessionBean implements ClienteSessionBeanLocal {
    @EJB
    private PlanContratadoFacadeLocal planContratadoFacade;
    @EJB
    private PlanFacadeLocal planFacade;
    @EJB
    private ClienteFacadeLocal clienteFacade;
    
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean agregarCliente(Cliente cliente, Plan plan, PlanContratado planContratado) {
        
       //cliente.setPlanContratado(planContratado);
        planContratado.setCliente(cliente);
        planContratado.setPlanId(plan);
        
        clienteFacade.create(cliente);
        
        planContratadoFacade.create(planContratado);
        
        return true;
    }


    
    
}
