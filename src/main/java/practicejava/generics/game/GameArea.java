package practicejava.generics.game;

public class GameArea {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 15);
        Schoolar schoolar2 = new Schoolar("Sonya", 15);
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Polya", 20);
        Employee employee1 = new Employee("Vasa", 30);
        Employee employee2 = new Employee("Bob", 31);

        Team<Schoolar> schoolars = new Team<>("Schoolars");
        schoolars.addParticipant(schoolar1);
        schoolars.addParticipant(schoolar2);

        Team<Student> students = new Team<>("Students");
        students.addParticipant(student1);
        students.addParticipant(student2);

        Team<Employee> employees = new Team<>("Employees");
        employees.addParticipant(employee1);
        employees.addParticipant(employee2);

        schoolars.playWith(schoolars);
    }
}
