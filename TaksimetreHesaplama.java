import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double km,min=20,acilis=10,ucret=2.20,tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç km yol gidildi? : ");
        km=inp.nextDouble();
        tutar = (km *ucret) + 10;

        double dbl= tutar < 20 ? 20 : tutar;

        System.out.println("Yol ücretiniz: " +dbl);

    }
}
