package teammanager;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
 
public class ReadCSV {
	public static void readingCSV(String name) {
		
		BufferedReader readBuffer = null;
                String name1 = name;
		
		try {
			String readLine;
			readBuffer = new BufferedReader(new FileReader("/home/makena/Desktop/test.csv"));
			
			// How to read file in java line by line?
			while ((readLine = readBuffer.readLine()) != null) {
				System.out.println(readCSVtoArrayList(readLine));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (readBuffer != null) readBuffer.close();
			} catch (IOException readException) {
				readException.printStackTrace();
			}
		}
	}
	
	// Utility which converts CSV to ArrayList using Split Operation
	public static ArrayList<String> readCSVtoArrayList(String readCSV) {
		ArrayList<String> readResult = new ArrayList<String>();
		
		if (readCSV != null) {
			String[] splitData = readCSV.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					readResult.add(splitData[i].trim());
				}
			}
		}
		
		return readResult;
    }
}