package imageProcessing;


import edu.princeton.cs.introcs.Picture;
import edu.princeton.cs.introcs.In;
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

    public String  fileLocation;
    public Picture picture;




    public ConnectedComponentImage(String fileLocation,Picture picture) {
        this.fileLocation = new fileLocation;
        this.picture      = new picture;

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

        return null;

    }

    /**
     * Returns a picture with each object updated to a random colour.
     *
     * @return a picture object with all components coloured.
     */
    public Picture colourComponentImage() {

        return null;

    }

    public Picture getPicture() {

        return picture;
    }

    }

    /**
     * Returns a binarised version of the original image
     *
     * @return a picture object with all components surrounded by a red box
     */
    public Picture binaryComponentImage() {


          if(picture != null) {
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
          }picture.show();
        return null;
    }


}
