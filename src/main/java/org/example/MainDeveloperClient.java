package org.example;

public class MainDeveloperClient
{
    public static void main(String[] args) {
//        Employs employs = new app dev(); // it tight coupling. // we have to make the  loose coupling.

        Employes e1 = EmpFactory.getEmployes("app dev");
        if (e1 != null) {
            System.out.println("Company: " + e1.companyName());
            System.out.println("Salary: " + e1.salary());
            System.out.println("Experience: " + e1.exp() + " years");
        };
      System.out.println("--------------------------------------");

        Employes e2 = EmpFactory.getEmployes("web dev");
        if (e2 != null) {
            System.out.println("Company: " + e2.companyName());
            System.out.println("Salary: " + e2.salary());
            System.out.println("Experience: " + e2.exp() + " years");
        };

    }

}


//step 5



