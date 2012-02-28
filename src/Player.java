import java.io.*;
import java.util.*;
import java.math.*;

//2/27/12 4:23 PM
//by Abrackadabra

public class Player {
    int x, y;
    String name;

    Process process;
    BufferedReader br;
    PrintWriter out;

    Player(String command, String name) throws MyException {
        this.name = name;
        try {
            process = Runtime.getRuntime().exec(command);
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
        } catch (Exception e) {
            process.destroy();
            throw new MyException("Player init", name, e.getMessage());
        }
    }
    
    void feedMap(Map map) {
        out.print(map);
        out.flush();
    }
}