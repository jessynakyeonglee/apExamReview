public class wordTester {


    public static String getWord(){
        return "";
    }
    public static boolean wordChecker (String firstLetter, int maxLength, int n) {
        int meetingcriteria=0;
        for (int count = 0; count < n; count++) {
            if (getWord().substring(0, 1).equals(firstLetter) && getWord().length() <= maxLength) {
                meetingcriteria++;
            }
        }
        if (meetingcriteria/n<0.1){
            return true;
        }
        else
            return false;
    }


}

