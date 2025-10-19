//Power Doubling Triangle




import java.util.*;
public class Fcp084 {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
		System.out.println("0");
		int value=2;
		if(n>1){
		    for(int i=2;i<=n;i++){
               for(int j=1;j<=i;j++){
				   if(j==1){
					   System.out.print(value + " ");
					   value *=2;
				   }
				   else{
					   System.out.print(value+ " ");
				   }
			   }
			   System.out.println();
			}
		}
	}
}
       