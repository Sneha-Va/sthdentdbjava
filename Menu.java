import java.sql.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");


        } catch (Exception e) {
            System.out.println(e);

        }

        int choice;
        Scanner s = new Scanner(System.in);
        String name, college;
        int rollno, admno;
        while (true) {
            System.out.println("1.insert");
            System.out.println("2.select");
            System.out.println("3.search");
            System.out.println("4.update");
            System.out.println("5.delete");
            System.out.println("6.exit");
            System.out.println("enter your choice:");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("insert data");

                case 2:
                    System.out.println("selct data");
                case 3:
                    System.out.println("search  data");
                case 4:
                    System.out.println("update data");
                case 5:
                    System.out.println("delete data");
                case 6:
                    System.out.println("exit");
                    break;
            }
        }
    }
}