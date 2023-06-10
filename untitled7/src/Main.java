import java.util.*;
public class Main {

    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                List<Person> persons = new ArrayList<>();
                System.out.print("Введите количество человек: ");
                int n = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.print("Введите фамилию: ");
                    String lastName = scanner.nextLine();
                    Person person = new Person(lastName);
                    System.out.print("Введите номер СНИЛС: ");
                    String snilsId = scanner.nextLine();
                    person.setSnilsId(snilsId);
                    persons.add(person);
                }

                for (Person person : persons) {
                    System.out.println("Фамилия: " + person.getLastName());
                    System.out.println("Номер СНИЛСа: " + person.getsnilsId());
                    System.out.println("Номер человека: " + person.getPersonId());
                    System.out.println();
                }

                System.out.print("Введите фамилию для поиска: ");
                String searchLastName = scanner.nextLine();
                List<Person> resultByLastName = Person.searchByLastName(persons, searchLastName);
                System.out.println("Найденные люди по фамилии " + searchLastName + ":");
                for (Person person : resultByLastName) {
                    System.out.println(person.getLastName() + " " + person.getPersonId());
                }
                System.out.println();
                System.out.print("Введите номер человека для поиска: ");
                String searchPeopleNumberId = scanner.nextLine();
                List<Person> person1 = Person.searchPeopleNumberId(persons, searchPeopleNumberId);
                System.out.println("Найденные люди по номеру:");
                System.out.println(searchLastName + " " + searchPeopleNumberId);
            }
        }
