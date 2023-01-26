import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        List<String> nombres=new ArrayList<>();
        System.out.println("Ingrese la cantidad de nombres de su lista");
        Integer N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un nombre");
            String nombre = input.next();
            nombres.add(nombre);



        }
        Collections.sort(nombres);
        nombres.remove(2);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }

}