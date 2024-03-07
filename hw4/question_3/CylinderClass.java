public class CylinderClass {
    
    private double height;
    private CircleClass circle;

    ////comstructers////

    public CylinderClass(){

        height = 0;
        circle = new CircleClass();

    }

    public CylinderClass(double height , CircleClass circle){

        this.height = height;
        this.circle = new CircleClass(circle);

    }

    public CylinderClass(CylinderClass a){

        height = a.height;
        circle = new CircleClass(a.circle);

    }

    /////Functions//////

    public double areaOfCylinder() {
        
        return circle.environmanOfCircle() * height;
        
    }

    public double  VolumeOfCylinder() {
        
        return circle.area() * height;

    }

    ////toString && equals////

    public boolean equals(Object enter){

        if(enter != null){
            if(this.getClass() == enter.getClass()){
                CylinderClass e = (CylinderClass) enter;
                return (height == e.height) && (circle.equals(e.circle));
            }
        }
        return false;
    }

    public String toString(){

        return circle.toString() + "\n"+"Height =" + height + "\nAreaOfCylinder = " + areaOfCylinder() + "\n" + "Environment of cylinder = " + VolumeOfCylinder();
        
    }

    ///setters && getters///

    public void setHeight(double height){

        this.height = height;

    }

    public double getHeight() {
        
        return height;

    }


}
