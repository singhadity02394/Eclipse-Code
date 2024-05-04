package Anudip;

// Superclass
class HillStations {
    // Method to get location
    void location() {
        System.out.println(" Various locations in India");
    }

    // Method to get famousfor
    void famousFor() {
        System.out.println("Famous for .");
    }
}

// Subclass 1
class Manali extends HillStations {
    // Overriding location method
    void location() {
        System.out.println(" Manali, Himachal Pradesh, India");
    }

    // Overriding famousFor method
    void famousFor() {
        System.out.println("Famous for itsbeauty, adventure activities, and snowfall.");
    }
}

// Subclass 2
class Mussoorie extends HillStations {
    // Overriding location method
    void location() {
        System.out.println("Location: Mussoorie, Uttarakhand, India");
    }

    // Overriding famousFor method
    void famousFor() {
        System.out.println("Famous for its green hills, waterfalls, and pleasant climate.");
    }
}

// Subclass 3
class Gulmarg extends HillStations {
    // Overriding location method
    void location() {
        System.out.println(" Gulmarg, Jammu and Kashmir, India");
    }

    // Overriding famousFor method
    void famousFor() {
        System.out.println("Famous for its .");
    }
}

// Main class
public class Location{
    public static void main(String[] args) {
        // Creating objects of subclasses
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();


        HillStations hillStation = new HillStations();
        hillStation.location();
        hillStation.famousFor();


        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}
