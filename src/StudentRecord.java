public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /** Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        /* to be implemented in part (a) */
        double average = 0.0;
        for (int count = first;count<=last; count++) {
            average += scores[count];
        }
            average/=last-first+1;
        return average;
    }

    /** Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        /* to be implemented in part (b) */
        int testing = scores[0];
        for (int count=1; count<scores.length; count++){
            if (scores[count]>=testing){
                testing=scores[count];
            }
            else{
                return false;
            }
        }
        return true;
    }

    /** If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        /* to be implemented in part (c) */
        double finalAverage=0.0;
        if (hasImproved()){
            int score = scores.length;
            int a = scores.length/2;
            finalAverage = average(a, scores.length-1);
        }
        else {
            finalAverage = average(0, scores.length-1);
        }
        return finalAverage;
    }

}
