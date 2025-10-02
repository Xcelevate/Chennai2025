import java.util.*;

public class Fcp075 {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
int[][] c = new int[b][b];

for(int i=0;i<b;i++){
for(int j=0;j<b;j++){
c[i][j] = a.nextInt();
}
}

for(int i=0;i<b;i++){
for(int j=0;j<b;j++){
System.out.println(c[j][i]);
}
}

}
}
