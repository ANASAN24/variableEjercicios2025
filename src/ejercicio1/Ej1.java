package ejercicio1;

public class Ej1 {

    public void ejercicio1(){
        int x = 144;
        int y = 999;

        System.out.printf("""
                X = %d
                Y = %d%n""", x, y);
        System.out.println("X + Y = " + (x+y));
        System.out.println("X - Y = " + (x-y));
        System.out.println("X / Y = " + ((float)x/y));
        System.out.println("X * Y = " + (x*y));
    }

}
