public class Manager extends Employee{


    public Manager(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Constance.MANAGER_DEFAULT_SALARY, Constance.MANAGER_TYPE, employeeDateOfBirth);
    }

    public void hireEmployee (String employeeName) {
        System.out.println(String.format("the employee %s was hired", employeeName));
    }
    public void fireEmployee (String employeeName) {
        System.out.println(String.format("the employee %s was fired", employeeName));

    }
}
