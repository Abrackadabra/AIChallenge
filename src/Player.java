import java.io.*;
import java.util.*;
import java.math.*;

//2/27/12 4:23 PM
//by Abrackadabra

public class Player {
    int x, y;
    String name;

    Process process;

    Player(String command, String name) throws MyException {
        this.name = name;
        try {
            process = Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            throw new MyException(name, e.getMessage());
        }
    }
}