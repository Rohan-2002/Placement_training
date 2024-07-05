package MMBankCaseStudyPackage;

public abstract class SavingAcc extends BankAcc {
    private final boolean isSalaried;
    private static final float MINBAL = 500;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            super.deposit(-amount);
        } else {
            System.out.println("Insufficient balance, cannot withdraw.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", isSalaried: " + isSalaried;
    }
}

