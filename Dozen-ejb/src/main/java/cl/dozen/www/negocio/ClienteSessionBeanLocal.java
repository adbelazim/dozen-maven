/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.dozen.www.negocio;

import cl.dozen.www.entities.Cliente;
import cl.dozen.www.entities.Plan;
import cl.dozen.www.entities.PlanContratado;
import javax.ejb.Local;

/**
 *
 * @author cristobal
 */
@Local
public interface ClienteSessionBeanLocal {

    boolean agregarCliente(Cliente cliente, Plan plan, PlanContratado planContratado);
    
}
