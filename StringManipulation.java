/* Name: Yujin Bae
   Date: February 4, 2022
   Teacher: Ms. Krasteva
   Program Description: compares two strings regardless of case
*/

public class StringManipulation {
    public static void main(String [] args) {
        System.out.println(compareRegardlessCase("hahAh", "HaHah"));
    }

    public static boolean compareRegardlessCase (String strA, String strB) {
        boolean equal = true;  //for now
        int length = strA.length();
        
        //see if the two strings have equal length
        if (length == strB.length()){
            for (int i = 0; i<length; i++){
                char a = strA.charAt(i);
                char b = strB.charAt(i);
                //if the char a is uppercase, change it to lowercase
                if ( a >= 'A' && a <= 'Z')
                {
                    a+=32;
                }
                //if the char b is uppercase, change it to lowercase
                if ( b >= 'A' && b <= 'Z')
                {
                    b+=32;
                }
                if (a != b){
                equal = false;
                }
            }
            
        } else //if the strings aren't equal in length
        {
        equal = false;
        }
        
        //return thye result
        if (equal == false){
            return false;
        } else {
            return true;
        }
    }//end
}//end of class