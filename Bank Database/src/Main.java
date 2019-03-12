public class Main extends listAccount{
    public static void main(String[] args){
            createAccount(123,2400.45, "checking");
            createAccount(234,5600,"credit");
            createAccount(7823,9800.56,"creditchecking");
            System.out.println(accountList);
            removeAccount(234);
           System.out.println(accountList);

    }
}
