package Connections;
import java.util.Scanner;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class UpdateConnections extends AddConnections {
    String NameList[] = new String[10];
    String CityList[] = new String[10];
    Double SalaryList[] = new Double[10];
    int len = 0;
    AddConnections A = new AddConnections();

     void ViewDetails(){
        System.out.print("Viewing All Connections - ");
        for(int i = 0;i<NameList.length;i++){
            System.out.println("You Have chosen to view all connections - ");
            System.out.println(NameList[i]+"  "+CityList[i]+"  "+SalaryList[i]);
         }

     }

     void AddDetails(String Name,String city,Double Salary){

         A.setConnName(Name);
         A.setConnCity(city);
         A.setConnSalary(Salary);


         System.out.println("Length of array - " +  len);
         NameList[len] = A.ConnName;
         CityList[len] = A.ConnCity;
         SalaryList[len] = A.ConnSalary;

         len ++;

     }


     void updateDetails(String Name){
         int i = 0;
         Scanner sc = new Scanner(System.in);
         while(i < NameList.length){
             if(NameList[i] == Name){
                 System.out.println("Enter new Name");
                 String newName = sc.nextLine();
                 System.out.println("Enter new City");
                 String newCity = sc.nextLine();
                 System.out.println("Enter new Salary");
                 Double newSalary = sc.nextDouble();

                 System.out.println("Do you confirm these changes? Enter Y/N");
                 if(sc.nextLine() == "y")
                 {
                     NameList[i] = newName;
                     CityList[i] = newCity;
                     SalaryList[i] = newSalary;
                 }
             }
         }


     }


}
