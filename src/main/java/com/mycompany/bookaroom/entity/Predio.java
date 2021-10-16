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
public class Predio {
    private String nome;
    private Campus campus;
    private ArrayList<Equipamento> equipamentos;

    public Predio(String nome,Campus campus) {
        this.nome = nome;
        this.campus = campus;
        equipamentos = new ArrayList<>();
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

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    //</editor-fold> 

    public void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }
    
    @Override
    public String toString() {
        return "Predio: " + nome;
    }
    
    
}
