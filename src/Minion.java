public class Minion {
    private String name;
    private String surname;

    public Minion(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }
    @Override

    public String toString(){
        return String.format(
                "Name: %s, Surname: %s.",
                this.name,this.surname
        );
    }
}
