/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logina;

/**
 *
 * @author cristian
 */
public class promedio extends javax.swing.JFrame {

    /**
     * Creates new form promedio
     */
    public promedio(Alumnos info) {
        initComponents();
        campoPromedio.setEnabled(false);
        int promedioCalculado = calcularPromedio(info);
        if(promedioCalculado != 0) campoPromedio.setText(String.valueOf(promedioCalculado));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPromedio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(campoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(campoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoPromedio;
    // End of variables declaration//GEN-END:variables

    public int calcularPromedio(Alumnos info) {
        int promedio = 0;
        
        if (info.Notas.size() >= 1) {
            int suma = 0;
        
            for (int i = 0; i < info.Notas.size(); i++) suma += info.Notas.get(i);
            promedio = suma / 5;
        }
        
        return promedio;
    }
    
}
