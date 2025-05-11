
//9️ Chained exceptions across layers
//Simulate a layered app:
//         Repository throws SQLException.
//         Service layer catches it, wraps it in a ServiceLayerException.
//         Controller layer catches ServiceLayerException and logs it.
//Write code demonstrating this multi-layer exception wrapping.

package exception.question9;

import java.sql.SQLException;

public class LayeredApp {

    // Repository: Simulates DB access and throws SQLException
    public static void repositoryMethod() throws SQLException {
        throw new SQLException("Database connection failed");
    }

    // Service Layer: Wraps the exception
    public static void serviceMethod() throws ServiceLayerException {
        try {
            repositoryMethod();
        } catch (SQLException e) {
            throw new ServiceLayerException("Service failed due to DB error", e);
        }
    }
    // Controller Layer: Catches and logs full chain
    public static void controllerMethod() {
        try {
            serviceMethod();
        } catch (ServiceLayerException e) {
            System.err.println("Controller caught error: " + e.getMessage());
            System.err.println("Caused by: " + e.getCause());  // Original SQLException
        }
    }


    public static void main(String[] args) {
        controllerMethod();
    }
}
