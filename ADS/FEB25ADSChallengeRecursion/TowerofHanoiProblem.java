package ADS.FEB25ADSChallengeRecursion;
import java.util.*;
public class TowerofHanoiProblem {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Disk 1 moved from " + from_rod + " to " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Disk " + n + " moved from " + from_rod + " to " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
        scanner.close();
    }
}
