package StudentDomen;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee extends User {

    /**
     * Идентификатор сотрудника.
     */
    private int empId;

    public Employee(String firstName, String secondName, int age, String address, int empId) {
        super(firstName, secondName, age, address);
        this.empId = empId;
    }

    /**
     * Метод, возвращающий идентификатор сотрудника.
     * @return Идентификатор сотрудника.
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Метод, устанавливающий идентификатор сотрудника.
     * @param empId Идентификатор сотрудника.
     */
    public void setEmpId(int empId) {

        this.empId = empId;
    }

    /**
     * Переопределенный метод toString для класса Employee.
     * @return Строковое представление объекта класса Employee.
     */
    @Override
    public String toString() {
        return "Employee{"
                +  "firstName = " + super.getFirstName()
                + ", secondName = " + super.getSecondName()
                + ", age = " + super.getAge()
                + ", address = " + super.getAddress()
                + ", employeeID = " + empId +
                "}";
    }
}
