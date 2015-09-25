

public class validateMethods{
  public boolean validateFellow(String name){
    String[] fellows = {"Yaw","David"};

    for(String n : fellows)
    {
      if (n.equals(name))
      return true; 
    } 
      return false;
  }

  public boolean validateEIT(String name, String groupName, String projectName){
    String[] project = {"Communication","Tech","Business"};
    String[] groups = {"team1","team2"};
    String[] names = {"kate","henry","rosslyn","edwin"};
    boolean result = false;

    for (String p : project) {
      if(p.equals(projectName)){
        result = true;
    }  else {
      result = false;
    }
    }

    for (String g : groups){
      if(g.equals(groupName)){
        result =  true;
    } else {
      result = false;
    }
    }

    for (String n : names){
      if(n.equals(name)) {
        result = false;
      }  else {
        result = true;
      }
    }
    return result;
      
  
    }
    

  public boolean validateGroup(String name, String project){
    //if exists return false;
    return true;
  }

  public boolean checkSize(String group, int size){
   // if size < 2 or size > groupArray.length()
      return false;
    //else return true;
  }

}