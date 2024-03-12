package ie.tudublin;

import c22712031.*;

public class Main {

    public void startUI() {
        String[] a = { "MAIN" };
        processing.core.PApplet.runSketch(a, new SofiasVisual());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startUI();
    }
}