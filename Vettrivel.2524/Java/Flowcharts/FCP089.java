import java.util.*;

public class FCP089{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int k=1;
int u=0;
for(int i=0;i<n;i++){
System.out.print("0  ");
}
System.out.println();

for(int f=0;f<n-2;f++){
u=0;
for(int j=0;j<k;j++){
System.out.print("x  ");
u++;
}
for(int p=u;p<n-k;p++){
System.out.print("0  ");
}
for(int l=0;l<k;l++){
System.out.print("x  ");
}
k+=1;
System.out.println();
}

for(int i=0;i<n;i++){
System.out.print("0  ");
}
}
}

