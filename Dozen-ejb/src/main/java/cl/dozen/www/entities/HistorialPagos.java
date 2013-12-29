/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.dozen.www.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cristobal
 */
@Entity
@Table(name = "historial_pagos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistorialPagos.findAll", query = "SELECT h FROM HistorialPagos h"),
    @NamedQuery(name = "HistorialPagos.findByHistorialNumeroBoleta", query = "SELECT h FROM HistorialPagos h WHERE h.historialNumeroBoleta = :historialNumeroBoleta"),
    @NamedQuery(name = "HistorialPagos.findByHistorialFechaPago", query = "SELECT h FROM HistorialPagos h WHERE h.historialFechaPago = :historialFechaPago"),
    @NamedQuery(name = "HistorialPagos.findByHistorialMonto", query = "SELECT h FROM HistorialPagos h WHERE h.historialMonto = :historialMonto"),
    @NamedQuery(name = "HistorialPagos.findByHistorialObservacion", query = "SELECT h FROM HistorialPagos h WHERE h.historialObservacion = :historialObservacion")})
public class HistorialPagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "historial_numero_boleta")
    private Integer historialNumeroBoleta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "historial_fecha_pago")
    @Temporal(TemporalType.DATE)
    private Date historialFechaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "historial_monto")
    private double historialMonto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "historial_observacion")
    private String historialObservacion;
    @JoinColumn(name = "cliente_codigo", referencedColumnName = "cliente_codigo")
    @ManyToOne(optional = false)
    private PlanContratado clienteCodigo;

    public HistorialPagos() {
    }

    public HistorialPagos(Integer historialNumeroBoleta) {
        this.historialNumeroBoleta = historialNumeroBoleta;
    }

    public HistorialPagos(Integer historialNumeroBoleta, Date historialFechaPago, double historialMonto, String historialObservacion) {
        this.historialNumeroBoleta = historialNumeroBoleta;
        this.historialFechaPago = historialFechaPago;
        this.historialMonto = historialMonto;
        this.historialObservacion = historialObservacion;
    }

    public Integer getHistorialNumeroBoleta() {
        return historialNumeroBoleta;
    }

    public void setHistorialNumeroBoleta(Integer historialNumeroBoleta) {
        this.historialNumeroBoleta = historialNumeroBoleta;
    }

    public Date getHistorialFechaPago() {
        return historialFechaPago;
    }

    public void setHistorialFechaPago(Date historialFechaPago) {
        this.historialFechaPago = historialFechaPago;
    }

    public double getHistorialMonto() {
        return historialMonto;
    }

    public void setHistorialMonto(double historialMonto) {
        this.historialMonto = historialMonto;
    }

    public String getHistorialObservacion() {
        return historialObservacion;
    }

    public void setHistorialObservacion(String historialObservacion) {
        this.historialObservacion = historialObservacion;
    }

    public PlanContratado getClienteCodigo() {
        return clienteCodigo;
    }

    public void setClienteCodigo(PlanContratado clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialNumeroBoleta != null ? historialNumeroBoleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialPagos)) {
            return false;
        }
        HistorialPagos other = (HistorialPagos) object;
        if ((this.historialNumeroBoleta == null && other.historialNumeroBoleta != null) || (this.historialNumeroBoleta != null && !this.historialNumeroBoleta.equals(other.historialNumeroBoleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.dozen.www.entities.HistorialPagos[ historialNumeroBoleta=" + historialNumeroBoleta + " ]";
    }
    
}
