package birinci;

import java.util.Scanner;

public class birinci {
    public static void main(String[] args) {
        int mat, tarih, cografya, turkce, muzik, beden;
        Scanner mat1 = new Scanner(System.in);
        System.out.print("Matematik sınav notunuz: ");
        mat = mat1.nextInt();
        Scanner tarih1 = new Scanner(System.in);
        System.out.print("Tarih sınav notunuz: ");
        tarih = tarih1.nextInt();
        Scanner cografya1 = new Scanner(System.in);
        System.out.print("Coğrafya sınav notunuz: ");
        cografya = cografya1.nextInt();
        Scanner turkce1 = new Scanner(System.in);
        System.out.print("Türkçe sınav notunuz: ");
        turkce = turkce1.nextInt();
        Scanner muzik1 = new Scanner(System.in);
        System.out.print("Müzik sınav notunuz: ");
        muzik = muzik1.nextInt();
        Scanner beden1 = new Scanner(System.in);
        System.out.print("Beden eğitimi sınav notunuz: ");
        beden = beden1.nextInt();
        double sonuc = (mat + tarih + cografya + turkce + muzik + beden) / 6.0;
        if (sonuc >= 50.0) {
            System.out.println("Genel Ortalamanız: " +sonuc+ " TEBRİKLER ! Derslerden geçtiniz...");
        }
        else {
            System.out.println("Genel ortalamanız: " +sonuc+" MALESEF ! Derslerden kaldınız...");
        }
    }
}
