/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Andres Ochoa
 */
public class VentanaCuadrado extends javax.swing.JInternalFrame implements ActionListener {

    private PaintCuadrado panelPaint;
    private JPanel panelCombo;
    private JPanel panelPrincipal, panel1;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JButton jButton , jButton1;
    private boolean pintar;

    public VentanaCuadrado() {
        
        this.setClosable(true);
        this.setIconifiable(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        
        this.setSize(600, 400);
        this.setLocation(100, 100);
        this.setTitle("Circulo");
        
        this.panelPaint = new PaintCuadrado();
        this.panelPrincipal = new JPanel(new FlowLayout());
        this.panel1 = new JPanel(new BorderLayout());
        this.jButton1 = new JButton("Limpiar");
        this.jButton = new JButton("Pintar");
        this.jComboBox1 = new JComboBox();
        
        this.jComboBox1.addItem("Rojo");
        this.jComboBox1.addItem("Azul");
        this.jComboBox1.addItem("Amarillo");
        
        
        this.panelPrincipal.add(this.jComboBox1);
        this.panelPrincipal.add(this.jButton);
        this.panelPrincipal.add(this.jButton1);
        
        this.panel1.add(this.panelPaint,BorderLayout.CENTER);
        this.panel1.add(this.panelPrincipal,BorderLayout.SOUTH);
                
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
        this.jButton.addActionListener(this);
        this.jButton1.addActionListener(this);
        this.jComboBox1.addActionListener(this);
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.jButton) {
            pintar = true;
            var retorno = jComboBox1.getSelectedItem();
            
            if (retorno.equals("Rojo")) {
                this.panelPaint.setColorLinea(Color.red);
            } else if (retorno.equals("Azul")) {
                this.panelPaint.setColorLinea(Color.blue);

            } else if (retorno.equals("Amarillo")) {
                this.panelPaint.setColorLinea(Color.YELLOW);

            }
        }
       
       repaint();
        
    }
   

}
