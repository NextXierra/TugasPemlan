package latihan;

import java.util.ArrayList;

/**
 *
 * @author Xierra
 */
public class deretList {
    public static void main(String[] args) {
        ArrayList deret = new ArrayList<>();
        System.out.println("Panjang deret Sebelum ditambah element: " + deret.size());
        for (int i = 0; i < 10; i++) {
            deret.add(i * 10);
        }
        System.out.println("Panjang deret Setelah ditambah Element: " + deret.size());
        for (int i = 0; i < deret.size(); i++) {
            System.out.println("Deret ke-" + (i + 1) + " : " + deret.get(i));
        }
        System.out.println("Update Nilai");
        deret.set(6, 600);
        deret.set(7, 700);
        deret.set(8, 800);

        System.out.println(deret.get(6));
        System.out.println(deret.get(7));
        System.out.println(deret.get(8));
    }
}
