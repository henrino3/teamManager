package teammanager;

import java.util.Scanner;

public class TeamManager {

    static String name = "Yaw";
    static int project_id = 1;
    static String group_name = "master";
    static int choice;

    public static void main(String[] args) {
        System.out.println("THANK YOU FOR LOGGING IN. \n\n Please input your name\n");

//        if(name.exists)
//        {
//            
//        }
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
                addEIT(name, project_id, group_name);
            }
            if (choice1 == 3) {
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
