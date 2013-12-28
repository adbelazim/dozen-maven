/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.dozen.www.model;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author sergio
 */
@Named
@RequestScoped
public class Cliente {
    private Integer codigoCliente;
    private Integer rutCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String mailCliente;
    private Character sexoCliente;
    private Date fechaNacimientoCliente;
    private Integer telefonoCliente;
    private Integer telefonoEmergenciaCliente;
    private String direccionCliente;
    private String estadoCivilCliente;

    public Cliente() {
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getMailCliente() {
        return mailCliente;
    }

    public void setMailCliente(String mailCliente) {
        this.mailCliente = mailCliente;
    }

    public Character getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(Character sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public Date getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(Date fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    public Integer getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(Integer telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Integer getTelefonoEmergenciaCliente() {
        return telefonoEmergenciaCliente;
    }

    public void setTelefonoEmergenciaCliente(Integer telefonoEmergenciaCliente) {
        this.telefonoEmergenciaCliente = telefonoEmergenciaCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEstadoCivilCliente() {
        return estadoCivilCliente;
    }

    public void setEstadoCivilCliente(String estadoCivilCliente) {
        this.estadoCivilCliente = estadoCivilCliente;
    }
    
    
    
    
}
