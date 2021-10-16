/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookaroom.entity;

/**
 *
 * @author Andre Vinicius
 */
public class Predio {
    private String nome;
    private Campus campus;

    public Predio(String nome,Campus campus) {
        this.nome = nome;
        this.campus = campus;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
    //</editor-fold> 

    @Override
    public String toString() {
        return "Predio: " + nome;
    }
    
    
}
