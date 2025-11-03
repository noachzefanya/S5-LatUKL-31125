package LatUKL031125;

import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah Siswa:");
        int Js = in.nextInt();

        double Tn = 0.0;
        for (int i = 1; i <= Js; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = in.nextDouble();
            Tn += nilai;
        }

        double rata = Tn / Js;

        System.out.println("Rata-rata: " + rata);
        in.close();
    }
}