import java.util.*;
public class symmetricpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
				if(j>=2){
					System.out.print(j + " ");
				}
				else{
					System.out.print(j);
				}
			}
            System.out.println();
        }
    }
}
