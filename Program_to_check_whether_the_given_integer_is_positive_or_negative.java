import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Positive Number");
        }
    }
}