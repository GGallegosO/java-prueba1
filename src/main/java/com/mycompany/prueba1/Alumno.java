/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba1;

/**
 *
 * @author Santo Tomas
 */
public class Alumno extends Usuario {
    
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno() {
    }

    public Alumno(double nota1, double nota2, double nota3, String nombre, String apellido, byte edad, boolean esBecado, String nacionalidad) {
        super(nombre, apellido, edad, esBecado, nacionalidad);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String saludar2() {
        return "Mi nombre es " + getNombre() + " y soy alumno y tengo la nota 1 " + nota1;
    }

    @Override
    public void saludar() {
        System.out.println(saludar2());
    }
    
    

    
     
}
