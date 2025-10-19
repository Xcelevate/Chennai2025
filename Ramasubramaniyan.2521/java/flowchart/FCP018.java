import java.util.Scanner;
public class FCP018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bs = s.nextInt();
	double hra=0;
double da=0;
double gs=0;
	if(bs<=10000)
	{
	hra= bs*0.2;
	da=bs*0.8;
	gs=bs+hra+da;
	}
	else{
	if(bs<=20000)
	{
	hra=bs*0.25;
	da=bs*0.9;
	gs=bs+hra+da;
	}
	else{
	hra=bs*0.3;
	da=bs*0.95;
	gs=bs+hra+da;
	}}
	System.out.println(gs);
}
}