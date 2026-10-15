import java.util.Scanner;
public class LargestSmallest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
		
        int a=input.nextInt(), b=input.nextInt(), c=input.nextInt(), d=input.nextInt(), e=input.nextInt();
        int large=a, small=a;
        if(b>large) large=b; if(b<small) small=b;
        if(c>large) large=c; if(c<small) small=c;
        if(d>large) large=d; if(d<small) small=d;
        if(e>large) large=e; if(e<small) small=e;
        System.out.printf("Largest %d Smallest %d%n",large,small);
    }
}