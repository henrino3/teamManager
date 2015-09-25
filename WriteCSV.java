

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV
{
   public  void generateCsvFile(String sFileName, String name)
   {
    generateCsvFile("/home/makena/Desktop/"+sFileName+".csv", name);
       
    try
    {
        
        FileWriter writer = new FileWriter(sFileName, true);
         
        writer.append(name);
        writer.append(',');
        

        writer.flush();
        writer.close();
    }
    catch(IOException e)
    {
         e.printStackTrace();
    } 
    }
}
