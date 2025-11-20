import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantos popochos tienes en casa?");

        int n = scan.nextInt();

                if (n == 0) {
                    System.out.println("Te recomendamos obtener un popocho");
                } else if (n == 1) {
                    System.out.println("Este popocho esta muy mimado");
                } else if (n == 2 || n==3) {
                    System.out.println("La familia de popochos está equilibada");
                } else if (n > 3) {
                    System.out.println("Usted tiene demasiados popochos y no quedara espacio en la cama");
                } else {
                    System.out.println("Ese número de popochos no es válido");
                }
        for (int i = 1; i <= n; i++) {
            System.out.println("Todos los popochitos estan durmiendo sosegados");
        }
    }
}