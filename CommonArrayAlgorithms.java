public class CommonArrayAlgorithms
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
        int[] array = createRandomArray( 10, 50 );
        for(int i: array)
        {
            if(i!=array[array.length-1])
                System.out.print(i + "|");
                
            else
                System.out.print(i);
        }
        System.out.println();
        printArray( array );
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index (or -1 if not found)
     */
    public static void linearSearch( int valueToFind )
    {
        int[] array = createRandomArray(10, 20);
        int value = 0;
        for(int i=0; i<array.length; i++)
        {
            if(array[i] == valueToFind)
            {
                value = i;
                break;
            }
        }
        printArray(array);
        if (value !=0)
        {
            System.out.println(value);
        }
        else
        {
            System.out.println(-1);
        }

    }

    /*
     * Array Algorithm #4: Count Less Than
     *  creates an array filled with random numbers
     *  counts the number of elements that are less than the specified value
     *  prints the array and the count
     */
    public static void countLessThan( int limit )
    {
        int count = 0;
        int[] array1 = createRandomArray( 10, 50 );
        
        for (int i = 0; i < array1.length; i++)
        {
            if (array1[i] < limit)
            {
                count += 1;
            }
        }
        printArray(array1);
        System.out.println("The count is " + count + ".");

    }

    /*
     * Array Algorithm #5: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int max = 0;
        int[] a = createRandomArray(10, 100);
        for(int element : a)
        {
         if(element>max)
         max=element;
        }
        printArray(a);
        System.out.println("The max value is: "+ max);

    }

    /*
     * Array Algorithm #6: Reverse Array
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] reverseArray(int length, int maxValue )
    {
        int[] randomArray = new int[length];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[i] = (int)(Math.random() * maxValue);
        }
        
        int j = 0;
        int[] reversedArray = new int[length];
        
        for (int i = randomArray.length - 1; i >= 0; i--)
        {
            reversedArray[j] = randomArray[i];
            j+= 1;
        }
        
        // prints random array
        System.out.print("[");
        
        for(int i = 0; i < randomArray.length; i++)
        {
            System.out.print(randomArray[i]);
            if(i < randomArray.length - 1)
            {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
        
        // prints reversed array
        System.out.print("[");
        
        for(int i = 0; i < reversedArray.length; i++)
        {
            System.out.print(reversedArray[i]);
            if(i < reversedArray.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        return reversedArray;

    }

}