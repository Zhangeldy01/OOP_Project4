package Controllers;

import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.TeacherService;

/**
 * Контроллер для управления объектами типа Преподаватель.
 */
public class TeacherController implements iUserController<Teacher> {
    private final TeacherService tichService = new TeacherService();

    /**
     * Создает нового преподавателя с заданными параметрами.
     * @param firstName имя преподавателя
     * @param secondName фамилия преподавателя
     * @param age возраст преподавателя
     * @param address адрес преподавателя
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        tichService.create(firstName, secondName, age, address);
    }

    // Обобщенный метод для выплаты зарплаты преподавателю
    static public <T extends Teacher> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName()+" зп 10000р ");
    }

    /**
     * Метод для вычисления среднего значения числового массива.
     * @param num массив чисел
     * @param <T> тип элементов массива
     * @return среднее значение элементов массива
     */
    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for(int i =0; i<num.length;i++)
        {
            sum = sum+num[i].doubleValue();
        }
        sum = sum/num.length;
        return sum;
    }
}
