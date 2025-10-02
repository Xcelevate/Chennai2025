//Palindromic Number Pyramid




import java.util.Scanner;
 public class Fcp088{
 public static void main(String[]args){
Scanner kk=new Scanner(System.in);
 int a=kk.nextInt();
Pattern(a);
}
static void Pattern(int x){
 for(int i=1;i<=x;i++){
      for(int h=1;h<=x-i;h++){
         System.out.print("  ");}
        int z=x;
      for(int j=1;j<=i;j++){    
          System.out.print(z + " ");
          z -=1;
       }z=z+2;
      for(int k=1;k<i;k++){
        System.out.print(z + " ");
          z +=1;
         }
System.out.println("");
}
  
for(int i=x-1;i>0;i--){
      int z=x;
          for(int j=1;j<=x-i;j++){
         System.out.print("  ");
          }
          for(int k=1;k<=i;k++){
           System.out.print(z + " ");
            z -=1;}
            z +=2;
           for(int k=1;k<i;k++){
            System.out.print(z + " ");         
             z +=1;
            }
             System.out.println("");         

}
}
}      
