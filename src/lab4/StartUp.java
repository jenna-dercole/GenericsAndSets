
package lab4;

import lab2.*;
import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jenna
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        Set<Employee> employees = new HashSet<Employee>();
        Employee e1 = new Employee("Dercole", "Jenna", "324234321");
        employees.add(e1);
        employees.add(new Employee("Smith", "Jenny", "399346783"));
        employees.add(new Employee("Jones", "Dan", "987675645"));
        employees.add(new Employee("Wolf", "Ben", "399346783"));
        
        //System.out.println(employees.get(1));
        
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }
        
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        employees.remove(e1);
        
        for (Employee e : employees) {
            System.out.println(e);
        }
        
       
        System.out.println(employees.size());
    }
    
} 
   
    

