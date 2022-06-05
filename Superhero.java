public class Superhero extends Person {
    public String Superpower;
    public String AliasName;
    public int InvincabiltyFactor;

    public void PrintSuperhero() {
        super.PrintPerson();

        System.out.println("\nSuperhero...");
        System.out.println("Alias Name: " + AliasName);
        System.out.println("Superpower: " + Superpower);
        System.out.println("Invincability Factor: " + InvincabiltyFactor);
    }
}
