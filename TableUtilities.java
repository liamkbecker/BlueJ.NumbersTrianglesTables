 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String returnString = "";
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                if((i*j) > 99) {
                    returnString = returnString + (i * j) + " |";
                }
                else if((i*j) > 9){
                    returnString = returnString + " " + (i * j) + " |";
                } else {
                    returnString = returnString + "  " + (i * j) + " |";
                }
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }

    public static String getLargeMultiplicationTable() {
        String returnString = "";
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if((i*j) > 99) {
                    returnString = returnString + (i * j) + " |";
                }
                else if((i*j) > 9){
                    returnString = returnString + " " + (i * j) + " |";
                } else {
                    returnString = returnString + "  " + (i * j) + " |";
                }
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }

    public static String getMultiplicationTable(int tableSize) {
                String returnString = "";
                for(int i = 1; i <= tableSize; i++){
                    for(int j = 1; j <= tableSize; j++){
                        if((i*j) > 99) {
                            returnString = returnString + (i * j) + " |";
                        }
                        else if((i*j) > 9){
                            returnString = returnString + " " + (i * j) + " |";
                        } else {
                            returnString = returnString + "  " + (i * j) + " |";
                        }
                    }
                    returnString = returnString + "\n";
                }
                return returnString;
    }
}
