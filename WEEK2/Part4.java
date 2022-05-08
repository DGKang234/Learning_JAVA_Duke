import edu.duke.*;
import java.io.*;


public class Part4 {
    public void readURL(String urlString, String checkWord) {
        String quotes = "\"";       // \" will look for quotation mark "
        String result = "";
        URLResource resource = new URLResource(urlString);
        //System.out.println(resource);
        for (String currWord : resource.words()) {
            int check = currWord.toLowerCase().indexOf(checkWord.toLowerCase()); // first index
            //System.out.println("currWord " + currWord);
            if (check >= 0) {
                //System.out.println("check the first index of {checkWord} " + check);
                
                int start = currWord.toLowerCase().lastIndexOf(quotes, check) + 1;
                int end = currWord.toLowerCase().indexOf(quotes, check);
                //System.out.println("Sanity CHECK: start " + start + " end " + end);

                if (start >= 0 && end > 0) {
                    result = currWord.substring(start, end);
                    System.out.println(result);
                }
            }
        }
    }
    
    public void testStrings() {
        readURL("https://www.dukelearntoprogram.com/course2/data/manylinks.html", "youtube.com");
    }
}

