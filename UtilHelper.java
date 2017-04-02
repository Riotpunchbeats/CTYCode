

public class UtilHelper
{
    public static void sort(int [] array)
    {

    }//end of sort
    public static void clear(int [] array)
    {
        for (int x = 0; x< array.length; x++)
            {
                array[x] = 0;
            }
    
    }//end of clear
    public static boolean isEmpty(int [] array)
    {
        boolean empty = false;
        for(int x = 0; x < array.length; x++)
        
        int count = 0;
        {
            if(array[x] == 0)
            count++;
        }
        if(count == array.length)
            empty = true;
        return empty;
    
    }
    public static indexOf(int [] array, int value)
    {
        int index = 0;
        for(int x =0; x < array.length; x++)
        {
            if(value == array[x])
                {
                    index = x;
                    break;
                }
        }
        return index; 
    }
}