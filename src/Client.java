public class Client {
    //Data Field
    //Important
    private static String clientID;
    private static String clientPass;
    private static int isRenting; //1-renting 2-booking 3-no service
    private static double currencyWallet;
    private static double rentalPayment;
    private static Date currentDate;
    //Not That Important
    private static String name;
    private static int numbOfRentMade;
    
    //Default Constructor
    public Client(){};
    
    //Constructor
    public Client(String id, String password, int isRenting, double currencyWallet, double rentalPayment, int day, int month, int year, String name, int numbOfRent){
        clientID = id;
        clientPass = password;
        this.isRenting = isRenting;
        this.currencyWallet = currencyWallet;
        this.rentalPayment = rentalPayment;
        currentDate = new Date(day, month, year);
        this.name = name;
        numbOfRentMade = numbOfRent;
    }
    
    //Start of Accessor
    public String getClientID(){return clientID;}
    public String getClientPass(){return clientPass;}
    public int getIsRenting(){return isRenting;}
    public double getCurrencyWallet(){return currencyWallet;}
    public double getRentalPayment(){return rentalPayment;}
    //Composite Accessor
    public int getDay(){return currentDate.getDay();}
    public int getMonth(){return currentDate.getMonth();}
    public int getYear(){return currentDate.getYear();}
    
    public String getName(){return name;}
    public int getNumbOfRentMade(){return numbOfRentMade;}
    //End of Mutator
    
    //Start of Mutator
    public void setClientID(String id){clientID = id;}
    public void setClientPass(String password){clientPass = password;}
    public void setIsRenting(int isRenting){this.isRenting = isRenting;}
    public void setCurrencyWallet(double currencyWallet){this.currencyWallet = currencyWallet;}
    public void setRentalPayment(double rentalPayment){this.rentalPayment = rentalPayment;}
    //Composite Mutator
    public void setDay(int d){currentDate.setDay(d);}
    public void setMonth(int m){currentDate.setMonth(m);}
    public void setYear(int y){currentDate.setYear(y);}
    
    public void setName(String name){this.name = name;}
    public void setNumbOfRentMade(int numbOfRent){numbOfRentMade = numbOfRent;}
    //End of Mutator
    
    //Proccesor Method-1 : Translate isRenting()
    public String translateIsRenting(){
        if(isRenting==1)
            return "RENTING";
        else if(isRenting==2)
            return "IN BOKING";
        else
            return "NO SERVICE";
    }
    
}
