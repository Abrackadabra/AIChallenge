import java.io.*;
import java.util.*;
import java.math.*;

//2/27/12 4:41 PM
//by Abrackadabra

public class MyException extends Exception {
    public MyException(String when, String name, String message) {
        super(when + "\n" + name + " failed because " + message);
        System.err.println(message);
    }
}