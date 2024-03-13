package c22712031;

import processing.core.PApplet;

public class Sphere2 {
    SofiasVisual ssv;
    float height = 0;
    float width = 0;
    float rot = 0;


    public Sphere2(SofiasVisual ssv)
    {
        this.ssv = ssv;
    }

    public void render()
    {
        for(float sp = 0; sp < 7; sp++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            //ssv.rotateZ(PApplet.radians(rot));
            ssv.fill(255, 255, 0);
            float colour = PApplet.map(sp, 0, 3.9f, sp, 195);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);
            ssv.sphere(300 * ssv.smoothedAmplitude);
            ssv.triangle(500 * ssv.smoothedAmplitude, sp, sp, sp, sp, ssv.smoothedAmplitude * 600);
            ssv.popMatrix();
            rot += 100;
        }

        for(float sp2 = 0; sp2 < 7; sp2++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            //ssv.rotateZ(PApplet.radians(rot));
            ssv.fill(255, 255, 0);
            float colour = PApplet.map(sp2, 0, 3.9f, sp2, 195);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);
            ssv.triangle(-500 * ssv.smoothedAmplitude, sp2, sp2, sp2, sp2, ssv.smoothedAmplitude * 600);
            ssv.popMatrix();
            rot += 100;
        }
       
    }
    
}
