public class Accountant extends Employee {


    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Constance.ACCOUNTANT_DEFAULT_SALARY, Constance.ACCOUNTANT_TYPE, employeeDateOfBirth);
    }

    public void createReport (String employeeName) {
        System.out.println(String.format("The employee %s created the Report", employeeName));

    }


}
