import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            float x1=s.nextInt();
            float x2=s.nextInt();
            float y1=s.nextInt();
            float y2=s.nextInt();
            float car1 =y1/x1;
            float car2 =y2/x2;
            if(car1<car2){
                System.out.println(-1);
            }
            else if(car1==car2){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
    }
}