import java.io.File;
import edu.duke.*;

public class PerimeterAssignmentRunner {              // class

    public double getPerimeter (Shape s) {  // this method has a parameter s (type shape)
        // Start with totalPerim = 0    
        double totalPerim = 0.0;            // double-type variable is initialized it as 0
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();    // a new Point object (prevPt) initialized as the output of the getLastPoint method from the object s
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) { // for currPt (point-type var) in s.getPoints()
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);  // currDist var initialize it by referencing another method (dist)
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;         // update the totalPerim var
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }   



    public int getNumPoints (Shape s) {
        // initialize the int-type variable, count,  with 0 
        int count = 0;
        // for curr Pt in s.getPoints()
        for (Point currPt : s.getPoints()) {
            // python : count += 1
            count++;
        }
        return count;
    }



    public double getAverageLength (Shape s) {
        double average = getPerimeter(s) / getNumPoints(s);
        
        return average;
    }



    public double getLargestX (Shape s) {
        double largest_X = 0.0;
        for (Point currPt : s.getPoints()) {
            double currPt_X = currPt.getX();
            if (currPt_X > largest_X) largest_X = currPt_X;
        }
        return largest_X;
    }



    public double getLargestSide (Shape s) {
        double largest = 0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            if (currDist > largest ) largest = currDist;
            prevPt = currPt;
            }
        return largest;
    }



    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0.0;
        FileResource largestFile = null;

        for(File f : dr.selectedFiles()){
            FileResource file = new FileResource(f);
            Shape shape = new Shape(file);
            double perim = getPerimeter(shape);
            if(perim > largestPerim) {
                largestPerim = perim;
            }
        }
        return largestPerim;
    }



    public String getFileWithLargestPerimeter() {
        
        DirectoryResource dr = new DirectoryResource();
        
        double largestPerimeter = 0.0;
        File largestFile = null;
        
        for (File f : dr.selectedFiles()) {
            FileResource file = new FileResource(f);
            Shape shape = new Shape(file);
            double perimeter = getPerimeter(shape);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
                largestFile = f;
            }
        }
        return largestFile.getName();
    }




    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int numPoints = getNumPoints(s);
        double avgLength = getAverageLength(s);
        double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        System.out.println("perimeter = " + length);
        System.out.println("Number of points = " + numPoints);
	    System.out.println("Average length = " + avgLength);
        System.out.println("The largest side in the shape = " + largestSide);
        System.out.println("The largest x point in the shape = " + largestX);
    }



    public void testPerimeterMultipleFiles() {
        double largestPeriMultiFIle = getLargestPerimeterMultipleFiles();
	    String fileName = getFileWithLargestPerimeter();
        System.out.println("The largest perimeter in the directory = " + largestPeriMultiFIle);
	    System.out.println("The largest perimeter in the directory = " + fileName);    
    }



    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }

}

