public class Loan {
    private double loan;
    private  final double pct=0.007;
    private static int counter=0;
    int years =0;

    public Loan(double loan) {
        this.loan = loan;
    }

    public int yearsUntilDouble(){
        double doubleLoan=this.loan*2;
        System.out.println("The loan you wish to borrow: " + this.loan + " the doubled loan is therefore: " + doubleLoan);
        System.out.println("this.loan=(this.loan)+(this.loan*pct) " + this.loan + " here " + this.loan*pct + " pct " + pct);

        while (this.loan<=doubleLoan)
        {
            this.loan=(this.loan)+(this.loan*pct);
            //System.out.println("this.loan=(this.loan)+(this.loan*pct) " + this.loan + " here " + this.loan*pct + " pct " + pct);
            years=counter;
            counter++;
        }
//        System.out.println("years until double loan: " + years + " years" + " the loan was " + this.loan + " the doubled loan is " + doubleLoan);
        System.out.println("years outside loop " + years);
        return years;
    }
}
