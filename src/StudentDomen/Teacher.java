package StudentDomen;

/**
 * Класс, представляющий преподавателя.
 * Наследуется от класса User.
 */
public class Teacher extends User {
    private int teacherId; // Уникальный идентификатор преподавателя
    private String academicDegree; // Ученая степень преподавателя

    /**
     * Конструктор класса Teacher.
     * @param firstName Имя преподавателя.
     * @param secondName Фамилия преподавателя.
     * @param age Возраст преподавателя.
     * @param address Адрес преподавателя.
     * @param teacherId Уникальный идентификатор преподавателя.
     * @param academicDegree Ученая степень преподавателя.
     */
    public Teacher(String firstName, String secondName, int age, String address, int teacherId, String academicDegree ) {
        super(firstName, secondName, age, address);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    /**
     * Метод для получения уникального идентификатора преподавателя.
     * @return Уникальный идентификатор преподавателя.
     */
    public int getTeacerId() {
        return teacherId;
    }

    /**
     * Метод для установки уникального идентификатора преподавателя.
     * @param teacherId Уникальный идентификатор преподавателя.
     */
    public void setTeacherId(int teacherId) {

        this.teacherId = teacherId;
    }

    /**
     * Метод для получения ученой степени преподавателя.
     * @return Ученая степень преподавателя.
     */
    public String getAcademicDegree() {

        return academicDegree;
    }

    /**
     * Метод для установки ученой степени преподавателя.
     * @param academicDegree Ученая степень преподавателя.
     */
    public void setAcademicDegree(String academicDegree) {

        this.academicDegree = academicDegree;
    }

    /**
     * Переопределенный метод toString для класса Teacher.
     * @return Строковое представление объекта класса Teacher.
     */
    @Override
    public String toString() {
        return "Teacher{"
                +  "firstName = " + super.getFirstName()
                + ", secondName = " + super.getSecondName()
                + ", age = " + super.getAge()
                + ", address = " + super.getAddress()
                + ", teacherID = " + teacherId
                + ", academicDegree = " + academicDegree +
                "}";
    }
}
