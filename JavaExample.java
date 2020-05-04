public class JavaExample 
{
    public static void main(String[] args) 
    {
        try
        {
            method();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
     
    public static void method( ) throws FileNotFoundException 
    {
        throw new FileNotFoundException();
    }
}