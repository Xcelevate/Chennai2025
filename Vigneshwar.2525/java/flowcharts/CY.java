import java.util.*;

public class CY {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
int c = b/2;
int d = b/2, e = 0;

for(int f=1;f<c;f++){
int g = 1, h = b;
while(g<=d){
if(f<g){break;}
else{g++;}
}
while(g<=d){
if(g<h){
while(h>g){
int i = f+g+h;
if(b==i){e++;}
h--;
}
h = b;
g++;
}
else{g++;}
}
}

System.out.println(e);

}
}
