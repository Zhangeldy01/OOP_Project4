package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.UserComparator;

/**
 * Класс для работы с объектами типа Student.
 */
public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;

    /**
     * Конструктор класса. Инициализирует список объектов типа Student.
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /**
     * Метод для создания нового объекта типа Student и добавления его в список.
     * @param firstName имя студента.
     * @param secondName фамилия студента.
     * @param age возраст студента.
     * @param address адрес студента.
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        Student per = new Student(firstName, secondName, age, address, count);
        count++;           // увеличивает счетчик на 1
        students.add(per); // добавляет объект в список
    }

    /**
     * Метод для получения списка всех объектов типа Student.
     * @return список всех объектов типа Student.
     */
    @Override
    public List<Student> getAll() {
        return students;
    }


    // public List<Student> getAll()
    // {
    //     return students;
    // }

    /**
     * Метод для получения списка всех объектов типа Student, отсортированных по ФИО.
     * @param studentID идентификатор студента.
     * @return список всех объектов типа Student, отсортированных по ФИО.
     */
    public List<Student> getSortedByFIOStudentGroup(int studentID) {
        List<Student> studs = new ArrayList<Student>(students); // создает копию списка объектов типа Student
        studs.sort(new UserComparator<Student>()); // сортирует список по ФИО
        return studs; // возвращает отсортированный список
    }
}
