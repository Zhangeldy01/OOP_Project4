package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

/**
 * Класс контроллера для управления студентами.
 */
public class StudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    /**
     * Создает нового студента.
     * @param firstName Имя студента.
     * @param secondName Фамилия студента.
     * @param age Возраст студента.
     * @param address Адрес студента.
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        dataService.create(firstName, secondName, age, address);
    }

}
