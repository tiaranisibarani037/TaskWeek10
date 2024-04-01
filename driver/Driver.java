package driver;

import java.util.Scanner;

import model.Merk;
import model.Kijang;
import model.Avanza;
import model.Wuling;
import model.CarsMerk;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Pilih Merk Mobil:");
        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        Merk[] cars_merk = new Merk[3];

        switch (choice) {
            case 0:
                cars_merk[0] = new Kijang();
                break;
            case 1:
                cars_merk[1] = new Avanza();
                break;
            case 2:
                cars_merk[2] = new Wuling();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        for (Merk merk : cars_merk) {
            if (merk != null) {
                merk.merk();
            }
        }

        CarsMerk[] carsMerk = CarsMerk.values();
        System.out.println("Merk Mobil: " + carsMerk[choice]);

        input.close();
    }
}
