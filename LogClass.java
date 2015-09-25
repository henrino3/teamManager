        import java.util.logging.Logger;
        import java.util.logging.FileHandler;
        import java.util.logging.SimpleFormatter;
        import java.io.IOException;
        import java.text.NumberFormat;
        import java.io.File;
        import java.util.Scanner;

        public class LogClass{
            public static  Scanner in = new Scanner(System.in);

            public static void main(String[] args) {
                         String msg = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
                                                    Non quis eligendi totam, accusantium laudantium iusto eum 
                                                    nobis fugit debitis inventore blanditiis maiores pariatur dolores, 
                                                    qui explicabo, eaque fugiat. Deserunt, iusto! ";
                         String title= "Log 1";

                     writeLog(title,msg);

                    
            }



            public static void writeLog(String title,  String msg) {  

            Logger logger = Logger.getLogger("MyLog");  
            FileHandler fh;  

            try {  


                // This block configure the logger with handler and formatter  
                fh = new FileHandler("MyLogFile.log", true); 

               logger.setUseParentHandlers(false);
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();  
                fh.setFormatter(formatter);  

                // the following statement is used to log any messages  
                logger.info(title+":  "+msg+"\n");  

            } catch (SecurityException e) {  
                e.printStackTrace();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  


        }
        }




