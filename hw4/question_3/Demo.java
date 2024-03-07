


public class Demo {
     public static void main(String[]args){
          

        PointClass point = new PointClass(2, 2);
        CircleClass circle = new CircleClass(5,point);
        CylinderClass cylinder = new CylinderClass(10, circle);
        CylinderClass test = new CylinderClass(cylinder);
        CylinderClass test1 = new CylinderClass();
        System.out.println(cylinder.equals(test));
        System.out.println(cylinder.equals(test1));
        System.out.println(cylinder.toString());
     }
}


