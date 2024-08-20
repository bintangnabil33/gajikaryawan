import java.util.Scanner;

public class Gajikaryawan {
      public static void main(String[] args) {
        
        double jamkerja, tarif, pajak, totalgaji;

        Scanner input = new Scanner(System.in);
        System.out.println("masukan jumlah jam kerja");
        jamkerja = input.nextDouble();
        System.out.println("masukan tarif perjam");
        tarif = input.nextDouble();
        System.out.println("masukan pajak");
        pajak = input.nextDouble();

        totalgaji = jamkerja*tarif;
        pajak = pajak/100*totalgaji;
        totalgaji = totalgaji-pajak;
        System.out.println("total gaji setelah pajak"+ totalgaji);
    }
}
    

