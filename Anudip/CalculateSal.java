package Anudip;

// Custom exception classes
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

// TaxCalculator class
class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        double taxAmount;

        if (empSal > 100000 && isIndian) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000 && isIndian) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000 && isIndian) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }

        return taxAmount;
    }
}

// CalculatorSimulator class
public class CalculateSal {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        try {
            // Test Case 1
            System.out.println("Test Case 1:");
            taxCalculator.calculateTax("Ron", false, 34000);

        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 2
            System.out.println("\nTest Case 2:");
            double taxAmount = taxCalculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + taxAmount);

        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 3
            System.out.println("\nTest Case 3:");
            double taxAmount = taxCalculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + taxAmount);

        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 4
            System.out.println("\nTest Case 4:");
            taxCalculator.calculateTax(null, true, 30000);

        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}

