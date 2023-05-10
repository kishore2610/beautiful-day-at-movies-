import java.util.Scanner;
import java.lang.*;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res=0;
        for(int i=a;i<=b;i++)
        {
            int d=i;
            int e=0;
            while(d>0)
            {
              int r=d%10;
              e=e*10+r;
              d=d/10;
            }
            int dif=Math.abs(i-e);
            if(dif%c==0) 
               res++;
            
        }
        System.out.println(res);
        
    }
}