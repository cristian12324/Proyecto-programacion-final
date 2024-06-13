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
    static String alumnosPath = "/home/cristian/Documentos/datos_alumnos.ser";
    static String profesorAPath = "/home/cristian/Documentos/datos_profesorA.ser";
    static String cursosPath = "/home/cristian/Documentos/datos_cursos.ser";
    //public String profesorAsignado;
    // public static ArrayList<ProfesorA> profesorAsignado = new ArrayList<>();
    
    public static void main(String[] args) {
        
        ListaAlumnos = Serializacion.LeerObjeto(alumnosPath);
        if(ListaAlumnos == null) ListaAlumnos = new ArrayList<>();
        
        CreacionProfesor = Serializacion.LeerObjeto(profesorAPath);
        if(CreacionProfesor == null) CreacionProfesor = new ArrayList<>();
        
        CreacionCurso = Serializacion.LeerObjeto(cursosPath);
        if(CreacionCurso == null) CreacionCurso = new ArrayList<>();
        
        Login l = new Login();
        l.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
        Serializacion.LeerObjeto(ListaAlumnos, alumnosPath);
        Serializacion.LeerObjeto(CreacionProfesor, profesorAPath);
        Serializacion.LeerObjeto(CreacionCurso, cursosPath);
    }));
    }
       
    }

