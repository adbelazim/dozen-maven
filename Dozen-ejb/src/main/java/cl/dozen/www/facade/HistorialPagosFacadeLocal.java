/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.dozen.www.facade;

import cl.dozen.www.entities.HistorialPagos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface HistorialPagosFacadeLocal {

    void create(HistorialPagos historialPagos);

    void edit(HistorialPagos historialPagos);

    void remove(HistorialPagos historialPagos);

    HistorialPagos find(Object id);

    List<HistorialPagos> findAll();

    List<HistorialPagos> findRange(int[] range);

    int count();
    
}
