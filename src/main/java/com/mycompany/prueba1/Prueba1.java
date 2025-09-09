/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;

/**
 *
 * @author Santo Tomas
 */
public class Prueba1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.err.println("Este es un error");
       
        
        String  mensaje = "Este es un mensaje"; // variable String
        System.out.println(mensaje); // sout  ctrl + space  = autocompletado
     
        //instanciar e invocar
    
        //Usuario user1 = new Usuario();
        Usuario user1 = new Usuario("Gustavo", "Gallegos",(byte)21,true,"Belga");
        Usuario user2 = new Usuario("Blinky", "Bluz",(byte)41,true,"Argentino");
        Usuario user3 = new Usuario("Clyde", "Schweder",(byte)35,true,"Alemán");
        Usuario user4 = new Usuario("Bloom", "Pou",(byte)21,true,"Chileno");
    
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        user2.setNombre("Tomas");
        System.out.println(user2.toString());
        System.out.println(user4.toString());
        
        Alumno alumno = new Alumno (2, 3, 1, "Mateo", "Pizarro", (byte)22, true, "Chileno");
        alumno.saludar();
    }
}

