


public class NumberUtilities {

    public static String getRange(int stop) {
        String returnString = "";

        for(int i = 0; i < stop; i++){
            returnString = returnString + i;
        }

        return returnString;

    }

    public static String getRange(int start, int stop) {
        String returnString = "";

        for(int i = start; i < stop; i++){
            returnString = returnString + i;
        }

        return returnString;
    }


    public static String getRange(int start, int stop, int step) {
        String returnString = "";

        for(int i = start; i < stop; i = i + step){
            returnString = returnString + i;
        }

        return returnString;
    }

    public static String getEvenNumbers(int start, int stop) {
        String returnString = "";

        for(int i = start; i < stop; i++){
            if(i % 2 == 0) {
                returnString = returnString + i;
            }
        }

        return returnString;
    }


    public static String getOddNumbers(int start, int stop) {
        String returnString = "";

        for(int i = start; i < stop; i++){
            if(i % 2 == 1) {
                returnString = returnString + i;
            }
        }

        return returnString;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String returnString = "";
        int toPower;

        for(int i = start; i <= stop; i++){
            toPower = (int) Math.pow(i, exponent);
            returnString = returnString + toPower;
        }

        return returnString;
    }
}
