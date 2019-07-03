package org.yourorghere;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author fing.labcom
 */
public class M_Teclado implements KeyListener {

    public M_Teclado() {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '1') {
            Proyecto_Final.camx = -100;
            Proyecto_Final.camy = 600;
            Proyecto_Final.camz = 100;

        }
        if (e.getKeyChar() == '2') {
            Proyecto_Final.camx = 0;
            Proyecto_Final.camy = 40;
            Proyecto_Final.camz = 70;

        }
        if (e.getKeyChar() == '3') {
            Proyecto_Final.camx = 100;
            Proyecto_Final.camy = 70;
            Proyecto_Final.camz = 100;

        }
        if (e.getKeyChar() == '4') {

            int r = 300;

            Proyecto_Final.a = Proyecto_Final.a + 0.01f;
            
            Proyecto_Final.camx = r * Math.cos(Proyecto_Final.a);;
            Proyecto_Final.camz = r * Math.sin(Proyecto_Final.a);
        }
        if (e.getKeyChar() == '5') {

            Proyecto_Final.camx = 0;
            Proyecto_Final.camy = 600;
            Proyecto_Final.camz = 1;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Proyecto_Final.camx += 1;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Proyecto_Final.camx -= 1;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Proyecto_Final.camy += 1;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Proyecto_Final.camy -= 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            Proyecto_Final.camz -= 1;
        }

        if (e.getKeyCode() == KeyEvent.VK_Z) {
            Proyecto_Final.camz += 1;
        }
    }

    public void keyReleased(KeyEvent e) {

    }

}