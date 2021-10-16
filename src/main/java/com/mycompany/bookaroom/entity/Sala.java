/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookaroom.entity;

/**
 * Classe Sala
 * @author Andre Vinicius
 */
public class Sala{
    private Integer numero;
    private Integer qtdLugares;
    private Predio predio;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Sala(){
        
    }
    
    public Sala(Integer numero, Integer qtdLugares, Predio predio) {
        this.numero = numero;
        this.qtdLugares = qtdLugares;
        this.predio = predio;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(Integer qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Sala: " + numero + ", " + qtdLugares 
                + ", " + predio;
    }
    
    
}
