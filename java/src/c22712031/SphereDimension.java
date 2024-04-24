package c22712031;

import processing.core.PApplet;

public class SphereDimension {

    SofiasVisual ssv;
    float height = 0;
    float width = 0;
    float rot = 0;

    float cx = width / 2;
    float cy = height / 2;

    public SphereDimension(SofiasVisual ssv)
    {
        this.ssv = ssv;
    }

    public void render()
    {
        for(float c = 0; c < 5; c++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.translate(100, height*0.30f, -900);
            ssv.rotateX(PApplet.radians(rot)); // spins right and left
            ssv.rotateY(PApplet.radians(rot)); // spins forward and backward
            ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(0, 102, 0);
            float colour = PApplet.map(c, 0, 9.5f, c, 155);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(2);
            ssv.sphere(300 * ssv.smoothedAmplitude * c);
            ssv.popMatrix();
            rot += 1;       
        }
    }
    
}
