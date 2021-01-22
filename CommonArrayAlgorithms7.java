public class CommonArrayAlgorithms7
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.print("[");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if(i < array.length - 1)
            {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int element : array)
        {
            sum += element;
        }

        average = sum / array.length;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] randomArray= CommonArrayAlgorithms.createRandomArray(5, 5);
        System.out.print(randomArray[0]);

        for (int i = 1; i<=randomArray.length-1; i++){

            System.out.print("|" + randomArray[i]);
        }

    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index (or -1 if not found)
     */
    public static int linearSearch( int valueToFind )
    {
        int[] linearArray = createRandomArray(5, 10);
        for(int i = 0; i < linearArray.length; i++)
        {
            System.out.println(i + ": " + linearArray[i]);
        }

        for (int i = 0; i < linearArray.length; i++){
            if (valueToFind == linearArray[i])
            {
                System.out.print(i);
                return i;
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("-1");
        return -1;

    }

    /*
     * Array Algorithm #4: Count Less Than
     *  creates an array filled with random numbers
     *  counts the number of elements that are less than the specified value
     *  prints the array and the count
     */
    public static void countLessThan( int limit )
    {
        int[] newArray = createRandomArray(15, 100);

        int count = 0;

        for (int element : newArray){
            if (element < limit){
                count++;
            }
        }

        printArray(newArray);

        System.out.println("Count: " + count);

    }

    /*
     * Array Algorithm #5: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int max = 0;

        int[] array = createRandomArray(10, 100);
        printArray(array);

        for( int element : array)
        {
            if (element > max)
            {
                max = element;
            }
        }

        System.out.println("The max value is: " + max);

    }

    /*
     * Array Algorithm #6: Reverse Array
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] reverseArray()
    {
        int[] a = createRandomArray(5,50);
        int[] b = new int[5];

      
        for(int i = a.length - 1; i > -1; i--)
        {
            //a[i] = b[b.length - i];
            b[a.length -1 - i] = a[i];

        }
        printArray(a);
        printArray(b);

        return b;

    }

}
