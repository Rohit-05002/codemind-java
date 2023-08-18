import java.util.*;
public class num
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=2*n;i>=2;i--){
        if (i%2==0)
        {
        System.out.print(i +" ");
        }
            
        }
    }
}