import java.util.Calendar;

public class Date {
    private int year, month, day;

    Date()
    {
        year = 0;
        month = 0;
        day = 0;
    }

    Date(int day, int month, int year)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0) {
            this.year = 2022;
        }
        else
        {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >=1 && month <= 12)
        {
            this.month = month;
        }
        else
        {
            this.month = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >=1 && day <= 31)
        {
            this.day = day;
        }
        else
        {
            this.day = 1;
        }
    }
}
