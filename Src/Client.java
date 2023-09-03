public class Client {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phone;
    private String weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public Client(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone, String weight, String bloodPressure, int stepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;

        // Calculate age
        this.age = 2020 - yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAccountInfo() {
        System.out.println("     * * *");
        System.out.printf("First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "Date of Birth: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth + "\n"
                + "Email: " + email + "\n" + "Phone: " + phone + "\n"
                + "Weight: " + weight + "\n"
                + "Blood Pressure: " + bloodPressure + "\n"
                + "Steps per Day: " + stepsPerDay + "\n"
                + "Age: " + age + "\n");
        System.out.println("................");
    }
}

