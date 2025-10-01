public class App {
    public static void main(String[] args) throws Exception {
        
        String ROJO = "\033[0;31m";
        String RESET = "\033[0m";

        //Ejercicio 01
        System.out.println(ROJO + """
        EJERCICIO 01:
        """ + RESET);
        int x = 144;
        int y = 999;

        System.out.printf("""
                X = %d
                Y = %d%n""", x, y);
        System.out.println("X + Y = " + (x+y));
        System.out.println("X - Y = " + (x-y));
        System.out.println("X / Y = " + ((float)x/y));
        System.out.println("X * Y = " + (x*y));



        //Ejercicio 02
        System.out.println(ROJO + """

        EJERCICIO 02:
        """ + RESET);        
        String nombre = "Nombre Completo asdasdasd";
        System.out.println(nombre);

        //EJERCICIO 03
        System.out.println(ROJO + """

        EJERCICIO 03:
        """ + RESET); 
        String nombre3 = "Elena Nito del Bosque";
        String direccion = "Calle Rodahuevos, 69 - Guaro (Málaga) - España";
        String telefono = "555 - 123456";

        System.out.printf("""
                %s
                %s
                %s
                """, nombre3, direccion, telefono);

        //EJERCICIO 04
        System.out.println(ROJO + """

        EJERCICIO 04:
        """ + RESET); 

        System.out.print("Conversor de euros a pesetas, escribe la cantidad de euros: ");
        float euro = Integer.parseInt(System.console().readLine());
        int peseta = (int)(euro*166.386f);
        System.out.println(euro + " euros son " + peseta + " pesetas.");

        //EJERCICIO 05
        System.out.println(ROJO + """

        EJERCICIO 05:
        """ + RESET); 

        System.out.print("Conversor de presetas a euros, escribe la cantidad de euros: ");
        int peseta2 = Integer.parseInt(System.console().readLine());
        float euro2 = peseta2*0.00601f;
        System.out.printf("%d pesetas son %.2f euros.", peseta2, euro2);

         //EJERCICIO 06
         System.out.println(ROJO + """

         EJERCICIO 06:
         """ + RESET); 
 
         System.out.print("Escribe el precio de tu producto y se calcula el IVA: ");
         float baseImponible = Float.parseFloat(System.console().readLine());
         float iva = baseImponible*1.21f;

         System.out.printf(
                 "%-15s%15.2f%n" +
                 "%-15s%15.2f%n" +
                 "------------------------------%n" + 
                 "%-15s%15.2f%n"
                 , "Base imponible", baseImponible, "IVA", iva-baseImponible, "Total", iva);

        //EJERCICIO 07
         System.out.println(ROJO + """

         EJERCICIO 07:
         """ + RESET); 
 
         char primeraLetra = 'a';
         char ultimaLetra = 'z';
         String abc = "abecedario";

         System.out.println("" + primeraLetra+ultimaLetra+abc);
         System.out.println(primeraLetra+ultimaLetra+abc);
    }
}
