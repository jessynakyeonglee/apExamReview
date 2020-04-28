public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        int length = 0;
        while (n != 1){
            if (n%2!=0)
                n= 3*n+1;
            else if (n%2==0)
                n= n/2;
            length ++;
        }
        return length + 1;
    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */
        int length = hailstoneLength(n);
        if (n<length) {
            return true;
        }
        else
            return false;

    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
            int Long = 0;
            for (int count=1;count<=n;count++) {
                if (isLongSeq(count)) {
                    Long++;
                }
            }
            return (double)Long/n;
    }

    // There may be instance variables, constructors, and methods not shown.
}
