package GUI;

import javax.swing.*;
import java.awt.*;

public class InterfazMenuEmpleado extends JFrame{

    JLabel lbmenu;

    public InterfazMenuEmpleado(){

        lbmenu = new JLabel();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(lbmenu, BorderLayout.NORTH);
        

        setTitle("Menu Empleados");
        setSize(1000, 750);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}