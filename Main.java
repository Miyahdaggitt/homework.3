public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.setAmount(3000);

        while (true){
            try {
                System.out.println(bankAccount.withdraw());
            }catch (Exception e){

            }
        }

    }
}
