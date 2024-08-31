import java.util.Stack;

public class StackReverse {

    public static void sortStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int value = st.pop();
        sortStack(st);

        insertInSorted(st, value);
    }

    public static void insertInSorted(Stack<Integer> st, int value){
        if(st.isEmpty() || st.peek() < value){
            st.push(value);
            return;
        }

        int top = st.pop();

        insertInSorted(st, value);

        st.push(top);

    }

    public static void reverseStack(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }

        int value = st.pop();
        reverseStack(st);

        insertAtBottom(st, value);
    }

    public static void insertAtBottom(Stack<Integer> st, int value){
        if(st.isEmpty()){
            st.push(value);
            return ;
        }

        int top = st.pop();
        insertAtBottom(st, value);

        st.push(top);
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);

        System.out.println("Original Stack: " + st);
//
//        reverseStack(st);
//
//        System.out.println("reversed Stack: " + st);

        sortStack(st);

        System.out.println("sorted Stack: " + st);

    }
}
