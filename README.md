# Music Visualiser Project

| Student Number | Name                 |
| -------------- | -------------------- |
| C22712031 | Sofia Claire Rabadon |

# Description of the assignment
The song I have chosen is called Rave Machine by Tony Junior and BEAUZ. The type of genre is Electronic and the style of the song is Happy Hardcore which means it is a Hardcore Dance Music. 

I created 4 different visuals based on how I interpret the whole song in relation to the lyrics as well as the mood and the tempo.

# Instructions
- Pressing the R key = To REWIND the whole song
- Pressing the P key = To PAUSE the song 
- Pressing the C key = To CONTINUE the song where it was last paused
- Pressing the 0, 1, 2, and 3 keys = Displays each different visual based on how I interpret the song.

# How it works

The 4 Visuals were created using only For Loops.

## Visual 1
There is a mixture of 2D and 3D shapes which I implemented for the 1st Visual. 
As I mixed the 2D and 3D shapes, I created the sun because the lyrics mentioned 'sun', 'dawn', 'sunrise' and 'morning'. Both of the 2D and 3D shapes are rotating on the Z-axis.

### Sphere
The sphere represents the center of the sun.
### Box
The box rotates at the back of the sphere which it is shown on the outer part of the sphere.
### Line
The line that looks like a hexagon is actually the 2D shape line.
### Triangle
The triangle is the lines that is sticking out from the sphere.

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
```Java
```
## Visual 3
In the 3rd Visual, I have only used one 3D shape within a For Loop because it represents the buildup for the next drop of the song.
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
```Java
```

# What I am most proud of in the assignment

# Screenshots of the 4 Visuals

# Music Visualization Youtube Video

Youtube Link: https://youtu.be/q9dnLUhOlIg


