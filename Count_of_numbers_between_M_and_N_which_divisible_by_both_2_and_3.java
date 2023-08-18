import java.util.*;
public class num
{
    public static void main(String[] args)
    {
        int i,n,m,c=0;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        for (i=m;i<=n;i++)
        {
            if (i%2==0&&i%3==0)
            {
              c++;
            }
        }
        System.out.println(c);
        
    }
}