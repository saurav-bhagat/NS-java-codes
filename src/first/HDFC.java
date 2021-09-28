package first;

public class HDFC implements Bank{

    @Override
    public float rateOfInterest(){
        return 11;
    }

    public String bankName(){
        return "HDFC BANK";
    }
}
