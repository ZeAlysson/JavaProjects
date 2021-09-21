package fundamentos;

public class primitive_types {
    public static void main(String[] args) {

        // Integers numeric types
        byte companyYears = 23; //max value = 127
        short flightsNumber = 536; //max value = 32767
        int id = 10245; //max value = 2_147_483_647
        long accumulatedPoints = 3_134_329_199L; //max value = 9223372036854775807L;

        // Reals numeric types
        float salary = 11_285.25F;
        double accumulatedSales = 2_991_892_123.87;

        //boolean type
        boolean holidays = true; //values = false or true

        //character type
        char status = 'A'; //online

        //company days
        System.out.println("Company days = " + companyYears*365);

        //number of travels
        System.out.println("Travels quantity = " + flightsNumber/2);

        //accumulated points
        System.out.println("Accumulated points = " + accumulatedPoints/ accumulatedSales);

        //id and salary of the functionary 
        System.out.println("Functionary id " + id + " gets " + salary);

        //on holidays
        System.out.println("Holidays? " + holidays);

        //status of activity
        System.out.println("Status: " + status);

    }
}
