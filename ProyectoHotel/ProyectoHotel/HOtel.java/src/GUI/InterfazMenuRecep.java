package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class InterfazMenuRecep extends JFrame{
	
	private PanelBotonRecep boton;
	private PanelNorteLogin titulo;

    public InterfazMenuRecep(){

        boton = new PanelBotonRecep();
        titulo = new PanelNorteLogin();
        
        setLayout(new BorderLayout());
        
        
        add(boton);
        add(titulo, BorderLayout.NORTH);
        
        setSize(new Dimension(1000,750));
		setResizable(false);
		setTitle("Calculadora :)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
        
        
    }

    public static void main(String args[]){
    	InterfazMenuRecep ventana = new InterfazMenuRecep();
    }
	
    
}