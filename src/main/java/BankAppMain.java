public class BankAppMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1, "10.01.1977");
        Accountant accountant = new Accountant("Mary Jones", 2, "16.10.1980");
        Clerk clerk = new Clerk("Michael Hill", 3, "20.04.1990");

        System.out.println(manager.toString());
        System.out.println(accountant.toString());
        System.out.println(clerk.toString());

        manager.fireEmployee("Ivan Ivanov");
        accountant.createReport("Mary Jones");
        clerk.makeCalls("Susan Donovan");

        accountant.setName("Mary Petrov");
        System.out.println(accountant.toString());


    }

}
