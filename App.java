public class App {
    public static void main(String[] args) throws Exception {
        PersonalAccaunt r = new PersonalAccaunt(2312, "Erbol");
        r.deposit(23000);
        r.withdraw(2000);
        System.out.println(r.getBalance());
        System.out.println(r.getAccountHolder());
        System.out.println(r.getAccountNumber());
        r.printTransactionHistory();
    }
}
