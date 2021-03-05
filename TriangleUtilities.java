 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String returnString = "";
        for(int i = 0; i < numberOfStars; i++){
            returnString = returnString + "*";
        }
        return returnString;
    }
    
    public static String getTriangle(int numberOfRows) {
        String returnString = "";
        for(int i = 1; i <= numberOfRows; i++){
            for(int j = 1; j <= i; j++){
                returnString = returnString + "*";
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }


    public static String getSmallTriangle() {
        String returnString = "";
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                returnString = returnString + "*";
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }

    public static String getLargeTriangle() {
        String returnString = "";
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                returnString = returnString + "*";
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }
}
