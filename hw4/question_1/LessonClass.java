public class LessonClass {
    
    private String lessonName;
    private int numberOfUnit;
    private boolean lessonStatus;
    private double score;
    private int lessonNumber;

    ////comstructers////

    public LessonClass(){

        lessonName = "";
        numberOfUnit= 0;
        lessonStatus = false;
        score = 0;
        lessonNumber = 0;

    }
    
    public LessonClass(String lessonName , int numberOfUnit , boolean lessonStatus ,Double score , int lessonNumber){

        if(lessonStatus == false){
            System.out.println("The grade status of your course is wrong, so you cannot register a grade");
            System.exit(0);
        }

        this.lessonName = lessonName;
        this.numberOfUnit = numberOfUnit;
        this.lessonStatus = lessonStatus;
        this.score = score;
        this.lessonNumber = lessonNumber;

    }

    public LessonClass(String lessonName , int numberOfUnit , boolean lessonStatus , int lessonNumber){
        if (lessonStatus == true) {
            System.out.println("Enter the grade of the declared course");
            System.exit(0);
        }

        this.lessonName = lessonName;
        this.numberOfUnit = numberOfUnit;
        this.lessonStatus = lessonStatus;
        this.lessonNumber = lessonNumber;

    }

    public LessonClass(LessonClass a){

        lessonName = a.lessonName;
        numberOfUnit = a.numberOfUnit;
        lessonStatus = a.lessonStatus;
        score = a.score;
        lessonNumber = a.lessonNumber;

    }

    /////Functions//////

    public void scoreRegistration(Double newScore) {
        
        this.score = newScore ;
        this.lessonStatus = true;

    }

    ////toString && equals////

    public String toString(){

        if(lessonStatus == false){
            return "\nlessonName = " +lessonName+ "\nnumberOfUnit = " +numberOfUnit+ "\nlessonStatus = "+ lessonStatus + "\nlessonnumber = "+ lessonNumber +"\n" ;
        }else{
            return "\nlessonName = " +lessonName+ "\nnumberOfUnit = " +numberOfUnit+ "\nlessonStatus = "+ lessonStatus + "\nlessonnumber = "+ lessonNumber + "\nscore = "  + score +"\n";
        }
        
    }

    public boolean equals(Object enter){
        if(enter != null){
            if(this.getClass() == enter.getClass()){
                LessonClass e = (LessonClass) enter;
                return ((lessonName == e.lessonName) && (numberOfUnit == e.numberOfUnit) && (lessonStatus == e.lessonStatus) && (score == e.score) && (lessonNumber == e.lessonNumber));
            }
        }
        return false;
    }

    ///setters && getters///

    public String getLessonName(){

        return lessonName;
        
    }

    public int getNumberOfUnit(){

        return numberOfUnit;
        
    }
    
    public boolean getLessonStatus(){

        return lessonStatus;
        
    }
    
    public double getScore(){

        return score;
        
    }
    
    public int getLessonNumber(){

        return lessonNumber;
        
    }

    public void setLessonName(String lessonName){

        this.lessonName = lessonName;
        
    }

    public void setNumberOfUnit(int numberOfUnit){
      
        this.numberOfUnit = numberOfUnit;

    }

    public void setLessonStatus( Boolean lessonStatus){
        
        this.lessonStatus = lessonStatus;
    }
    

    public void setScore(Double score){
        
        this.score = score;

    }

    public void setlessonNumber(int lessonNumber) {
        
        this.lessonNumber = lessonNumber;
        
    }
}
