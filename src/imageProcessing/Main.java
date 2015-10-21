package imageProcessing;

import edu.princeton.cs.introcs.Picture;

import java.awt.*;

/**
 * Created by Owner on 10/21/2015.
 */
public class Main {


    public static void main(String[] args) {

        ConnectedComponentImage cc = new ConnectedComponentImage("C:/Users/Owner/IdeaProjects/connected-component-image/images/shapes.bmp");
        cc.binaryComponentImage();
        cc.colourComponentImage();
        cc.identifyComonentImage();
    }


}