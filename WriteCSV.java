

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV
{
   public static void main(String [] args)
   {
       generateCsvFile("Tech", "Roseline", '5'); 
   }
   
   private static void generateCsvFile(String group, String name, char proj_ID)
   {
    try
    {
        File file = new File("/home/gbevu/Desktop/test.csv");
	        
        FileWriter writer = new FileWriter(file, true);
         
        writer.append(group);
        writer.append(',');
        writer.append(name);
        writer.append(',');
        writer.append((char) proj_ID);

        writer.append('\n');
            
        //generate whatever data you want
            
        writer.flush();
        writer.close();
    }
    catch(IOException e)
    {
         e.printStackTrace();
    } 
    }
}