package WrapperClassPractice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map ;
        Sample1<Integer, String , ?> sample = new Sample1<>(45,"Duygu",36);
        //sample.setThird("karthik");
        System.out.println(sample);

    }
}
