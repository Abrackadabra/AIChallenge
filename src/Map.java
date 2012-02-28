import java.io.*;
import java.util.*;
import java.math.*;

//2/27/12 4:23 PM
//by Abrackadabra

public class Map {
    int width, height, startX, startY;
    int[][] map;
    
    Map(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        width = Integer.parseInt(br.readLine());
        height = Integer.parseInt(br.readLine());
        startX = Integer.parseInt(br.readLine());
        startY = Integer.parseInt(br.readLine());
        for (int i = 0; i < height; i++) {
            String s = br.readLine();
            for (int j = 0; j < width; j++) {
                if (s.charAt(j) == '#') map[j][i] = -2;
                if (s.charAt(j) == '.') map[j][i] = -1;
                //if (s.charAt(j) == '')
            }
        }                                  
    }
}