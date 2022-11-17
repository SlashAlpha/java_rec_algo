package slash.code;

public class Factorial {

    // Head recursion
    public  int factorial(int x){
        if(x<=1) return 1;
        else return x*factorial(x-1);

    }
    //Tail recursion
    public int factorialTail(int x, int a){
        if (x<=1) return a;
        else return factorialTail(x-1,x*a);

    }


}
