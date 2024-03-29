package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;

/*
 * @author Zay
 */
public class P_Dona {

    float x, y, z;
    float w, h, p;
    float rx, ry, rz;
    float r, g, b;
    float radint, radext;
    GL gl;
    GLUT glut = new GLUT();

    public P_Dona(GL gl, float x, float y, float z, float w, float h, float p, float rx, float ry, float rz, float r, float g, float b, float radint, float radext) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.p = p;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.r = r;
        this.g = g;
        this.b = b;
        this.gl = gl;
        this.radint = radint;
        this.radext = radext;
    }

    public void Dibuja() {

        gl.glPushMatrix();

        gl.glColor3f(r, g, b);
        gl.glTranslatef(x, y, z);

        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, p);

        glut.glutSolidTorus(radint, radext, 7, 10);

        gl.glEnd();

        gl.glPopMatrix();
    }

}
