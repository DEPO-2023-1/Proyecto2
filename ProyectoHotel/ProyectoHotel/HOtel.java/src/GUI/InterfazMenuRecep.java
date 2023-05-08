package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class InterfazMenuRecep extends JFrame{
	
	private PanelBotonRecep boton;
	private InterfazLogin interfaz;
    private JLabel titulo;

    public InterfazMenuRecep(InterfazLogin interfaz){
    	this.interfaz = interfaz;
        boton = new PanelBotonRecep(interfaz);
        titulo = new PanelNorteLogin();
        
        setLayout(new BorderLayout());
        
        
        add(boton);
        add(titulo, BorderLayout.NORTH);
        
        setSize(new Dimension(1000,750));
		setResizable(false);
		setTitle("Calculadora :)");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
        
        
    }
    
	
    
}
