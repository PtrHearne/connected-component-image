package imageProcessing;

import edu.princeton.cs.introcs.Picture;
import edu.princeton.cs.introcs.StdOut;

import java.awt.*;


/**
 * Created by Owner on 10/30/2015.
 */
public class CountComponent {


    public Picture picture;
    private int[] id;
    private int count;
    private int[] sz;
    //private int[][] xy;

    public CountComponent(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }

    }

       public static void main(String[] args) {
         {


            Picture picture = new Picture("C:/Users/Owner/IdeaProjects/" +
                    "connected-component-image/images/shapes.bmp");
            if (picture != null) {
                int x = picture.width();
                int y = picture.height();
                int[][] xy = new int[x][y];
                 int N = xy.length;
                CountComponent ccp = new CountComponent(N);
                double thresholdPixelValue = 128.0;
                for (int i = 0; i < x; i++)
                    for (int j = 0; j < y; j++) {
                        Color c = picture.get(x, y);
                        if (Luminance.lum(c) < thresholdPixelValue) {
                            picture.set(x, y, Color.BLACK);
                        } else {
                            picture.set(x, y, Color.WHITE);
                        }
                        while (!picture.get(x, y).equals(Color.WHITE)) {
                            int q = xy[0][0];
                            int p = xy[0][0];
                            if (ccp.connected(p, q)) continue;
                            ccp.union(p, q);


                            StdOut.println(ccp.count() + " components");
                        }
                    }
            }

         }
    }


    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    public int count() {


        return count;
    }

    public int find(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p), j = root(q);
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
            count--;
        }
    }


}
