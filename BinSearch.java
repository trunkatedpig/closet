/*==================================================
  class BinSearch -- Implements binary search algorithm on an int array.
  Team _____ (Aretha Franklin, Stevie Wonder, James Brown)  

  Summary of Binary Search Algorithm:


  ==================================================*/

public class BinSearch {


    /*==================================================
      int binSearch(int[],int) -- searches an array of ints for target int
      pre:  input array is sorted in ascending order
      post: returns index of target, or returns -1 if target not found
      ==================================================*/
    public static int binSearch ( int[] a, int target ) {
	//uncomment exactly 1 of the 2 stmts below:
	//return binSearchIter( a, target, 0, a.length-1 );
	return binSearchRec( a, target, 0, a.length-1 );
    }


    public static int binSearchRec( int[] a, int target, int lo, int hi ) {
	//*** YOUR IMPLEMENTATION HERE *** 
	return -1; //placeholder
    }


    public static int binSearchIter( int[] a, int target, int lo, int hi ) {
	//*** YOUR IMPLEMENTATION HERE *** 
	return -1; //placeholder
    }



    //tell whether an array is sorted in ascending order
    private static boolean isSorted( int[] arr ) {
	//*** YOUR IMPLEMENTATION HERE *** 
	return false; //placeholder
    }


    // utility/helper fxn to display contents of an array of Objects
    private static void printArray( int[] arr ) {
	String output = "[ "; 

	for( int i : arr )
	    output += i + ", ";

	output = output.substring( 0, output.length()-2 ) + " ]";

	System.out.println( output );
    }


    //main method for testing
    public static void main ( String[] args ) {

	/*==================================================

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	System.out.println("\nNow testing binSearch on int array...");

	//Declare and initialize array of ints
	int[] iArr = { 2, 4, 6, 8, 6, 42 };
	printArray( iArr );
	System.out.println( "sorted? -- " + isSorted(iArr) );

	int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
	printArray( iArr2 );
	System.out.println( "sorted? -- " + isSorted(iArr2) );

	//search for 6 in array 
	System.out.println( binSearch(iArr,6) );

	//search for 43 in array 
	System.out.println( binSearch(iArr,43) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	==================================================*/

    }//end main()

}//end class BinSearch
