package MMBankCaseStudyPackage;

public abstract class CurrentAcc extends BankAcc {
    private final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit >= amount) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Insufficient balance and credit limit, cannot withdraw.");
        }
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: " + creditLimit;
    }
}


