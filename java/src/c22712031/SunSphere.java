package c22712031;

import processing.core.*;

public class SunSphere {

    SofiasVisual ssv;
    float height = 0;
    float rot = 0;

    public SunSphere(SofiasVisual ssv)
    {
        this.ssv = ssv;
    }

    public void render()
    {
        for(float s = 0; s < 7; s++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.translate(100, height*0.30f, -900);
            //ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            ssv.rotateZ(PApplet.radians(rot));
            ssv.fill(60, 102, 40);
            float colour = PApplet.map(s, 0, 3.9f, s, 30);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(2);
            ssv.sphere(300 * ssv.smoothedAmplitude);
            ssv.box(400 * ssv.smoothedAmplitude);
            ssv.line(500 * ssv.smoothedAmplitude, s, s, ssv.smoothedAmplitude * 500);
            ssv.triangle(100 * ssv.smoothedAmplitude, s, s, s, s, ssv.smoothedAmplitude * 600);
            ssv.popMatrix();
            rot += 200;
        }   
    }
}
