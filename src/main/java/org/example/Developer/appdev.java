package org.example.Developer;

import org.example.Employes;

public class appdev implements Employes {

 @Override
    public  String companyName () {

        return "TechSoft Pvt Ltd";

    }

    public int salary() {
        System.out.println("Salary of App Developer:");
        return 50000;
    }

    public int exp() {
        System.out.println("Experience of App Developer:");
        return 5;
    }

}


// step 2