package praktikum.Pert13;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> A = Set.of(1, 2, 3, 4, 5);
        Set<Integer> B = Set.of(5, 6, 7, 8, 9, 10);

        // Operasi A - B
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.println("A - B: " + difference);

        // Operasi A ∩ B
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println("A ∩ B: " + intersection);

        // Operasi A ∪ B
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.println("A ∪ B: " + union);

        // Operasi A ⊂ B
        boolean isSubset = A.containsAll(B);
        System.out.println("A ⊂ B: " + isSubset);
    }
}
