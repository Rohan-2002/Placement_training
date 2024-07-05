package MMBankCaseStudyPackage;

public class MainClass {
    public static void main(String[] args) {
        BankFactory bankFactory = new MMBankFactory();

        SavingAcc savingAcc = bankFactory.getNewSavingAcc(101, "John Doe", 1000, true);
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(102, "Jane Doe", 5000, 1000);

        savingAcc.withdraw(200);
        currentAcc.withdraw(6000);

        System.out.println(savingAcc.toString());
        System.out.println(currentAcc.toString());
    }
}


/*
 * Output : MMSavingAcc: Account No: 101, Account Name: John Doe, Account Balance: 800.0, isSalaried: true
			MMCurrentAcc: Account No: 102, Account Name: Jane Doe, Account Balance: -1000.0, Credit Limit: 1000.0
 */
