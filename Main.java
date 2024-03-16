// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(xToN(2,4));
        System.out.println(Factorial(4));
        System.out.println(Fibonacci(8));
        reverse("ayse",4);
        System.out.println();
        System.out.println(Hanoi(3));
        int[] arr={1,2,3,4,5};
        System.out.println(Sum(arr,arr.length));
        System.out.println(Polındrom("1232"));


    }
    public static double xToN(double x,int n){
        if (n==0) return 1;
        else{
            double y=xToN(x,n-1);
            double result=x*y;
            return result;
        }

    }
    public  static int Factorial(int x){
        if (x==0) return 1;
        else{
            int nMinus1Factorial=Factorial(x-1);
            int result=x*nMinus1Factorial;
            return result;

        }
    }
    public  static int Fibonacci(int n){
        if (n==1|| n==2) return 1;
        else{
            int f1=Fibonacci(n-1);
            int f2=Fibonacci(n-2);
            int result=f1+f2;
            return result;
        }
    }
    public static void reverse(String str,int n){
        if (n==0) return;
        else{
            System.out.print(str.charAt(n-1));
            reverse(str,n-1);

        }
    }
    public static int Hanoi(int n){
        if (n==0) return 0;
        else{
            int result=(2*Hanoi(n-1))+1;
            return result;
        }

    }
    public  static int Sum(int[] arr,int n){
        if (n<=0) return 0;
        else{
            int result=arr[n-1]+Sum(arr,n-1);
            return result;
        }
    }

    public static boolean Polındrom(String str){
        if (str.length()<=1) return true;
        else{
            char first=str.charAt(0);
            char last=str.charAt(str.length()-1);
            if (first!=last) return false;
        }

        String remainıng=str.substring(1,str.length()-1);
        return Polındrom(remainıng);
    }

























}