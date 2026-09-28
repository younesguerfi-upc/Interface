public class Program {

    public static void main(String[] args) {

        // =========================
        // Test Persons
        // =========================

        Person[] persons = {
                new Person("Younes", "Guerfi"),
                new Person("Ahmed", "Benali"),
                new Person("Sara", "Amrani"),
                new Person("Ali", "Guerfi"),
                new Person("Mohamed", "Cherif")
        };

        // Create a Sorter
        Sorter sorter = new Sorter();

        // Sort Persons
        sorter.sort(persons);

        // Print sorted Persons
        System.out.println("Sorted Persons:");

        for (Person person : persons) {
            person.printNameAndSurname();
        }


        // =========================
        // Test Rectangles
        // =========================

        Rectangle[] rectangles = {
                new Rectangle(5, 3),   // Area = 15
                new Rectangle(2, 4),   // Area = 8
                new Rectangle(10, 2),  // Area = 20
                new Rectangle(3, 3),   // Area = 9
                new Rectangle(4, 5)    // Area = 20
        };

        // Sort Rectangles
        sorter.sort(rectangles);

        // Print sorted Rectangles
        System.out.println("\nSorted Rectangles:");

        for (Rectangle rectangle : rectangles) {
            System.out.println("Area: " + rectangle.calculateArea());
        }
    }
}