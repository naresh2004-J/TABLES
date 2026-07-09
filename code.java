import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the number you want for table:");
        int a = scan.nextInt();
        
        for(int i=1;i<=10;i=i+1){
            
            System.out.println(i+"x"+a+"=" + i*a);
        }
    }
    
}
