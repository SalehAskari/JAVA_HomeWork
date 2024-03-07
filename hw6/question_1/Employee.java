import java.util.jar.Attributes.Name;

public abstract class Employee {

    protected String id;
    protected String lastName;
    protected String firstName;
    protected double salary;
    protected double bacePay;
    protected int workHours;

    public Employee(){

        id = "";
        lastName ="";
        firstName ="";
        salary =0;
        bacePay =0;
        workHours =0;

    }

    public Employee(String firstName, String laStname, String id, int workHours, double bacePay){

        this.id =id;
        this.firstName =firstName;
        this.lastName =laStname;
        this.workHours =workHours;
        this.bacePay =bacePay;
        salary = workHours*bacePay*4;

    }

    public Employee(Employee e){

        id =e.id;
        firstName =e.firstName;
        lastName =e.lastName;
        workHours =e.workHours;
        bacePay =e.bacePay;
        
    }
    

    public boolean equals(Object e1){
        if(e1!=null){
            if(this.getClass()==e1.getClass()){
                Employee e2 = (Employee) e1;
                return ((id == e2.id) && (firstName == e2.firstName) && (lastName == e2.lastName) && (workHours == e2.workHours) && (bacePay == e2.bacePay));
            }
        }
        return false;
    }

    public String toString(){

        return "name = "+firstName+"\nlast name = "+lastName+"\nID = "+id+"\nworkhours = "+workHours+"\nbacePay = "+bacePay;

    }

    public abstract double weakly();
    public abstract double excess();
    public abstract double all();



    
}
