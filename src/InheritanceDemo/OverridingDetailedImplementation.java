package InheritanceDemo;

public class OverridingDetailedImplementation {
}


class Reservbank
{

    void getamountWithRateofInterest(int amount)
    {
        System.out.println("For Reverve bank :Given amount:"+amount);
        double rateOfinterst =  3.5;
        double amountWithInterst = amount *rateOfinterst;

        System.out.println("total amount:"+amountWithInterst+" with rate of interest:"+rateOfinterst);
        System.out.println();

    }
}


class Axisbank extends Reservbank
{

    void getamountWithRateofInterest(long amount)
    {
        System.out.println("For Axis bank :Given amount:"+amount);

        double rateOfinterst =  1;

        if(amount<5000000) // 50 laks
            rateOfinterst = 3.5;
        if(amount>=50000 && amount<1000000000) // 50 laks - 100 cr
            rateOfinterst = 4.0;

        if(amount>=1000000000) // 50 laks - 100 cr
            rateOfinterst = 6.0;

        double amountWithInterst = amount *rateOfinterst;


        System.out.println("total amount:"+amountWithInterst+" with rate of interest:"+rateOfinterst);
        System.out.println();
    }

}

class SBI extends Reservbank
{
    void getamountWithRateofInterest(int amount)
    {
        System.out.println("For SBI bank :Given amount:"+amount);
        double rateOfinterst =  1;

        if(amount<= 100000)
            rateOfinterst = 3.5;
        if(amount>100000)
            rateOfinterst = 3.0;

        double amountWithInterst = amount *rateOfinterst;

        System.out.println("total amount:"+amountWithInterst+" with rate of interest:"+rateOfinterst);
        System.out.println();
    }
}

class ICICI extends Reservbank
{

    void getamountWithRateofInterest(int amount)
    {
        System.out.println("For ICICI bank :Given amount:"+amount);
        double rateOfinterst =  1;

        String bankaccountType ="smart star";
        // young star - 3.5, smart star - 3.35 , pocket -3.25, basic - 3.0

        if(amount>=2500)
        {
            if(bankaccountType.equalsIgnoreCase("young star"))
                rateOfinterst = 3.5;
            if(bankaccountType.equalsIgnoreCase("smart star"))
                rateOfinterst = 3.35;

        }
        else
        {
            if(bankaccountType.equalsIgnoreCase("pocket"))
                rateOfinterst = 3.25;
            if(bankaccountType.equalsIgnoreCase("basic"))
                rateOfinterst = 3.0;
        }



        double amountWithInterst = amount *rateOfinterst;

        System.out.println("total amount:"+amountWithInterst+" with rate of interest:"+rateOfinterst);
        System.out.println();

    }
}

class Banks
{
    public static void main(String[] args) {

        Reservbank reservbank = new Axisbank();

        reservbank.getamountWithRateofInterest(100000);

        reservbank = new SBI();
        reservbank.getamountWithRateofInterest(100000);

        reservbank = new ICICI();
        reservbank.getamountWithRateofInterest(100000);

    }
}
