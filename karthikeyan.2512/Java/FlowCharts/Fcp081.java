//Left-Aligned right Triangle Star Pattern




import java.util.Scanner;
public class Fcp081{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Pattern(a);

}
static void Pattern(int x){
 for(int s=1;s<=x;s++){
    for(int i=1;i<=x-s;i++){
        System.out.print("  ");
    }
    for(int k=1;k<=s;k++){
 System.out.print("* ");
    }
    System.out.println("");  
 }
}

}