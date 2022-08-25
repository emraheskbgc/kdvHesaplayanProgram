import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOran;
        kdvOran=0.18;
        System.out.println("Bir Tutar Giriniz : ");
        tutar=input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = kdvTutar + tutar;

        System.out.println(kdvliTutar);
        System.out.println(kdvTutar);



    }
}
