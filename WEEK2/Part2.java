import edu.duke.*;
import java.io.*;

public class Part2 { 
    public String findSimpleGene (String dna, String startCodon, String stopCodon) {
        int start = dna.toLowerCase().indexOf(startCodon.toLowerCase());
        if (start == -1) {      // no ATG
            return "";
        }
        
        //if (stop == -1) {
        //    return "";          // no TAA

        int stop = dna.toLowerCase().indexOf(stopCodon.toLowerCase(), start+3);
        if ((stop-start) % 3 == 0) {
            return dna.substring(start, stop+3);
        }

        else {                  // no TAA or the length of the substring between the “ATG” and “TAA” is not  a multiple of 3,
            return "";
        }
    }



    public void testSimpleGene() {
    	String strDNAwithNoATG = "cccgtggggtttaaataataataggagagagagagagagttt";
    	String strDNAwithNoTAA = "cccatggggtttatatattagtaggagagagagagagagttt";
    	String strDNAwithNoATGorTAA = "cccatggggtttatatattagtaggagagagagagagagttt";
        String strDNAwithATGandTAA = "cccatggggtttgaataataataggagagagagagagagttt"; // ATG, TAA, (stop-start) % 3 == 0 
    	String ap = "atggggtttaaataataatag"; // ATG, TAA, (stop-start) % 3 != 0
    	
    	String a = "ATGCCCTAA";
    	String result = findSimpleGene(a, "atg", "taa");
    	System.out.println("***   ***   ***");
    	//System.out.println("String a " + a);

    	if (result != "")
    	{
    		System.out.println("Result " + result);
    	}
    	else {
    	        System.out.println("No result");
    	}

    	/*
    	if (ap.equals(result)) {
    		System.out.println("success for " + ap + " length " + ap.length());
    	}
    	else {
    		System.out.println("mistake for input: " + a);
    		System.out.println("got: " + result);
    		System.out.println("not: " + ap);
    	}
    	*/
    }


    public void realTesting() {
    	DirectoryResource dr = new DirectoryResource();
    	for (File f : dr.selectedFiles()) {
    		FileResource fr = new FileResource(f);
    		String s = fr.asString();
    		System.out.println("read " + s.length() + " characters");
    		String result = findSimpleGene(s, "atg", "taa");
    		System.out.println("found " + result);
    	}
    }
}

