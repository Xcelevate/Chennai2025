package recursive;

public class Recursive {
    static int count = 9;
    public static void main(String[] args) {
        //recursive(10);
       //System.out.println(new recursive.Recursive().factorial(4));
        //System.out.println(new recursive.Recursive().factorial(1));
       new Recursive().fibonacci(10 );

//        new recursive.Recursive().count = 100;
//        System.out.println(new recursive.Recursive().count);
    }
    public static void recursive(int n){
        if (n != 0) {
            System.out.println(n);
            recursive(n - 1);

        }
        else
            System.out.println("end of the program");
    }
    public int factorial(int n){
        if(n > 0){
            return n * factorial(n - 1);
        }
        else {
            return 1;
        }
    }
    public void fibonacci(int n){
        new Recursive().fibonacci(n , 0 , 1);
    }

    public void fibonacci(int n,int curr , int next){
        if(n > 0){
               System.out.print (curr + "  ");
               fibonacci(n - 1,next ,curr + next);
        }
        else{
            System.out.println();
            System.out.println("end of the program");
        }
    }
}
