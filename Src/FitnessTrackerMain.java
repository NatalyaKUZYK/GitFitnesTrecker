public class FitnessTrackerMain {
    public static void main(String[] args) {
        Client user1 = new Client("John", "Doe", 15, 6, 1990, "johndoe@gmail.com", "1234567890", "75 kg", "120/80", 8000);
        Client user2 = new Client("Jane", "Smith", 20, 8, 1985, "janesmith@gmail.com", "9876543210", "65 kg", "110/70", 10000);
        Client user3 = new Client("Mike", "Johnson", 10, 4, 1995, "mikejohnson@gmail.com", "5555555555", "80 kg", "130/90", 5000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        // Modify user1's weight and steps per day
        user1.setWeight("80 kg");
        user1.setStepsPerDay(10000);

        // Modify user2's blood pressure
        user2.setBloodPressure("115/75");

        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}

