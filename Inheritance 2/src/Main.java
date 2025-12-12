public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new AdventureBook("Treasure Island", 300, "R. Stevenson", true),
                new ScienceBook("Physics 101", 200, "I. Newton", false, "Physics"),
                new FantasyBook("Norse Legends", 400, "Various", true, "Norway")
        };

        Employee[] employees = new Employee[] {
                new BookShelver("nata", "kvant", 1),
                new BookIssuer("Nino", "mimadze", 2, 9, 17),
                new BookAdvisor("lizi", "mimadze", 3, 4.5, null),
                new SilenceController("salome", "mimadze", 4, 8.0)
        };

        Library library = new Library("Library", employees, books);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof BookAdvisor) {
                ((BookAdvisor) employees[i]).setLibrary(library);
            }
        }

        System.out.println(library);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof BookAdvisor) {
                BookAdvisor advisor = (BookAdvisor) employees[i];
                Book recommended = advisor.recommendBook();
                if (recommended != null) {
                    System.out.println(advisor.getFirstName()+ " we recommend: " + recommended.getTitle());}
            }
        }
    }
}
