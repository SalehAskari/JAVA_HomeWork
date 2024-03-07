
public class Demo{

    public static void main(String[]args) {

        Employee employee[] = new Employee[6];


        employee [0] = new Manager("ali","hashemi","1",45,120.00,10);
        employee [1] = new Manager("hassan","musavi","1",55,120.00,5);
        employee [2] = new Engineer("zahra","hoseini","1",7,120.00,8);
        employee [3] = new Engineer("fateme","karimi","1",42,120.00,12);
        employee [4] = new Engineer("hossein","razavi","1",38,120.00,5);
        employee [5] = new Engineer("mohammad","ahmadi","1",44,120.00,7);

        //equals
        // Employee test1 = new Manager("ali","hashemi","1",4,120.00,10);
        // Employee test2 = new Manager("ali","hashemi","1",45,120.00,10);
        // System.out.println(test1.equals(test2));

        //toString
        // System.out.println(employee[0].toString());
        // System.out.println(employee[2].toString());

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].all());
            System.out.println(employee[i].weakly());
            System.out.println();
            System.out.println();
        }
    }
    
}