package imageProcessing;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


/**
 * Created by Owner on 10/21/2015.
 */
public class Main {

    private ConnectedComponentImage cc;



    public Main (){

        runMenu();

    }

    public static void main(String[] args) {

        Main app = new Main();

    }

    private int menuOne()
    {
        StdOut.println("please chose an image");
        StdOut.println("---------");
        StdOut.println("  1) bacteria");
        StdOut.println("  2) crosses");
        StdOut.println("  3) image 1");
        StdOut.println("  4) shapes");
        StdOut.println("  5) stars");
        StdOut.println("  6) stars2");
        StdOut.println("  0) Exit");
        StdOut.print("==>> ");
        int option = StdIn.readInt();
        return option;
    }
    private int menuTwo()
    {
        StdOut.println("please chose an option");
        StdOut.println("---------");
        StdOut.println("  1) binaryComponentImage");
        StdOut.println("  2) colourComponentImage");
        StdOut.println("  3) identifyComonentImage");
        StdOut.println("  0) Exit");
        StdOut.print("==>> ");
        int option = StdIn.readInt();
        return option;
    }
    private void runMenu()
    {
        int option = menuOne();
        while (option != 0)
        {

            switch (option)
            {
                case 1:    this.cc = new ConnectedComponentImage("C:/Users/Owner/IdeaProjects/" +
                             "connected-component-image/images/bacteria.bmp");
                    break;
                case 2:    this.cc = new ConnectedComponentImage("C:/Users/Owner/IdeaProjects/" +
                            "connected-component-image/images/crosses.gif");
                    break;
                case 3:    this.cc = new ConnectedComponentImage("C:/Users/Owner/IdeaProjects/" +
                        "connected-component-image/images/image1.jpg");
                    break;
                case 4:    this.cc = new ConnectedComponentImage("C:/Users/Owner/IdeaProjects/" +
                        "connected-component-image/images/shapes.bmp");
                    break;
                case 5:    this.cc = new ConnectedComponentImage("C:/Users/Owner/IdeaProjects/" +
                        "connected-component-image/images/stars.jpg");
                    break;
                case 6:    this.cc = new ConnectedComponentImage("C:/Users/Owner/IdeaProjects/" +
                        "connected-component-image/images/STARS2.jpg");
                    break;

            }


            StdOut.println("\nPress any key to continue...");


            //clear the terminal window and display the main menu again

            switch (option = menuTwo()) {
                case 1:    cc.binaryComponentImage();
                    break;
                case 2:    cc.colourComponentImage();
                    break;
                case 3:    cc.identifyComonentImage();
                    break;
               case 4:    cc.countComponents();
                    break;
                default:    StdOut.println("Invalid option entered: " + option);
                    break;
            }
            StdOut.println("\nPress any key to continue...");
            option = menuTwo();
        }

        //the user chose option 0, so exit the program
        StdOut.println("Exiting... bye");
        System.exit(0);
    }



}