import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

import javax.xml.crypto.Data;

public class StudentClass {

    private String name;
    private long id;
    private LessonClass lesson[];
    private DateClass date;

    ////comstructers////

    public StudentClass(){

        name = "";
        id = 0;
        lesson = new LessonClass[0];
        date = new DateClass();

    }

    public StudentClass(String name , long id , DateClass date , LessonClass lesson []){

        this.name = name;
        this.id = id;
        this.lesson = new LessonClass[lesson.length];
        for(int i = 0 ; i < lesson.length ; i++){
            this.lesson[i] = new LessonClass(lesson[i]);
        }
        this.date = new DateClass(date);

    }
    
    
    public StudentClass(StudentClass a){

        name = a.name;
        id = a.id;
        lesson = new LessonClass[a.lesson.length];
        for(int i = 0 ; i < a.lesson.length ; i++){
            lesson[i] = new LessonClass(a.lesson[i]);
        }
        date = new DateClass(a.date);
    }
        

    /////Functions//////

    public double avarge() {

        double counter = 0;
        double sum = 0;

        for (int i = 0; i < lesson.length; i++) {
            if(lesson[i].getLessonStatus() == true){
            sum += lesson[i].getScore() * lesson[i].getNumberOfUnit();
            counter += lesson[i].getNumberOfUnit();
            }
        }
        return sum/counter;
    }

    public String Condition() {
        String out = "";
        for (int i = 0; i < lesson.length; i++) {
            if(lesson[i].getLessonStatus()==false){
                out += "lesson name = "+lesson[i].getLessonName()+" | number of wahed = "+lesson[i].getNumberOfUnit() + "\n";
            }
        }
        return out;
    }


    public void change(double score2 , int lessonNumber2) {
        
        for (int i = 0; i < lesson.length; i++) {
            if(lesson[i].getLessonNumber()==lessonNumber2){
                lesson[i].setScore(score2);
            }
        }

    }

    public void delete (int number){
        int counter =0;
        LessonClass temp[] = new LessonClass[lesson.length-1];
        for (int i = 0; i < lesson.length; i++) {
            if(lesson[i].getLessonNumber() != number){
                temp[counter] = new LessonClass(lesson[i]);
                ++counter;
            }
        }
        lesson = Arrays.copyOf(temp , temp.length);
    }

    ////toString && equals////

    public String toString(){
        String out = "";
        out += "name =" +name+ "\nid =" +id+ "\n" + date.toString() +"\n";
        for(int i = 0 ; i < lesson.length ; i++){
            out += lesson[i].toString();
        }
        out +="\navarage = " + avarge();
        return out; 
    }

    public boolean equals(Object enter){
        if(enter!=null){
            if(this.getClass() == enter.getClass()){
                StudentClass e = (StudentClass) enter;
                for (int i = 0 ; i < e.lesson.length ; i++) {
                    if (!(lesson[i].equals(e.lesson[i]))) {
                        return false;
                    }
                }
                return (name==e.name) && (id==e.id) && (date.equals(e.date));
            }
        }
        return false;
    }





    ///setters && getters///s



    
    public long getId() {
        
        return id;

    }

    public String getName(){

        return name;

    }

    public void setId(int id){

        this.id = id;

    }

    public void setName(String name){

        this.name = name;
    }
}
