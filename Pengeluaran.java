import java.util.ArrayList;
import java.lang.String;

public class Pengeluaran {
    public static void main(String[] args) {
        ArrayList<Integer> pengeluaran = new ArrayList<>();

        pengeluaran.add(5000);
        pengeluaran.add(35000);
        pengeluaran.add(27000);

        System.out.println("Data Pengeluaran :");

        String pengeluaran1 = String.valueOf(pengeluaran.get(0));;
        String pengeluaran2 = String.valueOf(pengeluaran.get(1));
        String pengeluaran3 = String.valueOf(pengeluaran.get(2));;

        System.out.println(pengeluaran1 + " beli seblak");
        System.out.println(pengeluaran2 + " renovasi kamar");
        System.out.println(pengeluaran3 + " laundry pakaian");


    }
}
