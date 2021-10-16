/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookaroom.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Andre Vinicius
 */
public class Disponibilidade {
    private LocalDate data;
    private Sala sala;
    private Predio predio;
    private Campus campus;
    private LocalTime horaInicio;
    private LocalTime horaFim;

    public Disponibilidade(LocalDate data, Sala sala, Predio predio, Campus campus, LocalTime horaInicio, LocalTime horaFim) {
        this.data = data;
        this.sala = sala;
        this.predio = predio;
        this.campus = campus;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }
    
    
    
}
