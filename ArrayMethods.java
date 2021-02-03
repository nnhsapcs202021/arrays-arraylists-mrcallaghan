import java.util.Arrays;

public class ArrayMethods
{
   private int[] k;
   
   private int[] nums = {1, 4, 9, 16, 25};
   public ArrayMethods(int[] initialValues)
   {
      this.values = initialValues;
   }
   public void printArray()
   {
      System.out.println(Arrays.toString(this.values));
   }
   public void swapFirstAndLast()
   {
      
   }
   
   /*
     * 2. Shift all elements by one to the right and move the last element into
     *      the first position. For example, 1 4 9 16 25 would be transformed into
     *      25 1 4 9 16.
     */
   public void shiftRight()
   {
      int temp = this.nums[this.nums.length-1]; // temporarily store the last element
      
      for(int i = this.nums.length-1; i > 0;i--) // iterate backward through the array
      {
        this.nums[i] = this.nums[i-1]; // assign the element to the left to i
        }
        
      this.nums[0] = temp; // move the last element to the beginning
   }
   

   public static void main( String[] args )
   {
      int[] testValues = new int[]{ 3, 5, 6, 1 /* add your own values */ };
      ArrayMethods tester = new ArrayMethods( testValues );
      tester.printArray();
      tester.swapFirstAndLast();
      tester.printArray();

      testValues = new int[]{ 1, 6, 3, 9, 5, 6 /* add your own values */ };
      tester = new ArrayMethods(testValues);
      tester.printArray();
      tester.shiftRight();
      tester.printArray();

      
   }
}

