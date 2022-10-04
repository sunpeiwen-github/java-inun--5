import java.util.*;
class TriangleException extends Exception
{
    TriangleException()
    {
        super("输入的三条边不能构成三角形");
    }
}
class Triangle
{
    float a,b,c;

    Triangle(float a,float b,float c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void check()
    {
       try {
           if (!(Math.abs(a + b) > c && Math.abs(a - b) < c)) {//
               throw new TriangleException();
           }
       }
       catch (TriangleException e)
       {
           System.out.println(e.getMessage());
           System.exit(0);
       }
    }
    void girth()
    {
        System.out.println("周长"+(a+b+c));
    }
    void area()
    {
        double s,p;
        p=(a+b+c)/2;
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("面积"+s);
    }

}
public class Test {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        Triangle tri=new Triangle(a,b,c);
        tri.check();
        tri.girth();
        tri.area();
    }

}
