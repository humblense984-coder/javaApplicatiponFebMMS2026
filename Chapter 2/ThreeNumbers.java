import java.util.Scanner;
public class ThreeNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
		
        int a=input.nextInt(), b=input.nextInt(), c=input.nextInt();
		
        System.out.printf("Sum %d%nAvg %d%nProd %d%n",a+b+c,(a+b+c)/3,a*b*c);
        int small=a; if(b<small) small=b; if(c<small) small=c;
        int large=a; if(b>large) large=b; if(c>large) large=c;
        System.out.printf("Smallest %d%nLargest %d%n",small,large);
    }
}