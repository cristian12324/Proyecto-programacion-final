/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logina;

import static com.mycompany.logina.CreacionCurso.LeerArchivoJSON;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian
 */
public class AsignacionEstudianteaCurso extends javax.swing.JFrame {

    /**
     * Creates new form AsignacionEstudianteaCurso
     */
    public AsignacionEstudianteaCurso() {
        initComponents();
         for(Alumnos e : LoginA.ListaAlumnos){
            jComboBox1.addItem(e.nombre);
            
        }
         for(Cursos e : LoginA.CreacionCurso){
            jComboBox2.addItem(e.nombre);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Alumno");

        jLabel2.setText("Curso");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Asignar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Asignaciones Masivas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, 138, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Cursos cursoSeleccionado = null;
        Alumnos alumnoSeleccionado = null;
        
        for(Cursos e : LoginA.CreacionCurso){
            if(e.nombre.equals(jComboBox2.getSelectedItem())){
                cursoSeleccionado = e;
                break;
            }

        }
        for(Alumnos e : LoginA.ListaAlumnos){
            if(e.nombre.equals(jComboBox1.getSelectedItem())){
                alumnoSeleccionado = e;
                break;
            }
        }
      if(cursoSeleccionado.ListaAlumnos.size()<10 && alumnoSeleccionado.AsignacionesDeEstudiante.size() <5){
            if(alumnoSeleccionado!=null && cursoSeleccionado!=null){
            alumnoSeleccionado.AsignacionesDeEstudiante.add(cursoSeleccionado);
            cursoSeleccionado.ListaAlumnos.add(alumnoSeleccionado);
            alumnoSeleccionado.Notas.add(-6);
            JOptionPane.showMessageDialog(this, "Alumno asignado Correctamente");
        }
      }
      else if(cursoSeleccionado.ListaAlumnos.size()>10){
          JOptionPane.showMessageDialog(this,"Curso Lleno");
      } 
      else if(alumnoSeleccionado.AsignacionesDeEstudiante.size()>5){
          JOptionPane.showMessageDialog(this,"Maximo permitido 5 Cursos");
      }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser archivo = new JFileChooser();
        
        int retorno = archivo.showDialog(this, "Cargar");
        if(retorno == JFileChooser.APPROVE_OPTION){
           LeerArchivoMasivo(archivo.getSelectedFile().toPath().toString());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    public void LeerArchivoMasivo(String path){
        try{
            File currentFile = new File (path);
            FileReader newFileReader = new FileReader(currentFile);
            BufferedReader br = new BufferedReader(newFileReader);
            
            String linea;
           while((linea = br.readLine()) != null){
                int hashtag = linea.indexOf("#");

                String estudiante = linea.substring(0, hashtag);
                String curso = linea.substring((hashtag + 1), linea.length());

                Alumnos alumnoEncontrado = null;
                Cursos claseEncontrada = null;
                
                System.out.println(estudiante);
                System.out.println(curso);

                for(Alumnos A : LoginA.ListaAlumnos){
                    if(A.carne.equals(estudiante)) alumnoEncontrado = A;
                }
             
               for (Cursos c : LoginA.CreacionCurso) {
                   if (c.Codigo == Integer.parseInt(curso)) claseEncontrada = c; 
               }
               
               System.out.println(alumnoEncontrado.nombre + " es alumno");
               System.out.println(claseEncontrada.nombre + " es la clase encontrada");
               
               if (alumnoEncontrado.AsignacionesDeEstudiante.size() < 4 && claseEncontrada.ListaAlumnos.size() < 9) {
                   alumnoEncontrado.AsignacionesDeEstudiante.add(claseEncontrada);
                   alumnoEncontrado.Notas.add(-1);
                   claseEncontrada.ListaAlumnos.add(alumnoEncontrado);
               }
           } 
        } catch(Exception e) {
           e.printStackTrace();
        }
    }
} 
