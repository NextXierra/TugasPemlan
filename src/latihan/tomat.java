package latihan;

import java.util.ArrayList;

/**
 *
 * @author Xierra                                                                                                              
 */
public class tomat {
    public static void main(String[] args) {
        String tomato = "Tomat";
        ArrayList fruit = new ArrayList<>();
        fruit.add("Apel");
        fruit.add(tomato);
        fruit.add("Garlik");
        fruit.set(2, "Manggo");
        fruit.remove(tomato);
        fruit.add("Durian");
        fruit.add("Cucumber");
        fruit.remove(3);
        System.out.println(fruit);

    }
    
}
