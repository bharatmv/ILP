package Connections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Application
{
    static Scanner in = new Scanner(System.in);
    public static void main(String args[])
    {



        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i > 0)
        {
        UpdateConnections A = new UpdateConnections();
        System.out.println("Please choose one of the below options -");
        System.out.println("1. Add a new Connection");
        System.out.println("2. View Connection");
        System.out.println("3. Update Connection");
        System.out.println("4. Exit");
        int selection = sc.nextInt();

        if (selection == 1)
        {
            System.out.println("Enter  Name , City and Salary : ");
            String Name = sc.next();

            String City = sc.next();

            Double sal = sc.nextDouble();

            try {
                A.AddDetails(Name, City, sal);
            }
            catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }

        }
        else if (selection == 2)
        {
            A.ViewDetails();

        }
        else if (selection == 3)
        {
            System.out.println("Enter the name for updating - ");
            String name = sc.nextLine();
            A.updateDetails(name);

        }
        else if (selection == 4)
        {
            System.out.println("Thank you :)  ");
            i = 0;
            break;
        }
    }
    }




}

