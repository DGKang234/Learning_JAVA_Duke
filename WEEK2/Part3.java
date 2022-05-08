
import edu.duke.*;
import java.io.*;

public class Part3 {
    public String twoOccurrences (String stringa, string stringb) {
        int start = stringb.toLowerCase().indexOf(stringA.toLowerCase());
        if (start = -1) {   // if stringa exist in stringb
            return ""
        }
        else {      // if stringa exist at least once
            int twice = stringb.toLowerCase().indexOf(stringa.toLowerCase()), start + stringa.toLwerCase().length());
            
            if (twice == -1) {  // if there is no other stringa in stringb
                return false;
            }
            else {              // another stringa is found in stringb
                return true;
            }
        }
    }
 

    public String lastPart(String stringa, String stringb) {
        int start = stringb.toLowerCase().indexOf(stringa.toLowerCase());  
        if (start == -1) {  // stringa doesn't exist in stringb
            return stringb;
        }
        else{               // returns the part of stringb that follows stringa
            return stringb.substring(start + stringa.toLowercase().length());
        }
    }


    public void testStrings() {
    	boolean a = twoOccurrences("by", "A story by Abby Long");
    	boolean b = twoOccurrences("a", "banana");
    	boolean c = twoOccurrences("atg", "ctgtatgta");
    	System.out.println("***   ***   ***");
    	//System.out.println("String a " + a);
    	System.out.println("Result a " + a);
    	System.out.println("Result b " + b);
    	System.out.println("Result c " + c);

    	String strA = lastPart("an", "banana");
    	String strB = lastPart("zoo", "forest");
    	System.out.println("The part of the string after an in banana is " + strA);
    	System.out.println("The part of the string after zoo in forest is " + strB);
    }
}


