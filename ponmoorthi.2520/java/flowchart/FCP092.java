import java.util.Scanner;
public class FCP092 {
	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int y = x.nextInt();
	for(int q=1;q<=y;q++){
	for(int r=1;r<=y;r++){
	if(q==1||q==y||r==y||r==1){
	System.out.print("* ");
	}
	else{
	System.out.print("  ");
	}
	}
	System.out.println();
	}

     }
}
