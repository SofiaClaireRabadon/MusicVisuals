# Music Visualiser Project

| Student Number | Name                 |
| -------------- | -------------------- |
| C22712031 | Sofia Claire Rabadon |


# Description of the assignment
The song I had chosen is called Rave Machine by Tony Junior and BEAUZ. The type of genre is Electronic and the style of the song is Happy Hardcore which means it is a Hardcore Dance Music. 

I created 4 different visuals based on how I interpret the whole song in relation to the lyrics as well as the mood and the tempo.


# Instructions
- Pressing the R key = To REWIND the whole song
- Pressing the P key = To PAUSE the song 
- Pressing the C key = To CONTINUE the song where it was last paused
- Pressing the 0, 1, 2, and 3 keys = Displays each different visual based on how I interpret the song.


# How it works
The 4 Visuals were created using only For Loops. There are 4 classes which I implemented (in order of the song + visuals):
#### SunSphere.java - Visual 1
#### Spinning.java - Visual 2
#### SphereDimension.java - Visual 3
#### RadiantSpikeMachine.java - Visual 4


## Visual 1
In the 1st Visual, there is a mixture of 2D and 3D shapes which I implemented here. As I mixed the 2D and 3D shapes, I created the sun because the lyrics mentioned 'sun', 'dawn', 'sunrise' and 'morning'. Both of the 2D and 3D shapes are rotating on the Z-axis.

### Sphere
The sphere represents the center of the sun. The colour shades of the sphere is a mixture of red, orange and yellow.
### Box
The box rotates at the back of the sphere which it is shown on the outer part of the sphere.
### Line
The line that looks like a hexagon is actually the 2D shape line.
### Triangle
The triangles are the lines that is sticking out from the sphere.

```Java
public void render()
{
    for(float s = 0; s < 7; s++)
    {
        ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
        ssv.pushMatrix();
        //ssv.translate(100, height*0.30f, -900);
        //ssv.rotateX(PApplet.radians(rot));
        //ssv.rotateY(PApplet.radians(rot));
        ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
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
```

## Visual 2
In the 2nd Visual, if you focus into the center for long, you can see there is an illusion of a circle. However, its the work of the triangles that are rotating on the Z-axis to make it look like it was spinning using the 2D shape circle.
```Java
public void render()
{    

    for(float sp4 = 0; sp4 < 10; sp4++)
    {
        ssv.camera(0, 0, 200, 0, 0, 0, 1, 0, 0);
        ssv.pushMatrix();
        //ssv.rotateX(PApplet.radians(rot));
        //ssv.rotateY(PApplet.radians(rot));
        ssv.rotateZ(PApplet.radians(rot)); // spins around like a circle
        ssv.fill(255, 255, 0);
        float colour3 = PApplet.map(sp4, 0, 3.9f, sp4, 70);
        ssv.stroke(colour3, 255, 255);
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
        float colour4 = PApplet.map(sp5, 0, 3.9f, sp5, 70);
        ssv.stroke(colour4, 255, 255);
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
        float colour5 = PApplet.map(sp4, 0, 3.9f, sp4, 70);
        ssv.stroke(colour5, 255, 255);
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
```

## Visual 3
In the 3rd Visual, I had only used one 3D shape within a For Loop because it represents the buildup for the next drop of the song. As you can see from the For Loop from below, there are 5 spheres with different colours. The name of this visual is "Sphere
Dimension" since its a space only containing spheres. The creation of the "Sphere Dimension" was influenced by the Russian Dolls where there is another doll decreasing in a smaller size inside another doll and so forth. Additionally, the 5 different colours of each sphere functions like the Russian Dolls.
```Java
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
```


## Visual 4
In the 4th Visual, I based it on the title of the song which I chose "Rave Machine". Therefore, I created a machine that moves to the beat. The center part of the machine is called the "Radiant Spike" since it looks spiky however its only the 3D shape box that is rotating on the X-axis, Y-axis and the Z-axis. It didn't rotate because in the For Loop down below, I had placed 100 loops for the box rotation and it seems my laptop can't handle that amount of loops in rotation of the 3D shape box. I had also combined the 2nd Visual with the 4th Visual, to make it look like there are beams of light coming out from the machine. The two 3D shape boxes that are connected to the center of the machine are rotating on the X-axis.

```Java
public void render()
{
    // THIS IS THE SPIKY MACHINE IN THE MIDDLE BETWEEN THE TWO MACHINE TUBES
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
        ssv.strokeWeight(2);       
        ssv.box(300 * ssv.smoothedAmplitude);
        ssv.popMatrix();
        rot += 10;    
    } 


    // MACHINE TUBE CONNECTED AT THE TOP
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
        


    // MACHINE TUBE CONNECTED AT THE BOTTOM
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
        ssv.strokeWeight(2);       
        ssv.box(900 * ssv.smoothedAmplitude);
        ssv.popMatrix();
        rot += 10;    
    } 

}    
```


# What I am most proud of in the assignment
What I am most proud of in the assignment is the 1st Visual (SunSphere) and the 4th Visual (RadiantSpikeMachine). 
The 1st Visual relates to the lyrics at the beginning of the song. Since, the 4th Visual relates to the title of the song, I created a spiky looking machine with two tubes connecting to the machine, one at the top and one at the bottom. I also combined the 2nd Visual with the 4th Visual to make it look as if lights were beaming out of the machine. In the end, I enjoyed creating the Music Visuals based on the chosen song. 


# Screenshots of the 4 Visuals

# Music Visualization Youtube Video

Youtube Link:

![Image] (images/MUSICVISUALISERPROJECT.png)

[![Youtube] ] (https://www.youtube.com/watch?v=q9dnLUhOlIg)


