public class Ingeneer extends Kadr {
    private String typeOfKadr = "Ingeneer";
    private String education;
    private Double hourlyRate = 25.0;

    public Ingeneer (String fullName, String dateOfBirthday, String education) {
        super(fullName, dateOfBirthday);
        this.education = education;
    }
    @Override
    public void Show() {
        System.out.println("- - - - - - - - - - - - -"); 
        System.out.println("Name: " + this.fullName);
        System.out.println("Birthdate: " + this.dateOfBirthday);
        System.out.println("Hourly rate: " + this.hourlyRate);
        System.out.println("- - - - - - - - - - - - -"); 
    }
}