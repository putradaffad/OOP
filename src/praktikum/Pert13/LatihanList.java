package praktikum.Pert13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatihanList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Bravo");
        list.add("Charlie");
        list.add("Delta");

        // Menampilkan data asli
        System.out.println("Data asli: " + list);

        // Membalik data
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("Data setelah dibalik: " + reversedList);

        // Mengacak data
        List<String> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("Data setelah diacak: " + shuffledList);

        // Mengurutkan data
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("Data setelah diurutkan: " + sortedList);
    }
}