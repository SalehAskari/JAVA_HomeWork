public class Engineer extends Employee {

    private int trafficHours;
    
    public Engineer(){

        super(null);
        trafficHours =0;

    }

    public Engineer(String firstName, String laStname, String id, int workHours, double bacePay,int trafficHours){

        super(firstName, laStname, id, workHours, bacePay);
        this.trafficHours=trafficHours;
        super.salary=(super.salary + (trafficHours*bacePay)*0.7);
    }

    public Engineer(Engineer e){

        super(e);
        trafficHours=e.trafficHours;

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

    @Override
    public double weakly() {

        double temp = ((trafficHours*bacePay)*0.7);
        double temp2 = bacePay*workHours;
        return temp+temp2+200;
        
    }

    public String toString(){
        return "ENGINEER\n"+super.toString()+"\ntraffic hours = "+trafficHours+"\n\n";
    }

    public int getT(){
        return trafficHours;
    }

    @Override
    public double excess(){
        return (((trafficHours*bacePay)*0.7)*4)+200;
    }

    @Override
    public double all(){
        return salary;
    }


   

}
