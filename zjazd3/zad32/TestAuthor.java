package zad32;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setSurname("Prus");
        author1.toString();

        Author author2 = new Author();
        author2.setSurname("Leśmian");
        author2.toString();

        Author author3 = new Author();
        author3.Author("Eliza", "Orzeszkowska", 34);
        author3.toString();
        System.out.println("Name: "+author3.getName()+" age: "+author3.getAge());


    }
}


