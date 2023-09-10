import java.util.Scanner;

public class RobberEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
         for(int i=0;i<n;i++){
             if(arr[i]<n){
                 l=1;
             }
             else{
                 l=0;
                 break;
             }
         }
         if(l==1){
             System.out.print("YES");
         }
         else{
             System.out.print("NO");
         }
    }
}
