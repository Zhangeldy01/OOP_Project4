package StudentService;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для работы с объектами типа Teacher.
 */
public class TeacherService implements iUserService<Teacher> {
    private int count;  // поле счетчик
    private String academicDegree; // поле ученая степень
    private List<Teacher> teachers; // список объектов типа Teacher

    /**
     * Конструктор класса. Инициализирует список объектов типа Teacher.
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /**
     * Метод для получения списка всех объектов типа Teacher.
     * @return список всех объектов типа Teacher.
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Метод для создания нового объекта типа Teacher и добавления его в список.
     * @param firstName имя преподавателя.
     * @param secondName фамилия преподавателя.
     * @param age возраст преподавателя.
     * @param address адрес преподавателя.
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        Teacher pers = new Teacher(firstName, secondName, age, address, count, academicDegree);
        count++; // увеличивает счетчик на 1
        teachers.add(pers); // добавляет объект в список
    }

    /**
     * Метод для получения списка всех объектов типа Teacher, отсортированных по ФИО.
     * @param teacherId идентификатор преподавателя.
     * @return список всех объектов типа Teacher, отсортированных по ФИО.
     */
    public List<Teacher> getSortedByFIOStudentGroup(int teacherId) {
        List<Teacher> teachs = new ArrayList<>(teachers); // создает копию списка объектов типа Teacher
        teachs.sort(new UserComparator<Teacher>()); // сортирует список по ФИО
        return teachs; // возвращает отсортированный список
    }
}
