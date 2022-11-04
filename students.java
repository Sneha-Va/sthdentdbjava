import java.util.Scanner;

public class students {
    public static void main(String[] args)
    {
       while (true)
       {
           System.out.println("1.insert");
           System.out.println("1.select");
           System.out.println("1.search");
           System.out.println("1.delete");
           System.out.println("1.exit");
           Scanner s=new Scanner(System.in);
           int choice=s.nextInt();
           switch (choice){
               case 1:
                   System.out.println("insert data");
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
