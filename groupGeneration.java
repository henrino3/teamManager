
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class groupGeneration {

    static Scanner in = new Scanner(System.in);
    static int classNum = 30, groupNum, size = 0;
    public static void createGroup() {

        try {
            System.out.println("Enter No of people you want in a group \n (Allowed Number : 5 OR 6)");
            size = in.nextInt();

        } catch (NumberFormatException e) {
            System.out.println("Wrong Format");
        } catch (InputMismatchException e) {
            System.out.println("Wrong Format2");
        };

        if (size == 5 || size == 6) {
            generateArray();
        } else {
            error();
        }

    }

    /*
     create a Group
     ask for size
     2 - 6
     create arrays
     dis name of Group
     Ask for input of Group1
     q
     a
     t*/
    public static void generateArray() {

        groupNum = (classNum / size);

        System.out.println("Welldone! You have created " + groupNum + " groups ");

        int ga = 1;
        while (ga <= groupNum) {
            System.out.println("Group " + ga);

            switch (ga) {
                case 1:
                    String[] groupArray1 = new String[]{"111", "2223", "333", "444", "555", "666"};
                    break;
                case 2:
                    String[] groupArray2 = new String[]{};
                    break;
                case 3:
                    String[] groupArray3 = new String[]{};
                    break;
                case 4:
                    String[] groupArray4 = new String[]{};
                    break;
                case 5:
                    String[] groupArray5 = new String[]{};
                    break;
                case 6:
                    String[] groupArray6 = new String[]{};
                    break;
            };
            ga++;
        };

        for (int i = 1; i < groupNum; i++) {
            System.out.println("Enter Members of Group" + i);

            for (int j = 1; j <= size; j++) {
                String array = "groupArray" + j;

                List list1 = Arrays.asList(array);
                //System.out.println(Arrays.toString(array));
                System.out.println(list1);

            }

        }

    }

    public static void error() {
        System.out.println("Error, Ending Program");
        System.exit(0);

    }
}
