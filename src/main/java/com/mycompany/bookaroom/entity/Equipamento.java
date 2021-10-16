/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookaroom.entity;

/**
 * Classe Equipamento
 * @author Andre Vinicius
 */
public class Equipamento{
    private String nome;
    private String patrimonio;
    private Predio predio;

    public Equipamento(String nome, String patrimonio, Predio predio) {
        this.nome = nome;
        this.patrimonio = patrimonio;
        this.predio = predio;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
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
        return nome + ", patrimonio=" + patrimonio
                + ", " + predio;
    }
}
