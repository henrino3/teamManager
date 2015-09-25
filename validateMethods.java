import java.util.Arrays;

public  class validateMethods{

static LogClass logger = new LogClass();

  public static boolean validateFellow(String name){
    String[] fellows = {"Yaw","David"};

    for(String n : fellows)
    {
      if (n.equals(name))
      return true; 
    } 
      return false;
  }

  public static boolean validateEIT(String name, String groupName, String projectName){

    /**TODO: loop to check the members already added to the groupName for projectName
     * add these names to an array names for use in validation **/

    String[] names = {"kate","henry","roselyne","edwin"};
   
    for (String n : names){
      if(n.equals(name))
        return  false;
      } 
        return  true;
  }
     

  public static boolean validateGroup(String name, String project){
    /**TODO: use array data loaded from file for validation **/
    
    String[][] groups = {{"tech","COMMS","BUSINESS"},{"tech","team1","team2","team3","team4","team5"},
			 {"comms","team1","team2","team3","team4","team5"},
			 {"business","team1","team2","team3","team4","team5"}};
    boolean r = true;
			 
    for(int i= 0; i < groups.length; i++){
      for(int j = 0; j < groups[i].length; j++){
	if(j == 0 ){
	  if(groups[i][j].equals(project)){
	    System.out.println("Found a project " +groups[i][j]);
	    try{
	     String[] tempArray = groups[i];
	        duplicateCheckLoop:
		for( String s : tempArray) {
		System.out.println("s is : " + s +" and name is : " +name);
		  if(s.equals(name)){
		    r = true;
		    break duplicateCheckLoop;
		  } r = false;
	        }
	    }catch (Exception e) {
	    //e.printStackTrace();
	    logger.writeLog("validateGroup Method : " +e);
	    } 
	  }
        }
      }
    }
    
   return r; //System.out.println("The array is " + Arrays.deepToString(groups));
  }

  public boolean checkSize(String group, int size){
   // if size < 2 or size > groupArray.length()
      return false;
    //else return true;
  }

  public static void main(String[] args){
    for(String s : args){
    boolean y = validateGroup("team2",s);
    System.out.println("The array test" + y);
    }
  }

}
