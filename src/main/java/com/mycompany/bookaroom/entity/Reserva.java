/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookaroom.entity;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Classe Reserva
 * @author Andre Vinicius
 */
public class Reserva{
    private LocalDate dataAlocacao;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private String assunto;
    private Sala sala;
    private Equipamento equipamento;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Reserva() {

    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public LocalDate getDataAlocacao() {
        return dataAlocacao;
    }

    public void setDataAlocacao(LocalDate dataAlocacao) {
        this.dataAlocacao = dataAlocacao;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    //</editor-fold>
    
    public String getNomeEquipamento() {
        return equipamento.getNome();
    }

    public void setNomeEquipamento(String nome_equipamento) {
        this.equipamento.setNome(nome_equipamento);
    }
    
    public Integer getNumeroSala() {
        return sala.getNumero();
    }

    public void setNumeroSala(Integer numerosala) {
        this.sala.setNumero(numerosala);
    }

    public void criarReserva(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim, 
            String assunto, Sala sala){
        this.dataAlocacao = dataAlocacao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.assunto = assunto;
        this.sala = sala;
    }
    
    public void criarReserva(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim, 
            String assunto, Equipamento equipamento, Sala sala){
        this.dataAlocacao = dataAlocacao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.assunto = assunto;
        this.equipamento = equipamento;
        this.sala = sala;
    }
    
    @Override
    public String toString() {
        return "Reserva: " + "dataAlocacao= " + dataAlocacao + ", horaInicio= " 
                + horaInicio + ", horaFim= " + horaFim + ", assunto= " 
                + assunto + ", " + equipamento + ", " + sala ;
    }
}
