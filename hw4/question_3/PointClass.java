public class PointClass {
    
    private double x;
    private double y;

    /////comstructers//////

    public PointClass(){

        x = 0;
        y = 0;

    }

    public PointClass(double x , double y){

        this.x = x;
        this.y = y;

    }
    public PointClass(PointClass enter){
        x = enter.x;
        y = enter.y;
    }

    ////toString && equals/////

    public boolean equals(Object enter){
        if(enter != null){
            if(this.getClass() == enter.getClass()){
                PointClass e = (PointClass) enter;
                return ((x == e.x) && (y == e.y));
            }
        }
        return false;
    }

    public String toString(){

        return "x = "+ x +"\ny = "+ y ;

    }

    /////setters && getters/////

    public double getX(){

        return x;
        
    }

    public double getY() {
        
        return y;

    }

    public void setX(double x) {
        
        this.x = x;

    }

    public void setY(double y){

        this.y = y;

    }
    

}
