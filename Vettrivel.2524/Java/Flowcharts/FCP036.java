import java.util.*;
public class FCP036{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

long M = scanner.nextLong();
long N = scanner.nextLong();
long min = 0;
long pro = 0;
if(M>N)
min=N;
else
min=M;
long HCF=0;
long LCM=0;
for(int i=1;i<=min;i++){
if(N%i==0){
	if(M%i==0){
		HCF = i;
		}
	}	
}
pro = N*M;
LCM = pro/HCF;
System.out.println(HCF);
System.out.println(LCM);
}
}

