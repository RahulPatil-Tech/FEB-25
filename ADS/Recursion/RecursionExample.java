package ADS.Recursion;
class Recursion {
        //static int i = 0;
        static /*void*/ int show(int n) {
            if(n==4/*n<5 */){ //base case
                return n;
            }
            else{
                return 2 * show(n+1);
                //System.out.println("Hello");
                //++n;
                //show();
            }
        }
    public static void main(String[] args) {
        System.out.println(show(2));
    }
}