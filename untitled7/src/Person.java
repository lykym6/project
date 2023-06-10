import java.util.*;

public class Person{
    Scanner input = new Scanner(System.in);
    private static int count = 0;
    private String lastName;
    private String snilsId;
    private final int personId;

    public Person(String lastName) {
        this.lastName = lastName;
        this.snilsId = null;
        this.personId = ++count;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSnilsId(String snilsId) {
        snilsId.matches("\\d{3}-\\d{3}-\\d{3}\\d{2}");
        this.snilsId = snilsId;
    }
    public String getsnilsId() {
        if (snilsId.matches("\\d{3}-\\d{3}-\\d{3}\\d{2}")) {
            this.snilsId = snilsId;
        } else {
            System.out.println("Ошибка: неверный номер СНИЛСа");
            input.next();
        }
        return this.snilsId;
    }


    public int getPersonId() {
        return this.personId;
    }


    public static List<Person> searchByLastName(List<Person> persons, String lastName) {
        List<Person> result = new ArrayList<>(); //?
        for (Person person : persons) {
            if (person.getLastName().equals(lastName)) {
                result.add(person);
            }
        }
        return result;
    }

    public static List<Person> searchPeopleNumberId(List<Person> persons, String personId) {
        List<Person> resultNumber = new ArrayList<>();
        for (Person person2 : persons) {
            if (personId.equals(personId)) {
                resultNumber.add(person2);
            }
        }
        return resultNumber;
    }
}