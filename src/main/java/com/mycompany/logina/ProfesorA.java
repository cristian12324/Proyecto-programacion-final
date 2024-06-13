/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author cristian
 */

public class ProfesorA implements Serializable{
   public  String nombre;
    public String apellido;
    public String usuario;
    public String password;
    public ArrayList<Cursos> CursosAsignados = new ArrayList<>();
    public String especialidad;
   
    public ProfesorA (String nombre, String apellido, String usuario, String password, String especialidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.especialidad = especialidad;
    }
    
}
