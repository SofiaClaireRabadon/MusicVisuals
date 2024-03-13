package c22712031;

import processing.core.PApplet;

public class RadiantSpikeMachine {

    SofiasVisual ssv;
    float height = 0;
    float width = 0;
    float rot = 0;

    public RadiantSpikeMachine(SofiasVisual ssv)
    {
        this.ssv = ssv;
    }

    public void render()
    {
        for(float b = 0; b < 100; b ++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.translate(100, height*0.30f, -900);
            ssv.rotateX(PApplet.radians(rot)); // spins right and left
            ssv.rotateY(PApplet.radians(rot)); // spins forward and backward
            ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(178, 0, 0);
            float colour = PApplet.map(b, 0, 9.5f, b, 65);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);       
            ssv.box(300 * ssv.smoothedAmplitude);
            ssv.popMatrix();
            rot += 10;    
        } 

        for(float b2 = 0; b2 < 100; b2 ++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            ssv.translate(500, height * 0.9f, -999);
            ssv.rotateX(PApplet.radians(rot)); // spins right and left
            //ssv.rotateY(PApplet.radians(rot)); // spins forward and backward
            //ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(178, 0, 0);
            float colour = PApplet.map(b2, 0, 9.5f, b2, 65);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);       
            ssv.box(900 * ssv.smoothedAmplitude);
            ssv.popMatrix();
            rot += 10;    
        } 

        for(float b3 = 0; b3 < 100; b3 ++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            ssv.translate(-500, height * 0.9f, -999);
            ssv.rotateX(PApplet.radians(rot)); // spins right and left
            //ssv.rotateY(PApplet.radians(rot)); // spins forward and backward
            //ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(178, 0, 0);
            float colour = PApplet.map(b3, 0, 9.5f, b3, 65);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);       
            ssv.box(900 * ssv.smoothedAmplitude);
            ssv.popMatrix();
            rot += 10;    
        } 

        for(float tb = 0; tb < 7; tb++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            //ssv.rotateZ(PApplet.radians(rot));
            ssv.fill(255, 255, 0);
            float colour = PApplet.map(tb, 0, 3.9f, tb, 200);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);
            ssv.triangle(100 * ssv.smoothedAmplitude, tb, tb, tb, tb, ssv.smoothedAmplitude * 600);
            ssv.popMatrix();
            rot += 100;
        }

        for(float tb2 = 0; tb2 < 7; tb2++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            //ssv.rotateZ(PApplet.radians(rot));
            ssv.fill(255, 255, 0);
            float colour = PApplet.map(tb2, 0, 3.9f, tb2, 200);
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);
            ssv.triangle(-100 * ssv.smoothedAmplitude, tb2, tb2, tb2, tb2, ssv.smoothedAmplitude * 600);
            ssv.popMatrix();
            rot += 200;
        }
    }    
}
