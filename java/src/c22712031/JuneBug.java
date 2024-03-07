package c22712031;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class JuneBug extends PApplet {

    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;

    int mode = 0;

    float[] lerpedBuffer;
    float y = 0;
    float smoothedY = 0;
    float smoothedAmplitude = 0;

    public void keyPressed() {
        
        if (key == ' ') {
            if(ap.isPlaying()) {
                ap.pause();
            } else {
                ap.rewind();
                ap.play();
            }
        }


        if(key == '1')
        {
            mode = 1;
        }

        if(key == '2')
        {
             mode = 2;
        }

        if(key == '3')
        {
            mode = 3;
        }

        if(key == '4')
        {
            mode = 4;
        }
    }

    public void settings()
    {
        size(1000, 690, P3D);
        //fullScreen(P3D, SPAN);
    }
    
    public void setup()
    {
        minim = new Minim(this);
        ap = minim.loadFile("", 1000);
        ap.play();
        ab = ap.mix;
        colorMode(HSB);

        y = height / 2;
        smoothedY = y;

        lerpedBuffer = new float[width];
    }

    float off = 0;

    public void draw()
    {
        background(0);
        float average = 0;
        float sum = 0;
        off += 1;

        for(int i = 0; i < ab.size(); i++)
        {
            sum += abs(ab.get(i));
            lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.05f);
        }
        
        average = sum / (float) ab.size();

        smoothedAmplitude = lerp(smoothedAmplitude, average, 0.1f);

        float cx = width / 2;
        float cy = height / 2;

        switch(mode)
        {
            case 1:
                background(0, 0, 0);
                for(int c = 0; c < ab.size(); c++)
                {
                    float hueC = map(ab.size(), 0, ab.size(), 0, 100);
                    noStroke();
                    fill(hueC, 255, 255);
                    circle(cy * 1.3f, smoothedAmplitude * cx * 0.9f, smoothedAmplitude * c * 2);
                }
                break;
        }
    }


}
