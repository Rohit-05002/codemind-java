import java.util.Scanner;
public class l{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        if(a%2==0 && b%2==0){
            System.out.println("YES");
        }
        else if(a==0 && b%2!=0){
            System.out.println("NO");
        }
        else if(a%2==0 && b!=0){
            System.out.println("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}