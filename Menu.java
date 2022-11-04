import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root"," ");
        }
        catch (Exception e){
            System.out.println(e);
        }
        int choice;
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("1.insert");
            System.out.println("2.select");
            System.out.println("3.search");
            System.out.println("4.update");
            System.out.println("5.delete");
            System.out.println("6.exit");
            System.out.println("enter your choice:");
            choice=s.nextInt();

            switch (choice){
                case 1:
                    System.out.println("insert data");
                    System.out.println("enter the name:");
                    name=s.next();
                    System.out.println("enter rollnumner");
                    rollnumber=s.nextInt();
                    System.out.println("enter admission number");
                     admnumber=s.nextInt();
                    System.out.println("enter college");
                     college=s.next();
                case 2:
                    System.out.println("selct data");
                case 3:
                    System.out.println("search data");
                case 4:
                    System.out.println("delete data");
                case 5:
                    break;
            }

        }
    }
}