package MMBankCaseStudyPackage;

public class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + getCreditLimit() >= amount) {
            super.deposit(-amount);
        } else {
            System.out.println("Insufficient balance and credit limit, cannot withdraw.");
        }
    }

    @Override
    public String toString() {
        return "MMCurrentAcc: " + super.toString();
    }
}

