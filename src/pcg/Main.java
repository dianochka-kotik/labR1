package pcg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //метод, который удаляет студентов со средним баллом меньше 3 и переводит на следующий курс в противном случае
    public static void TransferToCourse(List<Student> students)
    {
        for (int i=0;i<students.size();i++)
        {
            if (students.get(i).getAverageScore()<3)
            {
                students.remove(students.get(i));
                i--;
            }
            else
            {
                if (students.get(i).getCourse()!=4)
                {
                    students.get(i).setCourse(students.get(i).getCourse()+1);
                    students.set(i,students.get(i));
                }
            }

        }
    }
    //метод, который выводит студентов с указанного курса
   public static void PrintStudents(List<Student> students, int course)
   {
       boolean search=false;
       for (Student student: students)
       {
           if (student.getCourse()==course) {
               System.out.printf("Студент (-ка): %s %d курса.%n", student.getName(), student.getCourse());
               search=true;
           }
       }
       if (!search)
           System.out.println("Студентов с заданного курса не найдено.");
   }
    public static void main(String[] args) {
        String[] subjects = {"Математика", "Русский язык", "ООП", "Правоведение", "Методы программирования"};
        String[] names= {  "Александр", "Анна", "Дмитрий", "Диана", "Максим",
                "Иван", "Николай", "Павел", "Владимир", "Роман",
                "Евгений", "Алена", "Михаил", "Юрий", "Виктор",
                "Тимур", "Станислав", "Артем", "Константин", "Григорий",
                "Антон", "Юлия", "Игорь", "Станислав", "Вячеслав"};

        String [] groups= {"22-Иас-аид-С","20-истд-Б","19-истпк-Б","23-иас-аид-С"};

        int [] course = {1,2,3,4};
        Random random = new Random();

        List<Student> students = new ArrayList<Student>();

        for (int j=0;j<names.length;j++) {
            List<Statement> statementList = new ArrayList<Statement>();
            for (int i = 0; i < 5; i++) {
                Statement statement = new Statement(subjects[i], random.nextInt(1, 5));
                statementList.add(statement);
            }
            Student student = new Student(names[random.nextInt(24)],groups[random.nextInt(3)],course[random.nextInt(0,3)],statementList);

            students.add(student);

        }

        TransferToCourse(students);

       PrintStudents(students,2);

    }
}