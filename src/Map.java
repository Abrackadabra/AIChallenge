import java.io.*;
import java.util.*;
import java.math.*;

//2/27/12 4:23 PM
//by Abrackadabra

public class Map {
    int width, height, startX, startY;
    int[][] map;

    Map(String file) throws MyException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            width = Integer.parseInt(br.readLine());
            height = Integer.parseInt(br.readLine());
            map = new int[width][height];
            startX = Integer.parseInt(br.readLine());
            startY = Integer.parseInt(br.readLine());
            for (int i = 0; i < height; i++) {
                String s = br.readLine();
                for (int j = 0; j < width; j++) {
                    map[j][i] = charToInt(s.charAt(j));
                }
            }
        } catch (Exception e) {
            throw new MyException("Map init", "Tester", "Map no found or incorrect format");
        }
    }

    int charToInt(int c) {
        if (c == '#') return -2;
        if (c == '.') return -1;
        return 0;
    }

    char intToChar(int i) {
        if (i == -2) return '#';
        if (i == -1) return '.';
        return '0';
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(width + "\n");
        stringBuilder.append(height + "\n");
        stringBuilder.append(startX + "\n");
        stringBuilder.append(startY + "\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                stringBuilder.append(intToChar(map[j][i]));
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}