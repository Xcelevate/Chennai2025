import java.util.*;
public class birth{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int Birth_Date=s.nextInt();
		s.nextLine();
		String Birth_Month=s.nextLine();
		int Birth_Year=s.nextInt();
		if(Birth_Date<1 || Birth_Date>31){
			return;
		}
		if(Birth_Year<1900 || Birth_Year>2100){
			return;
		}
		if (
    !Birth_Month.equals("January") &&
    !Birth_Month.equals("February") &&
    !Birth_Month.equals("March") &&
    !Birth_Month.equals("April") &&
    !Birth_Month.equals("May") &&
    !Birth_Month.equals("June") &&
    !Birth_Month.equals("July") &&
    !Birth_Month.equals("August") &&
    !Birth_Month.equals("September") &&
    !Birth_Month.equals("October") &&
    !Birth_Month.equals("November") &&
    !Birth_Month.equals("December")
) {
    return;
}
		
		System.out.println(Birth_Date);
		System.out.println(Birth_Month);
		System.out.println(Birth_Year);
		}
}