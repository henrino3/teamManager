package teammanager;


import java.util.Scanner;

public class TeamManager {

//thb
    static validateMethods validate = new validateMethods();
    static LogClass logger = new LogClass();
    static String name = "Yaw";
    static int project_id = 1;
    static String group_name = "master";
    static int choice;

    public static void main(String[] args) {
        System.out.println("THANK YOU FOR LOGGING IN. \n\n Please input your name for verification.\n");
        
        

        Scanner input = new Scanner(System.in);
        String fellow_name = input.nextLine();
        //boolean x = validate.validateFellow("tet");
       // System.out.println("" + x);
        
        
        
       // System.out.println("Welcome " +fellow_name+" to EIT Generator, please proceed");

        if (validate.validateFellow(fellow_name) == true) {
            System.out.println("Welcome " +fellow_name+"\n This is EIT Team Manager.\n Please proceed");
            logger.writeLog(fellow_name, "This user has logged in.");
            
             System.out.println("\n\nAdded to log....\n\n");
            
        }
            else
            {
                System.out.println("You are not authorised! Sorry. ");
                System.exit(1);
                
            }

        
        System.out.println("CHOOSE PROJECT: \n Press \n 1. TECH \n 2.) COMMS \n 3.) BIZ");

        try {
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    project_id = 1;
                    break;
                case 2:
                    project_id = 2;
                    break;
                case 3:
                    project_id = 3;
                    break;

            }
//                       
        } catch (Exception e) {
        }

        System.out.println("What would you like to do? Press \n 1.) Form new Group \n 2.) Add EIT to group \n 3.) To list names of EITs in group)");

        try {
            Scanner in = new Scanner(System.in);
            int choice1 = in.nextInt();

            if (choice1 == 1) {
                groupGeneration grouper = new groupGeneration();
                System.out.println("1");
                grouper.createGroup();
            }

            if (choice1 == 2) {
                groupGeneration grouper = new groupGeneration();
                System.out.println("Which group would you like to enter a member.");
               // grouper.createGroup();
            }
            if (choice1 == 3) {
                
                 System.out.println("GROUP I: \n 1.)Mary  \n 1.)Kate  \n 1.)Henry  \n 1.)Mukeli  \n 1.)Samuel");
                 System.out.println("\n\nGROUP II: \n 1.)Tsatsu  \n 1.)Tabby  \n 1.)eric  \n 1.)Kayode  \n 1.)Patience");
                  
                
                
            } else {

            }

        } catch (NumberFormatException e) {
            System.out.println("Wrong choice Entered.");

        }

    }

    public static void addEIT(String name, int project_id, String group_name) {

        String name1 = name;
        int project_id1 = project_id;
        String group_name1 = group_name;
        WriteCSV writer = new WriteCSV();
        ReadCSV reader = new ReadCSV();
        //reader.check

        // if(name.exists)
        //{
        writer.generateCsvFile(group_name1, name1);

        // }
        // else{
        System.out.println("Saved. Member has been added.");
        // }

    }

    public void listNames(String name, int project_id) {

        this.project_id = project_id;

        ReadCSV reader = new ReadCSV();
        //reader.

        System.out.println("Name exists in chosen group. Try again");

    }

}
