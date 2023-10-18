public class Administrator extends Kadr {
    private String typeOfKadr = "Administrator";
    private Integer accessKey;
    private Double hourlyRate = 29.0;

    public Administrator (String fullName, String dateOfBirthday, Integer accessKey) {
        super(fullName, dateOfBirthday);
        this.accessKey = accessKey;
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