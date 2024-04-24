package c22712031;

import processing.core.PApplet;

public class Spinning {
    SofiasVisual ssv;
    float height = 0;
    float width = 0;
    float rot = 0;


    public Spinning(SofiasVisual ssv)
    {
        this.ssv = ssv;
    }

    public void render()
    {
        /* 
        for(float sp = 0; sp < 5; sp++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            ssv.rotateZ(PApplet.radians(rot));
            ssv.fill(255, 255, 0);
            float colour = PApplet.map(sp, 0, 3.9f, sp, 100); 
            ssv.stroke(colour, 255, 255);
            ssv.strokeWeight(1);
            ssv.box(300 * ssv.smoothedAmplitude);
            ssv.sphere(100 * ssv.smoothedAmplitude);
            ssv.popMatrix();
            rot += 1;
        }
        */
        
        
        

        for(float sp4 = 0; sp4 < 10; sp4++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(255, 255, 0);
            float colour2 = PApplet.map(sp4, 0, 3.9f, sp4, 70);
            ssv.stroke(colour2, 255, 255);
            ssv.strokeWeight(3);
            ssv.triangle(300 * ssv.smoothedAmplitude, sp4, sp4, sp4, sp4, ssv.smoothedAmplitude * 100);
            ssv.popMatrix();
            rot += 100;
        }
        

        
        for(float sp5 = 0; sp5 < 10; sp5++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(255, 255, 0);
            float colour3 = PApplet.map(sp5, 0, 3.9f, sp5, 70);
            ssv.stroke(colour3, 255, 255);
            ssv.strokeWeight(3);
            ssv.triangle(-300 * ssv.smoothedAmplitude, sp5, sp5, sp5, sp5, ssv.smoothedAmplitude * 100);
            ssv.popMatrix();
            rot += 100;
        }

        for(float sp4 = 0; sp4 < 5; sp4++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(255, 255, 0);
            float colour2 = PApplet.map(sp4, 0, 3.9f, sp4, 70);
            ssv.stroke(colour2, 255, 255);
            ssv.strokeWeight(3);
            ssv.triangle(600 * ssv.smoothedAmplitude, sp4, sp4, sp4, sp4, ssv.smoothedAmplitude * 100);
            ssv.popMatrix();
            rot += 50;
        }
        

        
        for(float sp5 = 0; sp5 < 5; sp5++)
        {
            ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
            ssv.pushMatrix();
            //ssv.rotateX(PApplet.radians(rot));
            //ssv.rotateY(PApplet.radians(rot));
            ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
            ssv.fill(255, 255, 0);
            float colour3 = PApplet.map(sp5, 0, 3.9f, sp5, 70);
            ssv.stroke(colour3, 255, 255);
            ssv.strokeWeight(3);
            ssv.triangle(-600 * ssv.smoothedAmplitude, sp5, sp5, sp5, sp5, ssv.smoothedAmplitude * 100);
            ssv.popMatrix();
            rot += 50;
        }
        
    }
}
    
