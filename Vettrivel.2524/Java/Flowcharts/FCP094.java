import java.util.*;

public class FCP094{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int y=n;
int p=1;
int t=n*n;
int l=-1;
int q=0; 
for(int i=0;i<t-1;i++){
if(i<y){
for(int j=1;j<n;j++){
System.out.print(" ");
}
n-=1;
System.out.print("*");
for(int k=1;k<=l;k++){
System.out.print(" ");
}
l+=2;
if(i!=0){
System.out.print("*");
}
System.out.println();
q=l;
}

else{
for(int j=1;j<=p;j++){
System.out.print(" ");
}
p+=1;
q-=4;
System.out.print("*");
for(int k=1;k<=q;k++){
System.out.print(" ");
}
q-=1;
if(i!=0){
System.out.print("*");
}
System.out.println();
}


}




}
}





