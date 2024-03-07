

public class Manager extends Employee {

    
    private double sportHours;
    

    public Manager(){

        super(null);
        sportHours =0;

    }

    public Manager(String firstName, String lastname, String id, int workHours, double bacePay,double sportHours){

        super(firstName, lastname, id, workHours, sportHours);
        this.sportHours =sportHours;
        super.salary=(super.salary+(sportHours*bacePay/2))*1.5;

    }

    public Manager (Manager e){

        super(e);
        sportHours =e.sportHours;

    }

    @Override
    public double weakly() {

        double temp = (sportHours*(bacePay/2));
        double temp2 = workHours*bacePay;
        return (temp+temp)*1.5;

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
        return "MANAGER\n"+super.toString()+"\nsport hours = "+sportHours+"\n\n";
    }

    @Override
    public double excess(){
        return (sportHours*(bacePay/2))*5.5;
    }

    @Override
    public double all(){
        return salary;
    }

    
}
