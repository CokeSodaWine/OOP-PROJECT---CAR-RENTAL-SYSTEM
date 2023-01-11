
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RentalCar {
    private static String flatNumb;
    private static Date rentStartDate;
    private static Date rentEndDate;
    private static String location;
    private static String carType;
    private static double rentalAmountPerDays;
    private static String currentClientID;
    private static String bookClientID;

    public RentalCar(){}
    /*//CopyConstructor
    public RentalCar(RentalCar c){
        flatNumb = c.getFlatNumb();
        location = c.getLocation();
        carType = c.getCarType();
        currentClientID = c.getCurrentClientID();
    }*/
    
    //Constructor
    public RentalCar(String flatNumb, int stDay, int stMonth, int stYear, int enDay, int enMonth, int enYear, String location, String carType, double rentalAmount, String clientID, String bookClient){
        this.flatNumb = flatNumb;
        rentStartDate = new Date(stDay, stMonth, stYear);
        rentEndDate = new Date(enDay, enMonth, enYear);
        this.location = location;
        this.carType = carType;
        rentalAmountPerDays = rentalAmount;
        currentClientID = clientID;
        bookClientID = bookClient;
    }
    
    //Starting of Accessor
    public String getFlatNumb(){return flatNumb;}
    public int getStDay(){return rentStartDate.getDay();}
    public int getStMonth(){return rentStartDate.getMonth();}
    public int getStYear(){return rentStartDate.getYear();}
    public int getEnDay(){return rentEndDate.getDay();}
    public int getEnMonth(){return rentEndDate.getMonth();}
    public int getEnYear(){return rentEndDate.getYear();}
    public String getLocation(){return location;}
    public String getCarType(){return carType;}
    public double getRentalAmountPerDays(){return rentalAmountPerDays;}
    public String getCurrentClientID(){return currentClientID;}
    public String getBookClientID(){return bookClientID;}
    //End of Accessor
    
    //Starting of Mutator
    public void setFlatNumb(String flatNumb){this.flatNumb = flatNumb;}
    public void setStDay(int stDay){rentStartDate.setDay(stDay);}
    public void setStMonth(int stMonth){rentStartDate.setMonth(stMonth);}
    public void setStYear(int stYear){rentStartDate.setDay(stYear);}
    public void setEnDay(int enDay){rentEndDate.setDay(enDay);}
    public void setEnMonth(int enMonth){rentEndDate.setDay(enMonth);}
    public void setEnYear(int enYear){rentEndDate.setDay(enYear);}
    public void setLocation(String location){this.location = location;}
    public void setCarType(String carType){this.carType = carType;}
    public void setRentalAmountPerDays(double rentAmount){rentalAmountPerDays = rentAmount;}
    public void setCurrentClientID(String currentClientID){this.currentClientID = currentClientID;}
    public void setBookClientID(String bookClient){bookClientID=bookClient;}
    //End of Mutator
    
    //Processor-1 : To Count Days (for display)
    public static long daysOfRentCount(int currDay, int currMonth, int currYear){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        
        String startDate, endDate;
        
        startDate = currDay+"/"+currMonth+"/"+currYear;
        //Client in Renting
        if (currDay>=rentStartDate.getDay() && currMonth>=rentStartDate.getMonth() && currYear>=rentStartDate.getYear())
            endDate = rentEndDate.getDay()+"/"+rentEndDate.getMonth()+"/"+rentEndDate.getYear();
        //Client in Booking
        else
            endDate = rentStartDate.getDay()+"/"+rentStartDate.getMonth()+"/"+rentStartDate.getYear();
        
        LocalDate stDate = LocalDate.parse(startDate, formatter);
        LocalDate enDate = LocalDate.parse(endDate, formatter);
        
        long daysBetween = ChronoUnit.DAYS.between(stDate, enDate);
        //return String.valueOf(daysBetween);
        return daysBetween;
    }
    
}
