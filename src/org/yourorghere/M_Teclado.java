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
            Proyecto_Final.num_cam = 1;

        }
        if (e.getKeyChar() == '2') {
            Proyecto_Final.num_cam = 2;

        }
        if (e.getKeyChar() == '3') {
            Proyecto_Final.num_cam = 3;
            Proyecto_Final.camx = 0;
            Proyecto_Final.camy = 1;
            Proyecto_Final.camz = 0;

        }
        if (e.getKeyChar() == '4') {
            Proyecto_Final.num_cam = 4;

        }
        if (e.getKeyChar() == '5') {
            Proyecto_Final.num_cam = 5;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Proyecto_Final.camx += 1;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Proyecto_Final.camx -= 1;
            if (Proyecto_Final.camx == 33 && Proyecto_Final.camz == 0 && Proyecto_Final.camy == 1) {
                Proyecto_Final.camy += 1;
            }
            if (Proyecto_Final.camx == 20 && Proyecto_Final.camz == 0 && Proyecto_Final.camy == 2) {
                Proyecto_Final.camy -= 1;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Proyecto_Final.camy += 1;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (Proyecto_Final.camy > 1) {
                Proyecto_Final.camy -= 1;
            }
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
