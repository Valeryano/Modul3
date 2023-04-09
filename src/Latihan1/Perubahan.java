package Latihan1;

public class Perubahan {
    private static final int MAX_SIZE = 1000;
    private int top;
    private String[] stackArray;

    public Perubahan() {
        top = -1;
        stackArray = new String[MAX_SIZE];
    }

    public void push(String value) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value;
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        }
        return null;
    }

    public String peek() {
        if (top >= 0) {
            return stackArray[top];
        }
        return null;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i].equals(value)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Perubahan st = new Perubahan();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next: " + st.peek());

        st.push("Raya");
        System.out.println(st.pop());

        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }

        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}