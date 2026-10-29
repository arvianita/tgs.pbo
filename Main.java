
package ClassObject;

  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Sepeda polygon = new Sepeda("Polygon");

        System.out.println(
            "Object Polygon dibuat, jarak tempuh awal 0 km"
        );

        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    polygon.bergerakMaju();
                    polygon.tampilkanJarak();
                    break;

                case 2:
                    polygon.bergerakMundur();
                    polygon.tampilkanJarak();
                    break;

                case 3:
                    polygon.berhenti();
                    System.out.println(
                        "Object Sepeda " + polygon.merk
                        + ", Jarak tempuh akhir "
                        + polygon.jarakTempuh + " Km"
                    );
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();

        } while (pilihan != 0 && pilihan != 3);

        input.close();
    }
}