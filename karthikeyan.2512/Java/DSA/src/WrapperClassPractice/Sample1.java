package WrapperClassPractice;

public class Sample1 <A , B , C >{
    private A first;
    private B second;
    private C third;
    public Sample1(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public A getFirst() {
        return this.first;
    }
    public void setFirst(A first) {
        this.first = first;
    }
    public B getSecond() {
        return this.second;
    }
    public void setSecond(B second) {
        this.second = second;
    }
    public C getThird() {
        return this.third;
    }
    public void setThird(C karthik) {
        this.third = third;
    }
    public Sample1(){

    }
    @Override
    public String toString() {
        return "Sample1 { " + "first= " + first + ", second= " + second + ", third= " + third + '}';
    }
}
