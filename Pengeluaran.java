import java.util.ArrayList;

public class Pengeluaran {
    public static void main(String[] args) {
        ArrayList<Integer> pengeluaran = new ArrayList<>();

        pengeluaran.add(100);
        pengeluaran.add(50);
        pengeluaran.add(200);

        System.out.println("Data Pengeluaran:");
        for (int item : pengeluaran){
            System.out.println(item);
        }

    }
}
