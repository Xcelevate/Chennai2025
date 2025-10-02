//FCP018
import java.util.*;
public class grosssalary{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long Salary=sc.nextInt();
		long Hra=0;
		long Da=0;
		if (Salary < 1000){
			return;
		}
		if(Salary<=10000){
			Hra=(long)(Salary*0.2);
			Da=(long)(Salary*0.8);
			Salary=(long)(Salary+Hra+Da); 
			System.out.print(Salary);

		}else if(Salary <= 20000){
			Hra=(long)(Salary*0.25);
			Da=(long)(Salary*0.9);
			Salary=(long)(Salary+Hra+Da);
			System.out.print(Salary);
		}else{
			Hra=(long)(Salary*0.3);
			Da=(long)(Salary*0.95);
			Salary=(long)(Salary+Hra+Da);
			System.out.println(Salary);
		}
	}
}

			
		