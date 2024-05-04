package Anudip;


    class User {
        // Properties
        protected int id;
        protected String name;

        // Parameterized constructor
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    class Employee extends User {
        // Additional properties
        private double salary;

        // Parameterized constructor
        public Employee(int id, String name, double salary) {
            super(id, name);
            this.salary = salary;
        }

        // Method to calculate annual salary
        public double calculateAnnualSalary() {
            return salary * 12; // Assuming salary is monthly
        }
    }

    public class AnualSalary {
        public static void main(String[] args) {
            // Create an object of Employee class
            Employee employee = new Employee(12345, "Aditya", 5000.0);

            // Calculate annual salary
            double annualSalary = employee.calculateAnnualSalary();

            // Display the annual salary
            System.out.println("Annual salary of " + employee.name + " (ID: " + employee.id + ") is: $" + annualSalary);
        }
    }


