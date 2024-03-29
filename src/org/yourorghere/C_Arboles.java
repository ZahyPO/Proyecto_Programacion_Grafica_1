package org.yourorghere;

import javax.media.opengl.GL;

/*
 * @author zalis
 */
public class C_Arboles {

    GL gl;
    float x, y, z;
    float w, h, p;

    E_Arreglo_Arboles arb_1, arb_2, arb_3, arb_4, arb_5;
    E_Arreglo_Arboles arb_6, arb_7, arb_8, arb_9, arb_10;
    E_Arreglo_Arboles arb_11, arb_12;

    P_Cuadrado suelo;

    public C_Arboles(GL gl, float x, float y, float z, float w, float h, float p, boolean inverso) {
        this.gl = gl;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.p = p;

        this.suelo = new P_Cuadrado(gl, 0, 0, 0, 1, 1, 90, 0, 0, 1, 1, 0);

        this.arb_1 = new E_Arreglo_Arboles(gl, -0.13f, 0, 0.42f, 1f, 0.1f, 1f, 6, 2, 0.1f, 0.1f, 3);
        this.arb_2 = new E_Arreglo_Arboles(gl, -0.48f, 0, -0.48f, 1f, 0.1f, 1f, 13, 4, 0.05f, 0.05f, 3);
        this.arb_3 = new E_Arreglo_Arboles(gl, -0.15f, 0, -0.48f, 1f, 0.07f, 1f, 13, 2, 0.05f, 0.05f, 1);
        this.arb_4 = new E_Arreglo_Arboles(gl, 0.17f, 0, -0.48f, 1f, 0.1f, 1f, 4, 5, 0.05f, 0.05f, 2);
        this.arb_5 = new E_Arreglo_Arboles(gl, 0.4f, 0, -0.18f, 1f, 0.1f, 1f, 4, 7, 0.05f, 0.05f, 3);

        this.arb_6 = new E_Arreglo_Arboles(gl, -0.49f, 0, 0.485f, 1f, 0.1f, 1f, 14, 1, 0.05f, 0.05f, 1);
        this.arb_7 = new E_Arreglo_Arboles(gl, -0.49f, 0, 0.03f, 1f, 0.1f, 1f, 1, 18, 0.05f, 0.05f, 1);
        this.arb_8 = new E_Arreglo_Arboles(gl, 0.17f, 0, 0.44f, 1f, 0.1f, 1f, 9, 2, 0.08f, 0.08f, 2);
        this.arb_9 = new E_Arreglo_Arboles(gl, -0.48f, 0, -0.38f, 1f, 0.1f, 1f, 2, 11, 0.05f, 0.05f, 2);
        this.arb_10 = new E_Arreglo_Arboles(gl, 0.45f, 0, 0.08f, 1f, 0.1f, 1f, 2, 14, 0.05f, 0.05f, 2);

        this.arb_11 = new E_Arreglo_Arboles(gl, -0.48f, 0, -0.1f, 1f, 0.1f, 1f, 1, 3, 0.05f, 0.05f, 2);
        this.arb_12 = new E_Arreglo_Arboles(gl, 0.475f, 0, 0.03f, 1f, 0.1f, 1f, 1, 2, 0.05f, 0.05f, 2);

        if (inverso) {

            this.arb_2.x = 0.38f - this.arb_2.x;
            this.arb_4.x = -0.48f - this.arb_4.x;
            this.arb_5.x = -0.97f - this.arb_5.x;
            this.arb_6.x = 0.3f - this.arb_6.x;
            this.arb_7.x = 0.97f - this.arb_7.x;
            this.arb_8.x = -0.97f - this.arb_8.x;
            this.arb_9.x = 0.95f - this.arb_9.x;
            this.arb_10.x = -0.97f - this.arb_10.x;
            this.arb_11.x = 0.98f - this.arb_11.x;
            this.arb_12.x = -0.97f - this.arb_12.x;
        }
    }

    public void Dibuja() {
        gl.glPushMatrix();

        gl.glTranslated(this.x, this.y, this.z);
        gl.glScaled(w, h, p);

//        this.suelo.Dibuja();
        this.arb_1.Dibuja();
        this.arb_2.Dibuja();
        this.arb_3.Dibuja();
        this.arb_4.Dibuja();
        this.arb_5.Dibuja();
        this.arb_6.Dibuja();
        this.arb_7.Dibuja();
        this.arb_8.Dibuja();
        this.arb_9.Dibuja();
        this.arb_10.Dibuja();
        this.arb_11.Dibuja();
        this.arb_12.Dibuja();

        gl.glEnd();

        gl.glPopMatrix();
    }

}
