import java.util.ArrayList;
import java.lang.String;

public class Pengeluaran {
    public static void main(String[] args) {
        //membuat ArrayList untuk nyimpen data pengeluaran
        ArrayList<Integer> pengeluaran = new ArrayList<>();

        //nambahin data pengeluaran ke ArrayList
        pengeluaran.add(5000);
        pengeluaran.add(35000);
        pengeluaran.add(27000);

        System.out.println("Data Pengeluaran :");

        //data pengeluaran integer di konversi ke string pake String.valueOf,lalu mengakses elemen dengan indeks
        String pengeluaran1 = String.valueOf(pengeluaran.get(0));
        String pengeluaran2 = String.valueOf(pengeluaran.get(1));
        String pengeluaran3 = String.valueOf(pengeluaran.get(2));

        //menampilkan hasil detail pengeluaran
        System.out.println(pengeluaran1 + " beli seblak");
        System.out.println(pengeluaran2 + " renovasi kamar");
        System.out.println(pengeluaran3 + " laundry pakaian");

        //membuat ArrayList untuk nyimpen data pemasukan
        ArrayList<Integer> pemasukan = new ArrayList<>();

        //nambahin data pemasukan ke ArrayList
        pemasukan.add(10000000);
        pemasukan.add(256000);
        pemasukan.add(759000);

        System.out.print("\n");
        System.out.println("Data Pemasukan :");

        //data pemasukan integer di konversi ke string pake String.valueOf, lalu mengakses elemen dengan indeks
        String pemasukan1 = String.valueOf(pemasukan.get(0));
        String pemasukan2 = String.valueOf(pemasukan.get(1));
        String pemasukan3 = String.valueOf(pemasukan.get(2));

        //menampilkan hasil detail pemasukan
        System.out.println(pemasukan1 + " gaji bulanan");
        System.out.println(pemasukan2 + " jualan baju");
        System.out.println(pemasukan3 + " affiliate");


        System.out.print("\n");

        //menghitung total pengeluaran
        int totalPengeluaran = 0;
        for (int keluar : pengeluaran) {
            totalPengeluaran += keluar;
        }
        System.out.println("Total Pengeluaran : " + totalPengeluaran);

        System.out.print("\n");

        //menghitung total pemasukan
        int totalPemasukan = 0;
        for (int masuk : pemasukan) {
            totalPemasukan += masuk;
        }
        System.out.println("Total Pemasukan : " + totalPemasukan);


        //menghitung sisa uang yang tersisa
        System.out.print("\nSisa uang : ");
        System.out.print(totalPemasukan - totalPengeluaran);



    }
}
