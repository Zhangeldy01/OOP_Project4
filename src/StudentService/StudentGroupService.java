package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

/**
 * Класс для работы с объектами типа StudentGroup.
 */
public class StudentGroupService {
    private List<StudentGroup> groups; // список объектов типа StudentGroup
    int count;

    /**
     * Конструктор класса. Инициализирует список объектов типа StudentGroup.
     */
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

    /**
     * Метод для получения списка всех объектов типа StudentGroup.
     * @return список всех объектов типа StudentGroup.
     */
    public List<StudentGroup> getAll()
    {
        return this.groups;
    }

    /**
     * Метод для получения списка всех студентов определенной группы, отсортированных по ФИО.
     * @param numberOfGroup номер группы.
     * @return список всех студентов определенной группы, отсортированных по ФИО.
     */
    public List<Student> getSortedByFIOStudentGroup(int numberOfGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(numberOfGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}