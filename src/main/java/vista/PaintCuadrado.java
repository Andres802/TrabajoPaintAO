/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Andres Ochoa
 */
public class PaintCuadrado extends JPanel implements MouseListener {

    private int x1 = 0;
    private int x2 = 0;
    private int y1 = 0;
    private int y2 = 0;
    
    int dimx, dimy;

    private Color colorLinea = Color.BLACK;
    private boolean pintar;

    public PaintCuadrado() {

        this.addMouseListener(this);

    }

    public void init() {
        this.resize(600, 400);
        pintar = false;
    }

    public void paint(Graphics g) {

        super.paint(g);

        int x, y;
        int ancho, alto;

        ancho = this.x1;
        alto = this.y1;

        g.setColor(Color.BLACK);
        x = 40;
        y = 100;

        g.drawString("Cuadrado[" + ancho + " x " + alto + "]", x, y);
        //--------------------------------------------------------------------//

        
        dimx = 140;
        dimy = 100;

        g.setColor(this.colorLinea);
        g.drawLine(this.x1 - this.dimx, this.y1 - this.dimy, this.x1 + this.dimx, this.y1 - this.dimy);
        g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1 + this.dimx, this.y1 + this.dimy);
        g.drawLine(this.x1 - this.dimx, this.y1 + this.dimy, this.x1 - this.dimx, this.y1 - this.dimy);
        g.drawLine(this.x1 + this.dimx, this.y1 + this.dimy, this.x1 + this.dimx, this.y1 - this.dimy);
        g.setColor(this.colorLinea);
        /*
            x=180; y=90;
            
            g.setColor(this.colorLinea);            
            g.fillRect(x, y, ancho, alto);
            
            //------------------------------------------------------------//
            g.setColor(Color.black);
            g.drawRect(x, y, ancho, alto);
         */
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        JOptionPane.showMessageDialog(this, e.getPoint());

        this.x1 = e.getX();
        this.y1 = e.getY();
        super.repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

}
