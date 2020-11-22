import java.util.Random;
public class program4a {
/**
 * 
 * @param arrayRef array to be printed
 */
public static void printArray(int [] arrayRef) {
	for (int element:arrayRef) {
		System.out.print(element + " ");
	}
	System.out.println();
}

/**
 * 
 * @param arrayRef array whose 
 * length will be checked
 * @return true if length is either
 * 2 or 3 and false else
 */
public static boolean check(int [] arrayRef){
	
	if (!(arrayRef.length == 2 || arrayRef.length == 3 )) {
		   return false;
		}
	return true;
}
/**
 * 
 * @param array 
 * 1) the array will be passed through check()
 * 2) the array will be sort in ascending order
 * The goal here is to take the minimum of the series 
 * and to move it on the left side increasing each time 
 * i by 1 index. SO we will compare successively i
 * to all the elements of the array through j and 
 * putting the lower one at the top of the array
 * after each iteration
 */
	public static void sortArray(int[] array) {
	
	if (!check (array)) {
		System.out.println("error...");
		return;
	}
	 for (int i = 0; i < array.length; i++) {
		 for ( int j = i; j < array.length; j++) {
			 
			 /*The goal here is to take the minimum of the series 
			  * and to move it on the left side increasing each time 
			  * i by 1 index. SO we will compare successively i
			  * to all the elements of the array through j and 
			  * putting the lower one at the top of the array
			  * after each iteration
			  */
			 if(array[i] > array [j]) {
				 int temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
			 }
		 }
			
		}
	  
	 }
	/**
	 * 
	 * @param arrayRef to be sorted
	 * @param comment comment on 
	 * the values of the array 
	 * to facilitate testing
	 */
	 public static void task(int [] arrayRef, String comment) {
		System.out.println(comment);
		System.out.print("My new array is : ");
		printArray(arrayRef);
		sortArray(arrayRef);
		System.out.print("Now the array is : ");
		printArray(arrayRef);
		System.out.println();
	 }
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		// error message if length is different than 2 or 3
		int [] array1 = new int [4];
		sortArray(array1);
		int [] array2 = new int [5];
		sortArray(array2);
		
		// big-little
		int [] array8 = {123456789,1};
		task(array8, "big-little");
		
		// little-big
		int [] array9 = {-891,23456791};
		task(array9,"little-big");
     	
     	// little-medium-big
		int [] array10 = {1,568,1235446624};
		task(array10,"little-medium-big");
		
		// little-big-medium
		int [] array13 = {1,1235446624,589};
		task(array13,"little-big-medium");
     
     	// medium-little-big
		int [] array11 = {145,-22225,1235446624};
		task(array11,"medium-little-big");
		
		// medium-big-little
		int [] array14 = {145,1235446624,3};
		task(array14," medium-big-little");
		
		// big-little-medium
		int [] array15 = {1235889,-3,3778};
		task(array15,"big-little-medium");
		
		// big-medium-little
		int [] array16 = {1235889,3778,-99845};
		task(array16,"big-medium-little");
     
		// when the array is too long
		int [] array5 = new int [rand.nextInt(50)+20];
		sortArray(array5);
		
		// when the array is too short
		int [] array6 = new int [1];
		sortArray(array6);
		
		// when the array is already ordered
		int [] array7 = {1,2,3};
		task(array7, "array ordered");
		
		
	}

}
