package day3;

public class ModuleExp {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.   
        if(m==1) return 0;

        long ans=1;
        long xx = x;
        while(n>0)
        {
            if(n%2==1)
            {
                ans=((ans)%m*(xx)%m)%m;
            }
            n = n >>1;
            xx = ((xx)%m *(xx)%m)%m;
        }
        return (int)(ans%m);
    }
}
