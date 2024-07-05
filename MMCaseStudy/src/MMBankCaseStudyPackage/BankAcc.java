package MMBankCaseStudyPackage;

public abstract class BankAcc {
    private final int accNo;
    private String accNm;
    private float accBal;

    public BankAcc(int accNo, String accNm, float accBal) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.accBal = accBal;
    }

    public abstract void withdraw(float amount);
    public void deposit(float amount) {
        accBal += amount;
    }

    @Override
    public String toString() {
        return "Account No: " + accNo + ", Account Name: " + accNm + ", Account Balance: " + accBal;
    }

    // Getters and setters
    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getAccBal() {
        return accBal;
    }
    
    public float setAccBal(float accBal) {
    	return this.accBal = accBal;
    }
}

