import java.util.*;
public class num
{
    public static void main(String[] args)
    {
        int i,n,sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=1;i<=n;i++)
        {
            sum+=i;
        
        }
        System.out.print(sum);
        
    }
}