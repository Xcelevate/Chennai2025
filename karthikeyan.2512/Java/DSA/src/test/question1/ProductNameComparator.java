package test.question1;
import java.util.Comparator;
public class ProductNameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String left;
        String right;
        if (o1 instanceof Product && o2 instanceof Product) {
            left = ((Product) o1).getName();
            right = ((Product) o2).getName();
            return left.compareTo(right);
        } else if (o1 instanceof Product) {
            return -1;
        } else
            return 1;
    }
}
