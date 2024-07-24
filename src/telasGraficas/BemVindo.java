/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telasGraficas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 20222PF.CC0019
 */


public class BemVindo {

    public static void main(String [] args){
        
        JFrame janela = new JFrame();
        janela.setSize(300,400);
        janela.setTitle("Bem vindo (a) a GUI em Java");
        
        //janela.setCursor(Cursor.CROSSHAIR_CURSOR);
        
        janela.setLayout(new FlowLayout());
        
        //LABEL
        JLabel lblNome = new JLabel("Nome: ");       
        
        
        //CAMPO DE TEXTO
        JTextField txtNome = new JTextField();
        txtNome.setColumns(20);
        
        //BOTAO ENVIAR
        JButton btnEnviar =  new JButton("Enviar");
        
        //EVENTO DE CLIQUE DO BOTAO
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(janela ,txtNome.getText(),"Nome Informado",1);
            }
        });
        
            
        janela.add(lblNome);
        janela.add(txtNome);
        janela.add(btnEnviar);
        
        
        
        
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    
    
    
    
    
    
    
    
}
