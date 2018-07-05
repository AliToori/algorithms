/*
 * Sequential search algorithm by Ali
 */
package searchalgos;

/**
 *
 * @author Ali
 */
public class SearchAlgorithm {
    // Searches through every element in the data array until a match is found and returns its position. 
    // Returns -1 if not match is found
    public static int sequentialSearch(int[] data, int element) {
       for(int i: data) {
        if(data[i] == element) {
         return i;
        }
       }
       return -1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a data array to search in
        int[] data = {3,6,9,5,7,4,8,2,1,10,11,12};
        int element = 2;
        int i = SearchAlgorithm.sequentialSearch(data, element);
        System.out.println("Found at: "+i);
    }
}
