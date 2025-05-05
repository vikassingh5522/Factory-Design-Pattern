package org.example;

import org.example.Developer.appdev;
import org.example.Developer.webdev;

public class EmpFactory
{

    // gey the emp
    public  static  Employes  getEmployes(String emptype)
    {
        if(emptype.equalsIgnoreCase("app dev"))
        {
            return new appdev();
        }
        else if(emptype.equalsIgnoreCase("web dev"))
        {
            return new webdev();
        }
        else
        {
            return null;
        }

    }


}

// step 4