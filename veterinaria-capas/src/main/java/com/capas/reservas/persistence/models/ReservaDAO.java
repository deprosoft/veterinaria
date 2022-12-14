package com.capas.reservas.persistence.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="reserva")
public class ReservaDAO {

    private Integer idReserva;
    private Date fechaReserva;
    private String nombreMascota;
    private Integer idDueno;
    private String idVeterinaria;
    private Long valorReserva;
    private String formaPago;
    private Integer idEstado;
    private String descripcion;

    @OneToOne
    @JoinColumn(name="idEstado", insertable = false, updatable = false)
    private EstadoDAO estado;

    public EstadoDAO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDAO estado) {
        this.estado = estado;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Integer getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Integer idDueno) {
        this.idDueno = idDueno;
    }

    public String getIdVeterinaria() {
        return idVeterinaria;
    }

    public void setIdVeterinaria(String idVeterinaria) {
        this.idVeterinaria = idVeterinaria;
    }

    public Long getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(Long valorReserva) {
        this.valorReserva = valorReserva;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
