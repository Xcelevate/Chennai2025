import java.util.*;
public class FCP0019{
 public static void main(String[] args){
  Scanner a = new Scanner(System.in);
  double Bill = a.nextInt();
  if(Bill<=50){
    Bill= Bill*0.50;
  }else if(Bill<=150){
    Bill = (Bill-50)*0.75 + 25;
  }else if(Bill <= 250){
    Bill = (Bill-150)*1.20 + 100;
  }else if(Bill>250){
    Bill = (Bill-250)*1.50 + 220;
  }
   double finalBill = Bill+ (Bill*20/100);

  System.out.println(finalBill);
 }
}