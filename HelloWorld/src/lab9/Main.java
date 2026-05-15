package lab9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock clock = new Clock();
 
        System.out.println("Choose clock setup: 1-Manual  2-Auto");
        int setupChoice = sc.nextInt();
 
        if (setupChoice == 1) {
            System.out.print("Enter year month day hour minute second: ");
            int y = sc.nextInt(), mon = sc.nextInt(), d = sc.nextInt();
            int h = sc.nextInt(), min = sc.nextInt(), s = sc.nextInt();
            clock.setClock(y, mon, d, h, min, s);
        } else {
            clock.autoSetClock();
        }
 
        System.out.println("Choose tick mode: 1-Default(1000s)  2-Custom");
        int tickChoice = sc.nextInt();
 
        if (tickChoice == 1) {
            clock.tickClock();
        } else {
            System.out.print("Enter tick seconds: ");
            int tick = sc.nextInt();
            clock.tickClock(tick);
        }
 
        sc.close();
    }
}