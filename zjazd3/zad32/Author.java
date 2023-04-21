

package zad32;

public class Author {
    private String name = "Bolesław";
    private String surname;
    private int age = 55;

    public void Author(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        System.out.println("Author name = "+getName()+" surname = "+getSurname()+", age = "+getAge());

        return null;
    }








}
