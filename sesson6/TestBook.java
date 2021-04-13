package sesson6;

public class TestBook {
    public static void main(String[]args){
        Author ahTeck = new Author("Tan Ah Teck","teck@nowhere.com",'m');
        System.out.println(ahTeck);
        Book dummyBook = new Book("Java for dummies", ahTeck, 9.99, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("Name is:"+ dummyBook.getName());
        System.out.println("Price is:"+ dummyBook.getPrice());
        System.out.println("Qty is:"+ dummyBook.getQty());
        System.out.println("Author is:"+ dummyBook.getAuthor());
        System.out.println("Author name is:"+ dummyBook.getAuthor().getName());
        System.out.println("Email is:"+ dummyBook.getAuthor().getEmail());
        System.out.println("Gender is:"+ dummyBook.getAuthor().getGender());
        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee","peter@nowhere.com",'m'),19.99,8);
        System.out.println(moreDummyBook);
    }
}
