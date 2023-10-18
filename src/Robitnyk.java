public class Robitnyk extends Kadr {
    private String typeOfKadr = "Robitnyk";
    private Double hourlyRate = 18.5;

    public Robitnyk (String fullName, String dateOfBirthday) {
        super(fullName, dateOfBirthday);
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