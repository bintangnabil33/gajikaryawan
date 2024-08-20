import java.util.Scanner;

public class Pembelianbarang {
    public static void main(String[] args) {
        
        double hargabarang, jumlahbarang, diskon, totalharga;

        Scanner input = new Scanner(System.in);
        System.out.println("masukan harga barang");
        hargabarang = input.nextDouble();
        System.out.println("masukan jumlah barang yang dibeli");
        jumlahbarang = input.nextDouble();
        System.out.println("masukan diskon");
        diskon = input.nextDouble();

        totalharga = hargabarang*jumlahbarang;
        diskon = diskon/100*totalharga;
        totalharga = totalharga-diskon;
        System.out.println("total harga setelah diskon"+totalharga);
    }
}
