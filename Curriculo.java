/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.curriculo;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author 182310022
 */
public class Curriculo extends JFrame{
    
    public Curriculo(){
    Container c = getContentPane();
        c.add(new currastemplate());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 1280);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Curriculo();
    }
}
