import java.util.Scanner;
public class GreatestCommonDivisorAndLeastCommonMultiple {
    public static void main(String []args)
    {
        System.out.println("输入两个数");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int MAX,MIN;
        if(m>=n)
        {
            MAX=m;
            MIN=n;
        }
        else{
            MAX=n;
            MIN=m;
        }
        for(int i=MAX;;i++)
        {if(i%m==0&&i%n==0)
        {
            System.out.println("最小公倍数是"+i);
            break;
        }
        }
        for(int j=MIN;;j--)
        {
            if(m%j==0&&n%j==0)
            {
                System.out.println("最大公约数是"+j);
                break;
            }
        }
    }

}
