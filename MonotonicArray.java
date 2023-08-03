import java.util.ArrayList;

public class MonotonicArray {
    public boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1))
                ;
            dec = false;
        }
        return inc || dec;

    }

    public static void main(String args[]) {
        // assignment question didnot completed

    }

}
