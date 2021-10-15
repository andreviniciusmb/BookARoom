/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookaroom.entity;

import java.util.ArrayList;

/**
 *
 * @author Andre Vinicius
 */
public class Campus {
    private String nome;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private ArrayList<Reserva> reservas;
    private ArrayList<Sala> salas;
    private ArrayList<Funcionario> funcionarios;

    public Campus(String nome, String rua, String numero, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.reservas = new ArrayList<Reserva>();
        this.salas = new ArrayList<Sala>();
        this.funcionarios = new ArrayList<Funcionario>();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    //</editor-fold>
    
    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    
    public void adicionarSala(Sala sala){
        salas.add(sala);
    }

    @Override
    public String toString() {
        return "Campus: " + nome;
    }
    
    
}
