import edu.duke.*
import java.io.*


public class FindGeneWhile{
    public Strin gfindGene (String dna) {
        // Find first occurrence of "ATG" codon call its index as "startIndex" variable
        int startIndex = dna.toLowerCase().indexOf("ATG");
        // Find the "TAA" starting from (startIndex+3), call its index as "currIndex" variable
        int currIndex = dna.toLowerCase().indexOf("TAA", startIndex + 3

        // As long as currIndex is not equal to -1
        while (currIndex != -1 {
            // Check if (currIndex - startIndex) is a multiple of 3
            if ((currIndex - startIndex) % 3 == 0) {
                // If so, print the text between startIndex and currIndex+3
                return dna.substring(startIndex, currIndex + 3);
            }
            
            // If not, update currIndex to the index of the next of the next TAA
            else {
                currIndex = dna.toLowerCase().indexOf("TAA", currIndex + 1);
            }
        }

        return "";
    }
