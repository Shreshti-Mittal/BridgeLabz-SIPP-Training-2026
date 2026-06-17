
//Build a 'Math Wizard' utility class: isPrime(n), factorial(n) using
//iteration, fibonacci(n), gcd(a,b), lcm(a,b), and power(base, exp).
//Overload factorial to also accept double. Demonstrate scope
//differences between local and instance variables.
import java.util.Scanner;
public class MathWizard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Is Prime: "+isPrime(n));
        System.out.println("Factorial: "+factorial(n));
        System.out.println("Fibonacci: "+fibonacci(n));
        System.out.print("Enter two numbers for GCD and LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: "+gcd(a,b));
        System.out.println("LCM: "+lcm(a,b));
        System.out.print("Enter base and exponent for power calculation: ");
        double base = sc.nextDouble();
        int exp = sc.nextInt();
        System.out.println("Power: "+power(base,exp));
        System.out.print("Enter base and exponent for power calculation (double): ");
        double baseDouble = sc.nextDouble();
        double expDouble = sc.nextDouble();
        System.out.println("Power (double): "+power(baseDouble,expDouble));
        demonstrateScope();
        sc.close();
        
    }
    static int isPrime(int n){
        if(n<=1) return 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
    } 
    static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    static double factorial(double n){
        double fact=1;
        for(double i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    static int fibonacci(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    static double power(double base,int exp){
        double result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        return result;
    }
    static double power(double base,double exp){
        return Math.pow(base,exp);
    }
    static void demonstrateScope(){
        int localVar=10; //local variable
        System.out.println("Local Variable: "+localVar);
    }

}

