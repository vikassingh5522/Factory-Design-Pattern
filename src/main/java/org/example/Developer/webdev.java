package org.example.Developer;

import org.example.Employes;

public class webdev implements Employes {


     @Override
    public  String companyName () {

        return "TechSoft Pvt Ltd";

    }

    public int salary() {
        System.out.println("Salary of Web Developer:");
        return 60000;
    }

    public int exp() {
        System.out.println("Experience of Web Developer:");
        return 6;
    }
}


//step 3
