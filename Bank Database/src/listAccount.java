import java.util.HashSet;
import java.util.Set;

public class listAccount extends Account{


    static Set<Account> accountList = new HashSet<Account>();

    public listAccount(double SSN, double balance, String accountName) {
        super(SSN, balance, accountName);
    }

    public listAccount(){
        super();
    }
    public boolean equalAccount(Object o){
        if(o==null) return false;
        if(o == this) return false;
        Account that =(Account)o;
        if(this.getSSN() == that.getSSN())
            return true;
                return false;
    }
    public static Account createAccount(double SSN, double balance, String accountType) {
        Account newAccount = new Account(SSN, balance, accountType);
        if (accountList.contains(newAccount)) {
            System.out.println("Account already exists");
        }
        accountList.add(newAccount);
        return newAccount;
    }

    public static void removeAccount(int ssn) {
        for(Account rem:accountList)
        if(rem.getSSN()==ssn){
            accountList.remove(rem);
        }
    }


    public void addAccountType(String SSN)
    {

    }

 }

