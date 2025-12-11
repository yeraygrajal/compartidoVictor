import java.util.Scanner;

public class ProyectoCompartido {

    public static void main(String[] args) {

        System.out.println("Introduce tu nombre");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();




        int numeroCaracteres = nombre.length();

        System.out.println("Tu nombre tiene "+numeroCaracteres+" caracteres");
    }



}

