package com.mycompany.logina;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Serializacion {
      public static <T> void LeerObjeto(ArrayList<T> lista, String filePath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static <T> ArrayList<T> LeerObjeto(String filename) {
        ArrayList<T> tempList = null;
        
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            tempList = (ArrayList<T>) in.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return tempList;
    }
    
}


