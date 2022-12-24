package polyankina_kvbo0821.prac4_1.hw_4_1_5;

class Reader {

    private String full_name_info;
    private int readers_ticket_number;
    private String faculty;
    private String birth_date;
    private String number;

    public void returnBook(){

    }

    public void setFull_name_info(String full_name_info) {
        this.full_name_info = full_name_info;
    }
    public void setReaders_ticket_number(int readers_ticket_number) {
        this.readers_ticket_number = readers_ticket_number;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public Reader() {

    }

    public void takeBook(int count_book){
        System.out.println(full_name_info + " took " + count_book + " books");
    }

    public void takeBook(String... name_book){
        System.out.print(full_name_info + " took books: ");
        for (int i = 0;i < name_book.length; i++){
            System.out.print(name_book[i] + "; ");
        }
        System.out.println();
    }
    public void takeBook(Book... book){
        System.out.print(full_name_info + " took books: ");
        for (int i = 0; i < Book.count; i++){
            System.out.print(book[i].getName_book() + "; ");
        }
        System.out.println();
    }

    public void returnBook(Book... book){
        System.out.print(full_name_info + " returned books: ");
        for (int i = 0; i < Book.count; i++){
            System.out.print(book[i].getName_book() + "; ");
        }
        System.out.println();
    }

}

class Book {

    private String author;
    private String name_book;
    public static int count;

    public Book() {
        count++;
    }

    public int getInstances() {
        return count;
    }
    public void setName_book(String name_book) {
        this.name_book = name_book;
    }
    public String getName_book() {
        return name_book;
    }

}

class Tester {
    public static void main(String[] args) {
        Reader[] objects = new Reader[3];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Reader();
        }

        Book b1 = new Book();
        Book b2 = new Book();

        b1.setName_book("Physics encyclopedia");
        b2.setName_book("History of physics");
        objects[0].setFull_name_info("Amarov. B. V.");
        objects[0].setReaders_ticket_number(12);
        objects[0].setFaculty("physics");
        objects[0].setBirth_date("09 01 2003");
        objects[0].setNumber("8 916 243 05-35");
        objects[0].takeBook(3);
        objects[0].takeBook("Coding", "Biology", "Math");
        objects[0].takeBook(b1, b2);
        objects[0].returnBook(b1, b2);
    }
}