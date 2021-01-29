
/**
 * Write a description of class MedalCount here.
 *
 * @author mrcallaghan
 * @version 29jan2021
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    /*
     * Can use array literals to create 2D arrays by nesting curly brackets.
     */
    private int[][] counts = new int[][]
        {
            { 1, 0, 1 },  // country 1 at postion 0
            { 1, 1, 0 },  // country 2 at postion 1
            { 0, 1, 0 },
            { 1, 1, 0 },
            { 0, 1, 1 },
            { 0, 0, 0 },
            { 1, 1, 1 }
        };
        
    public MedalCount()
    {
        /*
         * Alternate way to create a 2D array. The initialization would be followed by
         *      nested loops to initalize each element.
         */
        //this.counts = new int[COUNTRIES][MEDALS];
        //for ...
    }
    
    public void printTable()
    {
        // good: for(int row = 0; row < COUNTRIES; row++)
        // better:
        for(int row = 0; row < this.counts.length; row++)
        {
            // good: for(int col = 0; col < MEDALS; col++)
            // better: for(int col = 0; col < this.counts[0].length; col++)
            // best:
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print(this.counts[row][col] + "\t");
            }
            System.out.println();
        
        }
       
    }
    
    /**
     * Sums the medals for the specified medal index for all countries (i.e., the specified column)
     * 
     * @param   medalIndex  the index of the type of medal in the table to sum for all countries
     * @return  the sum of medals of specified index for all countries
     */
    public int sumMedalsForType(int medalIndex)
        {
            int sum = 0;
            
            for(int row = 0; row < this.counts.length; row++)
            {
                sum +=  this.counts[row][medalIndex];
            }
            
            
            return sum;
        }
    
        
    public int sumMedalsForCountry(int countryIndex)
    {
        int sum = 0;
        for(int col = 0; col < this.counts[countryIndex].length; col++)
        {
            sum += this.counts[countryIndex][col];
        
        }
        
        return sum;
    
    
    }

}
