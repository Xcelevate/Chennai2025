import java.util.ArrayList;
import java.util.Stack;
public class MinStack {
    public static void main(String[] args) {
        stack obj = new stack();
        obj.push(10);
        obj.push(2);
        obj.push(36);
        obj.push(74);
        obj.push(59);
        obj.push(61);
        obj.push(17);
        obj.push(84);

        while(obj.size()>0){
            System.out.println(obj.pop());
        }
    }
}
class stack {
    ArrayList<Integer> arr = new ArrayList<>();
    public void push(int x) {
        if(arr.size()==0) {
            arr.add(x);
            return;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=arr.size()-1;i>=0;i--) {
            if( arr.get(i) < x) {
                st.push(arr.get(i));
            }else{
                break;
            }
        }
        arr.add(x);
        while(!st.isEmpty()) {
            arr.add(st.pop());
        }
    }
    public int pop() {
        if(arr.size()==0) {
            return -1;
        }
        return arr.remove(arr.size()-1);
    }
    public int peek() {
        if(arr.size()==0) {
            return -1;
        }
        return arr.get(arr.size()-1);
    }
    public int size() {
        return arr.size();
    }
}



//Main method for using the stack class

/*public class MinStack {
    public static void main(String[] args) {
        SortedStack s = new SortedStack();

        s.push(45);
        s.push(23);
        s.push(81);
        s.push(15);
        int n = s.size();
        System.out.print("Sorted Stack (top=min): ");
        for (int i = 0; i < n; i++) {
            System.out.print(s.pop() + " ");
        }
        System.out.println(s.list());

    }
}*/


   // stack class implement by arraylist

  /*class SortedStack {
    private ArrayList<Integer> stack;

    public SortedStack() {
        stack = new ArrayList<>();
    }

    public void push(int value) {
        ArrayList<Integer> temp = new ArrayList<>();

        while (!stack.isEmpty() && stack.get(stack.size() - 1) < value) {
            temp.add(stack.remove(stack.size() - 1));
        }

        stack.add(value);


        for (int i = temp.size() - 1; i >= 0; i--) {
            stack.add(temp.get(i));
        }
    }


    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack.remove(stack.size() - 1);
    }


    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public ArrayList<Integer> list() {
        return new ArrayList<>(stack);
    }
}*/
