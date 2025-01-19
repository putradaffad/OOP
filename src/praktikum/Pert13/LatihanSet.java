package praktikum.Pert13;

import java.util.HashSet;
import java.util.Set;

public class LatihanSet {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Menambahkan elemen ke himpunan A
        for (int i = 1; i <= 5; i++) {
            A.add(i);
        }

        // Menambahkan elemen ke himpunan B
        for (int i = 5; i <= 10; i++) {
            B.add(i);
        }

        // Operasi A - B (selisih)
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("A - B: " + difference);

        // Operasi A ∩ B (irisan)
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("A ∩ B: " + intersection);

        // Operasi A ∪ B (gabungan)
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("A ∪ B: " + union);

        // Operasi A ⊂ B (cek subset)
        boolean isSubset = A.containsAll(B);
        System.out.println("A ⊂ B: " + isSubset);
    }
}
