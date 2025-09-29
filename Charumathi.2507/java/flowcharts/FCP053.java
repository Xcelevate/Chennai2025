import java.util.*;
public class FCP053{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int[ ] natNum=new int[ n ];
int i;
for(i=0;i<n; i++){
natNum[ i ]=i+1;
}
i=0;
while(i<n){
System.out.println(natNum[ i ]);
i++;
}
}
}
