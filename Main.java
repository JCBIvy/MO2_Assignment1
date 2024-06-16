//imports
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;

class MyDate {

    // fields
    int year;
    int month;
    int day;
    int speed;

    //noArgs constructor
    MyDate()
    {
        GregorianCalendar dateFinder = new GregorianCalendar();
        this.year = dateFinder.get(GregorianCalendar.YEAR);
        this.month = dateFinder.get(GregorianCalendar.MONTH);
        this.day = dateFinder.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //elapsed time constructor
    MyDate(long timeElapsed)
    {
        GregorianCalendar dateFinder = new GregorianCalendar();
        dateFinder.setTimeInMillis(timeElapsed);
        this.year = dateFinder.get(GregorianCalendar.YEAR);
        this.month = dateFinder.get(GregorianCalendar.MONTH);
        this.day = dateFinder.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    //specified date constructor
    MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //reset date with elapsed time
    public void setDate(long timeElapsed)
    {
        GregorianCalendar dateFinder = new GregorianCalendar();
        dateFinder.setTimeInMillis(timeElapsed);
        this.year = dateFinder.get(GregorianCalendar.YEAR);
        this.month = dateFinder.get(GregorianCalendar.MONTH);
        this.day = dateFinder.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //methods
    int getYear()
    {
        return this.year;
    }

    int getMonth()
    {
        return this.month;
    }

    int getDay()
    {
        return this.day;
    }
}

class Main
{
    //test out the class
    public static void main(String []args)
    {
        //clarify date format
        System.out.println("Dates are given in YYYY/(M)M/(D)D format");

        //test noArgs constructor
        MyDate date1 = new MyDate();
        System.out.println(date1.getYear()+"/"+date1.getMonth()+"/"+date1.getDay());
        
        //test time elapsed constructor
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println(date2.getYear()+"/"+date2.getMonth()+"/"+date2.getDay());
    }
};
