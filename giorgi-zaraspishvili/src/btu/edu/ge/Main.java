import org.apache.log4j.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {
    final static Logger logger= Logger.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.println("შემოიტანეთ საძიებო სიტყვა: ");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();



        File dir = new File("C:\\Users\\Zaraspishvili\\Desktop\\BTU_DOCUMENT");

        File[] foundFiles = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {

                if(name.startsWith((in))) {
                    System.out.println( "მოიძებნა :" + name);
                    logger.info(name);
                }
                return name.startsWith("");
            }
        });
    }
}
