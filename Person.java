/**
 * Person
 */
public class Person {

    public String Firstname;
    public String Lastname;
    public int Age;
    public void PrintPerson() {
        System.out.println("\nPerson...");
        System.out.println("Firstname: " + Firstname );
        System.out.println("Lastname: " + Lastname );
        System.out.println("Age: " + Age );
    }


    public static void main(String[] args) {
        Person mPerson = new Person();
        mPerson.Firstname = "Mark";
        mPerson.Lastname = "Crouch";
        mPerson.Age = 57;
        mPerson.PrintPerson();

        // System.out.println("Firstname: " + mPerson.Firstname );
        // System.out.println("Lastname: " + mPerson.Lastname );
        // System.out.println("Age: " + mPerson.Age );

        Superhero mSuperhero = new Superhero();
        mSuperhero.Superpower = "Flying";
        mSuperhero.AliasName = "Spiderman";
        mSuperhero.InvincabiltyFactor = 10;
        mSuperhero.Firstname = "Peter";
        mSuperhero.Lastname = "Parker"; 
        mSuperhero.Age = 24;

        mSuperhero.PrintSuperhero();
    }
}
