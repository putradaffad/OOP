package praktikum.Pert13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatihanList2 {
    public static void main(String[] args) {
        List<Mahasiswa> list = new ArrayList<>();
        list.add(new Mahasiswa("123", "Andi"));
        list.add(new Mahasiswa("124", "Budi"));
        list.add(new Mahasiswa("125", "Citra"));
        list.add(new Mahasiswa("126", "Dewi"));

        // Menampilkan data asli
        System.out.println("Data asli: " + list);

        // Membalik data
        List<Mahasiswa> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println("Data setelah dibalik: " + reversedList);

        // Mengacak data
        List<Mahasiswa> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("Data setelah diacak: " + shuffledList);

        // Mengurutkan data berdasarkan nama
        List<Mahasiswa> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println("Data setelah diurutkan: " + sortedList);
    }
}