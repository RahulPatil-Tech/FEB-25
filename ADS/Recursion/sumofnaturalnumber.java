package ADS.Recursion;

public class sumofnaturalnumber {
    int sum(int n){
        if(n==0)// if natural if(n>0) then return 0
        {
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        sumofnaturalnumber s = new sumofnaturalnumber();
        System.out.println(s.sum(5));
    }
    
}
