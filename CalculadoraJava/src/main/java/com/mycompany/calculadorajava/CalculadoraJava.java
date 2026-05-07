/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadorajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

/**
 *
 * @author Victor 2ºAMS/DS - 2026
 */
public class CalculadoraJava extends JFrame implements ActionListener {

    JLabel tituloPrincipal, rotulo1, rotulo2, rotuloRes;
    JTextField texto1, texto2;
    JButton Soma, Sub, Mult, Div, Limpar, Raiz;
    ImageIcon icone1, icone2, icone3, icone4;

    public CalculadoraJava() {

        icone1 = new ImageIcon("add.png");
        icone2 = new ImageIcon("remove.png");
        icone3 = new ImageIcon("Delete.png");
        icone4 = new ImageIcon("Lightning.png");

        super();
        setTitle("Calculadora prof Carlos");
        
        Container tela = getContentPane();
        setLayout(null);

        tela.setBackground(new Color(187, 240, 255));

        tituloPrincipal = new JLabel("Calculadora java");
        rotulo1 = new JLabel("Primeiro número:");
        rotulo2 = new JLabel("Segundo número:");
        rotuloRes = new JLabel("");

        tituloPrincipal.setFont(new Font("Arial", Font.BOLD, 18));
        tituloPrincipal.setForeground(Color.BLACK);

        texto1 = new JTextField();
        texto2 = new JTextField();

        Soma = new JButton(icone1);
        Sub = new JButton(icone2);
        Mult = new JButton(icone3);
        Div = new JButton(icone4);
        Raiz = new JButton("√");
        Limpar = new JButton("Apagar");

        tituloPrincipal.setBounds(70, 5, 200, 25);
        rotulo1.setBounds(20, 40, 150, 20);
        texto1.setBounds(130, 40, 90, 20);
        rotulo2.setBounds(20, 70, 150, 20);
        texto2.setBounds(130, 70, 90, 20);
        rotuloRes.setBounds(230, 55, 180, 20);
        rotuloRes.setFont(new Font("Arial", Font.BOLD, 14));
        rotuloRes.setForeground(Color.RED);

        Soma.setBounds(35, 110, 50, 30);
        Sub.setBounds(95, 110, 50, 30);
        Mult.setBounds(155, 110, 50, 30);
        Div.setBounds(215, 110, 50, 30);
        Raiz.setBounds(35, 150, 50, 30);
        Limpar.setBounds(95, 150, 170, 30);

        Soma.addActionListener(this);
        Sub.addActionListener(this);
        Mult.addActionListener(this);
        Div.addActionListener(this);
        Raiz.addActionListener(this);
        Limpar.addActionListener(this);

        tela.add(tituloPrincipal);
        tela.add(rotulo1);
        tela.add(texto1);
        tela.add(rotulo2);
        tela.add(texto2);
        tela.add(Soma);
        tela.add(Sub);
        tela.add(Mult);
        tela.add(Div);
        tela.add(Raiz);
        tela.add(Limpar);
        tela.add(rotuloRes);

        setSize(350, 250); 
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Limpar) {
            rotulo2.setVisible(true);
            texto2.setVisible(true);
            texto1.setText("");
            texto2.setText("");
            rotuloRes.setText("");
            texto1.requestFocus();
            return;
        }

        double n1 = Double.parseDouble(texto1.getText());

        if (e.getSource() == Raiz) {
            rotulo2.setVisible(false);
            texto2.setVisible(false);
            rotuloRes.setText("= " + Math.sqrt(n1));
        } else {
            rotulo2.setVisible(true);
            texto2.setVisible(true);
            double n2 = Double.parseDouble(texto2.getText());

            if (e.getSource() == Soma) rotuloRes.setText("= " + (n1 + n2));
            else if (e.getSource() == Sub) rotuloRes.setText("= " + (n1 - n2));
            else if (e.getSource() == Mult) rotuloRes.setText("= " + (n1 * n2));
            else if (e.getSource() == Div) {
                if (n2 != 0) rotuloRes.setText("= " + (n1 / n2));
                else rotuloRes.setText("Erro");
            }
        }
    }
}

//Perguntar ao Carlos como representar o JFrame no Diagrama de Classes
//Enviar no drive passado em aula e terá chamada oral (irá analisar e perguntar sobre o código)
