import java.util.Arrays;

public  class validateMethods{

static LogClass logger = new LogClass();

static String[] fellows = {"Yaw","David"};
static String[] eitNames = {"kate","henry","roselyne","edwin"};
static String[][] groups = {{"tech","COMMS","BUSINESS"},{"tech","team1","team2","team3","team4","team5"},
			 {"comms","team1","team2","team3","team4","team5"},
			 {"business","team1","team2","team3","team4","team5"}};
static String[] allEITs = {"kate","edwin"};
       
  public static boolean validateFellow(String name){
  /**checks if the name provided exists in the fellows array.
      returns true if found **/

    for(String n : fellows)
    {
      if (n.equals(name))
      return true; 
    } 
      return false;
  }

  public static boolean validateEIT(String name, String groupName, String projectName){
  /**TODO: loop to check the members already added to the groupName for projectName
    * add these names to an array names for use in validation .
      Checks the EIT name for duplicate add. Returns false if an EIT is already in a group.
  **/
   
    for (String n : eitNames){
      if(n.equals(name))
        return  false;
      } 
        return  true;
  }

  public static boolean validateGroup(String name, String project){
  /**TODO: use array data loaded from file for validation 
    checks whether a group name already exists for a given project.
    Returns false if the name is found to be existing.
  **/
  
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
		  if(s.equals(name)){
		    r = false;
		    break duplicateCheckLoop;
		  } r = true;
	        }
	    }catch (Exception e) {
	      String error = e.getMessage();
	      logger.writeLog("validateGroup Method : ", error);
	    } 
	  }
        }
      }
    }
    
   return r;
  }

  public static boolean checkGroupSize(int size){
  /** checks the size specified for an array.
      Returns true if the size passed is a valid length **/
 
 boolean r = true;
    
    if (size < 2 || size >= allEITs.length) 
        r = false;
    
    return r;
  }

  /**main method availed for test purposes only. Will be removed in final version 
  **/
  public static void main(String[] args){
    for(String s : args){
    boolean a = validateGroup("team2",s);
    boolean b = validateEIT("kate","team2",s);
    boolean c = validateFellow("kate");
    boolean d = checkGroupSize(1);

    System.out.println("The validateGroup test (expecting false) " + a);
    System.out.println("The validateEIT test (expecting false) " + b);
    System.out.println("The validateFellow test (expecting false) " + c);
    System.out.println("The checkGroupSize test (expecting false) " + d);

    }
  }

}
