import java.util.ArrayList;
import java.lang.String;

public class Pengeluaran {
    public static void main(String[] args) {
        ArrayList<Integer> pengeluaran = new ArrayList<>();

        pengeluaran.add(5000);
        pengeluaran.add(35000);
        pengeluaran.add(27000);

        System.out.println("Data Pengeluaran :");

        String pengeluaran1 = String.valueOf(pengeluaran.get(0));
        String pengeluaran2 = String.valueOf(pengeluaran.get(1));
        String pengeluaran3 = String.valueOf(pengeluaran.get(2));

        System.out.println(pengeluaran1 + " beli seblak");
        System.out.println(pengeluaran2 + " renovasi kamar");
        System.out.println(pengeluaran3 + " laundry pakaian");

        ArrayList<Integer> pemasukan = new ArrayList<>();

        pemasukan.add(10000000);
        pemasukan.add(256000);
        pemasukan.add(759000);

        System.out.print("\n");
        System.out.println("Data Pemasukan :");

        String pemasukan1 = String.valueOf(pemasukan.get(0));
        String pemasukan2 = String.valueOf(pemasukan.get(1));
        String pemasukan3 = String.valueOf(pemasukan.get(2));

        System.out.println(pemasukan1 + " gaji bulanan");
        System.out.println(pemasukan2 + " jualan baju");
        System.out.println(pemasukan3 + " affiliate");

        System.out.print("\n");
        int totalPengeluaran = 0;
        for (int keluar : pengeluaran) {
            totalPengeluaran += keluar;
        }
        System.out.println("Total Pengeluaran : " + totalPengeluaran);

        System.out.print("\n");
        int totalPemasukan = 0;
        for (int masuk : pemasukan) {
            totalPemasukan += masuk;
        }
        System.out.println("Total Pemasukan : " + totalPemasukan);



    }
}
