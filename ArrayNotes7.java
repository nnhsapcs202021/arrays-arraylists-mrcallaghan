import java.util.GregorianCalendar;

/**
 * Write a description of class Notes here.
 * 
 * @author mrcallaghan
 * @version 20jan2021
 */
public class ArrayNotes7
{
    public static void createArrayOfEvens()
    {
        /*
         * An array is an ordered collection of elements of the same type. The type can be a primitive
         *      type (e.g., int) or a class (e.g., Turtle).
         *      
         *      An array varaible is like an object variable in that it must be declared and initialized.
         *      
         *      The number in the square brackets (i.e., []) specifies the number of elements in the array.
         *      
         *      All elements in the array are initialized to their default values (e.g. 0, false, null).
         *      
         *      This code creates an array that contains 10 int values (all 0 to start).
         */
        int[] evens = new int[10];
        
        /*
         * Set the value  of each element in the array to the first 10 positive even integers.
         * 
         * "length" is used to query the number of elements in the array
         * 
         * Square brackets are used to reference a specific element in the array based on its index.
         *      Indicies are zero based.
         */
        for(int i = 0; i < evens.length; i++)
        {
            evens[i] = (i +1) * 2;
        }
        
        //prints the reference to the array
        System.out.println(evens);
        
        for(int i = 0; i < evens.length; i++)
        {
            System.out.println(i + ": " + evens[i]);
        }
        
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (i.e., curly brackets and comma-separated values) can be used to
         *      initialize an array. The size of the array is inferred based on the number
         *      of elements in the literal.
         */
        int[] odds = new int[] {1,3,5,7,9,11,13,15,17,19};
        
        /*
         * Bounds Error
         * 
         * Arrays have a fixed size once initialized. The index specified must refer to a valid
         *      element. Otherwise,  an ArrayIndexOutOfBounds exception is generated.
         */
        
        for(int i = 0; i <= odds.length; i++)
        {
            //System.out.println(i + ": " + odds[i]);
            
        }
        
        /*
         * Array References
         * 
         * Variables of type array, contain a reference to the array stored in the computer's memory.
         * 
         * Assigning one array variable's value to another, copies the reference, not the array's
         *      elements.         
         */
        
        int[] moreOdds = odds;
        odds[2] = 6;
        System.out.println(moreOdds[2]); // print? 6
        
        /*
         * Enhanced for loops
         * 
         *  Iterates over the elements in an array.
         *  Similar to the "for value in ..." structure in Python.
         */
        for(int odd : odds)
        {
            System.out.println(odd);
        }
        
        /*
         * Limitations of Enhanced for Loops
         * 
         * The local variable (e.g. odd) contains a copy of the value of the element in the array.
         * 
         * We cannot modify the elements in the array.
         * We cannot easily determine the index of an element.
         */
        
        for(int odd : odds)
        {
            odd += 1;
        }
        
        for(int odd : odds)
        {
            System.out.println(odd);
        }
    }
    
    public static void createArrayOfCalendars()
    {
        /*
         * Create an array of 12 calendars, each calendar initialized to the start of each month.
         * 
         * When we create an array of objects, each element is initialized to null. We have to
         *      explicitly create new objects and assign to each element.
         */
        
        GregorianCalendar[] calendars = new GregorianCalendar[12];
        
        /*
         * At this point, every element in the array has a value of null
         */
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
        
        
        /*
         * Create a new calendar object and assign it to each element in the array
         * 
         */
        
        for(int i = 0 ; i < calendars.length; i++)
        {
            calendars[i] = new GregorianCalendar(2021, i + 1, 1);
        }
        
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
        
        /*
         * An enhanced for loop cannot modify the values of the elements in the array (e.g., 
         *      references to calendars), but we can call mutator methods which modify the
         *      properties of the referenced objects (e.g., day of the month).
         */
        
        for(GregorianCalendar calendar : calendars)
        {
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 2);
        }
        
        for(GregorianCalendar calendar : calendars)
        {
            System.out.println(calendar);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
