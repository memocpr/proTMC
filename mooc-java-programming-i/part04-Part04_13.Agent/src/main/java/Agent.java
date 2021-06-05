

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    public String toString() {
    return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {

        Agent bond=new Agent("James", "Bond");

        System.out.println(bond);

        Agent ionic=new Agent("Ionic", "Bond");

        System.out.println(ionic);


    }
    
}
