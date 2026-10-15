import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
		
        System.out.print("Weight pounds: "); int w=input.nextInt();
        System.out.print("Height inches: "); int h=input.nextInt();
        int bmi=(w*703)/(h*h);
        System.out.printf("BMI %d%nUnderweight <18.5 Normal 18.5-24.9 Overweight 25-29.9 Obese >=30%n",bmi);
    }
}