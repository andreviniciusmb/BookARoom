/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookaroom.entity;

/**
 * Classe Funcionário
 * @author Andre Vinicius
 */
public class Funcionario {
    private String nome;
    private String cargo;
    private String ramal;
    private Campus campus;

    public Funcionario(String nome, String cargo, String ramal, Campus campus) {
        this.nome = nome;
        this.cargo = cargo;
        this.ramal = ramal;
        this.campus = campus;
    }  
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
    
    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
    //</editor-fold>
    
    /**
    public void reservarSala(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim,
            String assunto, Sala sala, Campus campus) {
        
        Reserva reserva = new Reserva(dataAlocacao,horaInicio,horaFim, assunto, sala);
        campus.adicionarReserva(reserva);
    }
    
    public void reservarSala(LocalDate dataAlocacao, LocalTime horaInicio, LocalTime horaFim, 
            String assunto, Equipamento equipamento, Sala sala, Campus campus) {
        
        Reserva reserva = new Reserva(dataAlocacao,horaInicio,horaFim, assunto, equipamento, sala);
        campus.adicionarReserva(reserva);
    }
     * @param reserva
     * @param equipamento
    **/
    
    public void requisitarEquipamento(Reserva reserva, Equipamento equipamento){
        reserva.setEquipamento(equipamento);
    }
    
    @Override
    public String toString() {
        return nome + ", " + cargo
                + ", " + campus.getNome();
    }
    
}
