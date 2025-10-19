import java.util.Scanner;
public class FCP096
 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	int p, q, r = 0, s, t;
	for(int u=0;u<n;u++){
	arr[u] = sc.nextInt();
	}
	for(int u=0;u<n-1;u++){
	q=0;p=0;r=0;
	q = arr[u];
	s = u+1;
	while(s<n){
	if(q>arr[s]){
	q = arr[s];
	r = s;
	}
	s++;
	}
	if(r!=0){
	p = arr[u];
	arr[u] = q;
	arr[r] = p;
	}
	}
	System.out.println(" ");
	for(int u=0;u<n;u++){
	System.out.println(arr[u]);
	}
    }
}
