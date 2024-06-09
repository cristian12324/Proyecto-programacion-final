/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Alumnos {
    public  String carne;
    public  String nombre;
    public  String apellido;
    public  String password;
    public ArrayList<Cursos> AsignacionesDeEstudiante = new ArrayList<>();
    public ArrayList<Integer>Notas = new ArrayList<>();
    
    
    
    public Alumnos(String carne, String nombre, String apellido, String password){
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
       
    }
    public Alumnos(){
    
}
}
