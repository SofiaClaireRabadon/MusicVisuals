package c22712031;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class SofiasVisual extends PApplet {

    SunSphere sunsph; // Visual 1
    Spinning spinspin; // Visual 2
    RadiantSpikeMachine rdsm; // Visual 3
    SphereDimension sphd; // Visual 4

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
        
        if (key == 'p') // Pressing the P key pauses the song
        {
            if(ap.isPlaying()) 
            {
                ap.pause();
            }
        }

        else if(key == 'c') // Pressing the C key continues the song
        {
            ap.play();
        }



        if(key == 'r') // Pressing the R key replays the song from the beginning
        {
            ap.rewind();
            ap.play();
        }
        

        if(key == '0') // Nothing here at the moment
        {
            mode = 0;
        }

        if(key == '1') // Pressing the 1 key displays Visual 1
        {
             mode = 1;
        }

        if(key == '2') // Pressing the 2 key displays Visual 2
        {
            mode = 2;
        }

        if(key == '3') // Pressing the 3 key displays Visual 3
        {
            mode = 3;
        }

        if(key == '4') // Pressing the 4 key displays Visual 4
        {
            mode = 4;
        }
    }

    public void settings()
    {
        size(1000, 690, P3D);
        fullScreen(P3D, SPAN);
    }
    
    public void setup()
    {
        minim = new Minim(this);
        
        sunsph = new SunSphere(this);
        spinspin = new Spinning(this);
        sphd = new SphereDimension(this);
        rdsm = new RadiantSpikeMachine(this);

        ap = minim.loadFile("java/data/Rave Machine.mp3", 1000);
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
            lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.02f);
        }
        
        average = sum / (float) ab.size();

        smoothedAmplitude = lerp(smoothedAmplitude, average, 0.1f);

        //float cx = width / 2;
        //float cy = height / 2;

        switch(mode)
        {
            case 0:
                background(0, 0, 0);        
                break;
                
            case 1:
                background(0, 0, 0);
                sunsph.render();
                break;


            case 2:
                background(0, 0, 0);
                spinspin.render();
                break;


            case 3:
                background(0, 0, 0);
                sphd.render();    
                break;


            case 4:
                background(0, 0, 0);
                spinspin.render();
                rdsm.render();
                break;
        }
    }
}
