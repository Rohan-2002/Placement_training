package MMBankCaseStudyPackage;

public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 500;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
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
        return "MMSavingAcc: " + super.toString();
    }
}

