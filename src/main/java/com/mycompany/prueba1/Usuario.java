package com.mycompany.prueba1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santo Tomas
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private byte edad;
    
    private boolean esBecado;
    private String  nacionalidad;

    public Usuario() {
    }
    
    public Usuario(String nombre, String apellido, byte edad, boolean esBecado, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.esBecado = esBecado;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public boolean isEsBecado() {
        return esBecado;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setEsBecado(boolean esBecado) {
        this.esBecado = esBecado;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", esBecado=" + esBecado + ", nacionalidad=" + nacionalidad + '}';
    }
    
        public void saludar(){
        System.out.println("Mi nombre es " + nombre + " y soy usuairo");
    }
        
        public String saludar2(){
            return "Mi nombre es " + nombre + " y soy usuairo";
    }      
        
        
} 
