package CI646.books;

public class BookContentsFormatter extends BookFormatter{
    public BookContentsFormatter(Book book) {
        super(book);
    }

    @Override
    public String format() {
//        String[] contents = new String[0];
//        try {
//            contents = readLines("etc/pg1459.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
//        Date dob = null;
//        try {
//            dob = formatter.parse("09/26/1888");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Author a = new Author("Thomas", "Stearns", "Eliot", dob);
//        Book b = new Book("Prufrock and Other Observations", a, contents);
//        b.save();
//        Optional<Book> anotherBook = Book.read(b.getTitle()+".ser");
//        if(anotherBook.isPresent()){
//            b = anotherBook.get();
//            b.printInfo();
//            for(int i=0;i<b.getLength();i++) {
//                System.out.println("------------------------------------------------- ");
//                b.printHeader();
//                System.out.println("------------------------------------------------- \n");
//
//                b.printPage();
//                b.turnPage();
//            }
//        }
        return null;
    }
}
