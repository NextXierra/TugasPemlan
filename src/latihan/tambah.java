package latihan;

import java.util.ArrayList;

/**
 *
 * @author Xierra
 */
public class tambah {
    public static void main(String[] args) {
        ArrayList angka = new ArrayList<>();
        
        angka.add(100);
        angka.add(200);
        angka.add(1, 150);
        angka.add(300);
        angka.remove(0);

        int jumlah = 0;
        for (int i = 0; i < angka.size(); i++) {
            jumlah += (int) angka.get(i);
        }
        
        System.out.println("Angka yang ada di dalam list: " + angka);
        System.out.println("Jumlah total angka: " + jumlah);
        
    }
    
}
