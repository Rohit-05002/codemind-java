import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>50 && b>60 && c>100){
            System.out.println("10");
        }
        else if(a>50 && b>60){
            System.out.println("9");
        }
        else if(c>100 && b>60){
            System.out.println("8");
        }
        else if(a>50 && c>100){
            System.out.println("7");
        }
        else if(a>50 || b>60 || c>100){
            System.out.println("6");
        }
        else{
             System.out.println("5");
        }
    }
}