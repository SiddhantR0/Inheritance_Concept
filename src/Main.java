//import Models.Cylinder;
//import Models.Cuboid;
//public class Main {
//    public static void main(String[] args) {
//
//        Cylinder cy =  new Cylinder(98, 87);
//        cy.generateVolume();
//
//        Cuboid cu = new Cuboid(22, 42, 62);
//        cu.generateVolume();
//
//    }
//}

import Models.Member;
import Models.Manager;
import Models.Employee;

public class Main{
    public static void main(String[] args) {

        Manager m1 = new Manager("Ram",18,29829,"Ktm", 50, "Video Edit");

        m1.getSalary(2);

        Employee e1 = new Employee("Sita",21,9876,"Brt",30,"IT");

        e1.getSalary(0);
    }
}