package praktikum.Pert13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Date", "Elderberry"));

        // Tampilkan data pada list
        System.out.println("Original List: " + list);

        // Balik data pada list
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("Reversed List: " + reversedList);

        // Acak data pada list
        List<String> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("Shuffled List: " + shuffledList);

        // Urutkan data pada list
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("Sorted List: " + sortedList);
    }
}