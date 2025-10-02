import java.util.*;
public class countofeven{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int rem=0;
		int sum=0;
		int count=0;
		if(n<1 || n>10000){
			return;
		}
		
		for(int i=2;i<=n;i+=2){
			boolean even=true;
			if(i>9){ 
				int temp=i;
				while(temp>0){
					rem=temp%10;
					if(rem%2!=0){
						even=false;
						break;
						
					} 
					temp=temp/10;
					
				}
				
				if(even==true){
					count+=1;
				} 
			}
			else{
				count+=1;
			}
		}
		System.out.println(count);
	}
}
				