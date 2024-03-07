public class CircleClass {
    
    private double radius;
    private PointClass point;

    ////comstructers////

    public CircleClass(){

        radius = 0;
        point = new PointClass();

    }

    public CircleClass (double radius , PointClass point){

        this.radius = radius;
        this.point = new PointClass(point);
    }
    public CircleClass(CircleClass enter){
        radius = enter.radius;
        point = new PointClass(enter.point);
    }

    /////Functions//////

    public  double area(){
        
        return radius * radius * Math.PI;

    }

    public double environmanOfCircle() {

        return 2 * Math.PI * radius;
        
    }

    ////toString && equals////

    public boolean equals(Object enter){

        if(enter != null){
            if(this.getClass() == enter.getClass()){
                CircleClass e = (CircleClass) enter;
                return (this.radius==e.radius) && (point.equals(e.point));
            }
        }
        return false;
    }

    public String toString(){

        return "Cartesian coordinates:\n"+point.toString()+"\nRadius = "+radius+"\nArea of circle = "+area()+"\nEnvironment of circle = "+environmanOfCircle();

    }

    ////setters && getters////

    public void setRadius(double radius) {
        
        this.radius = radius;

    }

    public double getRadius() {
        
        return radius;
        
    }

    



}
