public class Q13 {
    /*13. Write a program to print the following pattern:
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2 */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + (j < i ? "*" : ""));
            System.out.println();
        }
        for (int i = 5; i >= 2; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + (j < i ? "*" : ""));
            System.out.println();
        }
    }    
}