/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.dozen.www.controller;

import cl.dozen.www.model.Cliente;
import java.util.logging.Logger;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author sergio
 */
@Named
@RequestScoped
public class AgregarCliente {
    
    @Inject
    private Cliente cliente;
    
    private static Logger logger = Logger.getLogger(AgregarCliente.class.getName());  

    public AgregarCliente() {
    }
    
    @PostConstruct
    public void init(){
        cliente.setRutCliente(63871613);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarCliente(){
           // agregar cliente a la BD
        
    }
    
    public String onFlowProcess(FlowEvent event) {  
        logger.info("Current wizard step:" + event.getOldStep());  
        logger.info("Next step:" + event.getNewStep()); 
        
        logger.info(cliente.getRutCliente().toString());
        
        return event.getNewStep();  
         
    } 
    
    
}
