package calcolatrice;

import java.util.Arrays;

public class MainCalcolatrice {
    public static void main(String[] args) {

        int operazione = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        if(operazione == 1) {
            System.out.println("Hai scelto addizione, il risultato è: " + (num1 + num2));
        }
        if(operazione == 2) {
            System.out.println("Hai scelto sottrazione, il risultato è: " + (num1 - num2));
        }
        if(operazione == 3) {
            System.out.println("Hai scelto moltiplicazione, il risultato è: " + (num1 * num2));
        }
        if(operazione == 4) {
            System.out.println("Hai scelto divisione, il risultato è: " + (num1 / num2));
        }
        if(operazione > 4 || operazione < 0) {
            System.out.println("Non valido");
        }
    }
}

    //per inserire i parametri: tasto destro sul codice, <More Run/Debug>, <Modify Run Configuration>, inserire in <Program Parameters>
