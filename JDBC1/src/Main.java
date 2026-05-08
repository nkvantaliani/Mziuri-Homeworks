public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5433/school",
                "postgres",
                "admin"
        );

    }
}