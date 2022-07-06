public class Clerk extends Employee {
    public Clerk(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Constance.CLERK_DEFAULT_SALARY, Constance.CLERK_TYPE, employeeDateOfBirth);
    }

public void answerCalls (String employeeName) {
    System.out.println (String.format("The employee %s answered the phone", employeeName));

}
    public void makeCalls (String employeeName) {
        System.out.println (String.format("The employee %s made the phone call", employeeName));

    }

}
