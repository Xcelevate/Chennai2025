import java.util.Scanner;
public class FCP021 {
  public static void secondMax_8(int a, int b, int c, int d, int e, int f, int g, int h){
     int max, second;
     if(a > b){
       max = a;
       second = b;
     }
     else{
       max = b;
       second = a;
     }
     if(c > max) {
       second = max;
       max = c;
     }
     else if(c > second) {
       second = c;
     }
     if(d > max) {
        second = max;
        max = d;
     }
     else if(d > second) {
         second = d;
     }
     if(e > max) {
        second = max;
        max = e;
     }
     else if(e > second) {
        second = e;
     }
     if(f > max) {
        second = max;
        max = f;
     }
     else if(f > second) {
        second = f;
     }
     if(g > max) {
        second = max;
        max = g;
     }
     else if(g > second) {
         second = g;
     }
     if(h > max) {
        second = max;
        max = h;
     }
     else if(h > second) {
        second = h;
     }
     System.out.println(second);
    }
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int e = sc.nextInt();
     int f = sc.nextInt();
     int g = sc.nextInt();
     int h = sc.nextInt();
     secondMax_8(a,b,c,d,e,f,g,h);
   }
}
     


     