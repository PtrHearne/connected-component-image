package imageProcessing;


import java.awt.Color;
import edu.princeton.cs.introcs.Picture;
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

    static Long     counter = 0l;
    private String  fileLocation;
    private Picture picture;
    private int     height;
    private int     width;
    public Long     id;



    public ConnectedComponentImage(String fileLocation) {
        this.fileLocation = fileLocation;
        this.picture      = new picture(fileLocation);
        this.id           = counter++;
        this.height       = new height;
        this.width        = new width;
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
              // convert to grayscale
              for (int x = 0; x < width; x++) {
                  for (int y = 0; y < height; y++) {
                      Color color = picture.get(x, y);
                      Color gray = Luminance.toGray(color);
                      picture.set(x, y, gray);
                  }
                  picture.show();
              }
          }
        return null;
    }

    public String getFileLocation() {

        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        fileLocation = "C:/Users/Owner/IdeaProjects/connected-component-image/images/shapes.bmp";
        this.fileLocation = fileLocation;
    }
