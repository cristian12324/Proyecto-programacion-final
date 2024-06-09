/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logina;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class LoginA {
    
    //public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static ArrayList<Alumnos> ListaAlumnos = new ArrayList<>();
    public static ArrayList<Cursos> CreacionCurso = new ArrayList<>();
    public static ArrayList<ProfesorA> CreacionProfesor = new ArrayList<>();
    public static ArrayList<Cursos> cursoModificar = new ArrayList<>();
   
 
   
    //public String profesorAsignado;
    // public static ArrayList<ProfesorA> profesorAsignado = new ArrayList<>();
    
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
       
    }
}
