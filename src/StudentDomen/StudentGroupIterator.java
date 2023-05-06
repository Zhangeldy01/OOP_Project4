package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс реализует итератор для списка студентов.
 */
public class StudentGroupIterator implements Iterator<Student>{

    /**
     * counter используется для отслеживания текущей позиции в списке студентов
     * students содержит ссылку на список студентов, по которому будет производиться итерация.
     */
    private int counter;
    private final List<Student> students;

    /**
     * Конструктор класса StudentGroupIterator.
     * @param listStud список студентов
     */
    public StudentGroupIterator(List<Student> listStud) {
        this.students = listStud;
        this.counter = 0;
    }

    /**
     * Метод для проверки наличия следующего элемента в списке.
     * @return true, если следующий элемент существует, иначе - false
     */
    @Override
    public boolean hasNext() {
        return counter<students.size();
    }

    /**
     * Метод для получения следующего элемента списка.
     * @return следующий элемент списка
     */
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);
    }
}
