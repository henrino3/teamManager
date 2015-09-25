package teammanager;


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
        
//        writer.append("Tsatsu");
//        writer.append(',');
//
//        writer.append("Catherine");
//        writer.append(',');
//        writer.append("Henry M.");
//            writer.append(',');
//            
//        writer.append("Henry K.");
//        writer.append(',');
//        writer.append("Gbevu");
//        writer.append('\n');
//            
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
