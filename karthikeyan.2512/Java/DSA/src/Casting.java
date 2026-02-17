public class Casting {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show1();// it returns the method of A class
        A obj2 = new B();
     //   obj2.show2(); // it will not return the answer because there is no method called show2 in A.eventhough obj2 is instance of B ,its a type of A.
        A obj3 =(A) new B();// this is called upcasting.
        obj3.show1(); // here,if i don't put (A) it will work for obj3.but i'm explicitily doing this.

        B obj4 = (B)obj2; // this is called down casting.
        obj4.show2();//obj 4 is a type of A .With this we can't call show2 that's why casting is happening .
        A obj5 = obj2;
        obj5.show1();
    }
    //each class has extended from object class
}
class A extends Object{
    void show1(){
        System.out.println("in A show 1");
    }
}
class B extends A{
    void show2(){
        System.out.println("in B show 2");
    }
}
