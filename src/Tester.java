import java.io.*;
import java.util.*;
import java.math.*;

//2/27/12 4:22 PM
//by Abrackadabra

public class Tester {
    public static void main(String[] args) {
        //new Tester().test(args[0], args[1]);
        new Tester().run();
    }

    //github --- dprokoptsev/196-labs

    void run() {
        try {
            Player one = new Player("dsadsa", "first");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void test(String commandA, String commandB) {

    }
}