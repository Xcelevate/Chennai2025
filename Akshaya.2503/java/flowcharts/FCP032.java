import java.util.*;
public class FCP032{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=1;
int count=1;
for(i=1;i<=num;i++){
if(num%i==0){  
count=count+1;                                                                                                                                      
if(count==3){
System.out.println("yes");
break;
}
else{
System.out.println("no");
break;
}
}
}
}
}


