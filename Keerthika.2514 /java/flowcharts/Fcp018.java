import java.util.*;
public class Fcp018{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int BS=sc.nextInt();
if(BS<=10000){
	double HRA=0.20*BS;
	double DA=0.80*BS;
	double GS=BS+HRA+DA;
	System.out.println(GS);
	}
else{
	if(BS<=20000){
	double HRA=0.25*BS;
	double DA=0.90*BS;
	double GS=BS+HRA+DA;
	System.out.println(GS);
	}
	else{
	double HRA=0.30*BS;
	double DA=0.95*BS;
	double GS=BS+HRA+DA;
	System.out.println(GS);
	}
}
}
}