package imageProcessing;


import edu.princeton.cs.introcs.Picture;

import java.awt.*;


/*************************************************************************
 * Compilation: javac ConnectedComponentImage.java
 *
 * The <tt>ConnectedComponentImage</tt> class
 * <p>
 * You do the rest....
 *
 * @author Peter Hearne
 *
 *************************************************************************/
public class ConnectedComponentImage {

    public Picture picture;




        public ConnectedComponentImage(String fileLocation) {

            this.picture = new Picture(fileLocation);
        }



        /**
         * Returns the number of components identified in the image.
         *
         * @return the number of components (between 1 and N)
         */

    public int countComponents() {
        // TODO
        return 0;
    }

    /**
     * Returns the original image with each object bounded by a red box.
     *
     * @return a picture object with all components surrounded by a red box
     */
    public Picture identifyComonentImage() {

        int maxX = 0;
        int minX = picture.width();
        int maxY = 0;
        int minY = picture.height();

        for (int x = 0; x < picture.width(); x++) {
            for (int y = 0; y < picture.height(); y++) {
                if (!picture.get(x, y).equals(Color.WHITE) ) {

                    if (x < minX)
                        minX = x;
                    if (x > maxX)
                        maxX = x;
                    if (y < minY)
                        minY = y;
                    if (y > maxY)
                        maxY = y;

                }
            }

        }

        if (minX > maxX || minY > maxY) {
            System.out.println("It's All White Pixels!!!");
        } else {
            for (int x = minX; x <= maxX; x++) {
                picture.set(x, minY, Color.RED);
                picture.set(x, maxY, Color.RED);
            }

            for (int y = minY; y <= maxY; y++) {
                picture.set(minX, y, Color.RED);
                picture.set(maxX, y, Color.RED);
            }
        }

        picture.show();
        return null;
    }





    /**
     * Returns a picture with each object updated to a random colour.
     *
     * @return a picture object with all components coloured.
     */
    public Picture colourComponentImage() {
        picture = getPicture();
        if (picture != null) {
            int width = picture.width();
            int height = picture.height();
            double thresholdPixelValue = 128.0;
            // convert to grayscale
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    Color c = picture.get(x, y);
                    if (Luminance.lum(c) < thresholdPixelValue) {
                        picture.set(x, y, Color.RED);
                    } else {
                        picture.set(x, y, Color.WHITE);
                    }
                }
            }
        }
        picture.show();
        return null;


    }



        public Picture getPicture () {

            Picture picture = new Picture("C:/Users/Owner/IdeaProjects/connected-component-image/images/shapes.bmp");

            return picture;
        }


        /**
         * Returns a binarised version of the original image
         *
         * @return a picture object with all components surrounded by a red box
         */

    public Picture binaryComponentImage() {

        picture = getPicture();
        if (picture != null) {
            int width = picture.width();
            int height = picture.height();
            double thresholdPixelValue = 128.0;
            // convert to grayscale
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    Color c = picture.get(x, y);
                    if (Luminance.lum(c) < thresholdPixelValue) {
                        picture.set(x, y, Color.BLACK);
                    } else {
                        picture.set(x, y, Color.WHITE);
                    }
                }
            }
        }
        picture.show();
        return null;
    }
}


