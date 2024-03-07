import java.time.Year;

public class DateClass {
    
    private int year;
    private int month;
    private int day;

    ////comstructers////

    public DateClass(){

        year = 0;
        month = 0;
        day = 0;

    }

    public DateClass(int year , int month , int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }
    public DateClass(DateClass enter){
        year = enter.year;
        month = enter.month;
        day = enter.day;
    }

    /////Functions//////

    ////toString && equals////

    public String toString(){

        return"Date Of Birthday = ("+year+"/"+month+"/"+day+")";

    }

    public boolean equals(Object enter){
        if(enter != null){
            if(this.getClass() == enter.getClass()){
                DateClass e = (DateClass) enter;
                return ((year == e.year) && (month == e.month) && (day == e.day));
            }
        }
        return false;
    }

    ///setters && getters///

    public int getYear() {

        return year;

    }
    
    public int getMonth() {

        return month;
        
    }
    
    public int getDay() {

        return day;
        
    }

    public void setYear(int year){

        this.year = year;

    }

    public void setMonth (int month){

        this.month = month;
        
    }

    public void setDay (int day){

        this.day = day;
        
    }


}
