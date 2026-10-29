
package ClassObject;

import java.util.Scanner;

class Sepeda {
    String merk;
    int jarakTempuh;

    // Constructor
    public Sepeda(String merk) {
        this.merk = merk;
        this.jarakTempuh = 0;
    }

    // Method bergerak maju
    public void bergerakMaju() {
        jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
    }

    // Method bergerak mundur
    public void bergerakMundur() {
        jarakTempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
    }

    // Method berhenti
    public void berhenti() {
        System.out.println("Sepeda Berhenti");
    }

    // Method menampilkan jarak tempuh
    public void tampilkanJarak() {
        System.out.println("Object Sepeda " + merk
                + ", Jarak tempuh " + jarakTempuh + " Km");
    }
}
    

