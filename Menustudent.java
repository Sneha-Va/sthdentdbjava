import javax.lang.model.element.Name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Menustudent {
    public static void main(String args []){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
        }
        catch (Exception e){
            System.out.println(e);
        }
        int choice;
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("1.insert");
            System.out.println("2.select");
            System.out.println("3.search");
            System.out.println("4.update");
            System.out.println("5.delete");
            System.out.println("6.Exit");
            choice=s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. insert student");
                    System.out.println("enter the name:");
                    names=s.nextInt();
                    System.out.println("enter rollnumner");
                     rollnumber=s.next();
                    System.out.println("enter admission number");
                    admnumber=s.next();
                    System.out.println("enter college");
                    String college=s.next();
                case 2:
                    System.out.println("2.view student");
                case 3:
                    System.out.println("3.search student");
                case 4:
                    System.out.println("4.update student");
                case 5:
                    System.out.println("5.delete student");
                case 6:
                    System.out.println("6.exit");
                    break;
            }
        }
    }
}
