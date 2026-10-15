import java.util.Scanner;

public class Separate {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
		
        System.out.print("Enter 5 digits: "); int n=input.nextInt();
        System.out.printf("%d   %d   %d   %d   %d%n",n/10000,(n/1000)%10,(n/100)%10,(n/10)%10,n%10);
    }
}