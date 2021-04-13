package sesson6;

public class TestAuthor {
    public static void main(String[]args){
        Author ahTeck = new Author("Tan Ah Teck","teck@nowhere.com",'m');
        System.out.println(ahTeck);
        ahTeck.setEmail("teck@nowhere.com");
        System.out.println(ahTeck);
        System.out.println("name is:" + ahTeck.getName());
        System.out.println("gender is:"+ ahTeck.getGender());
        System.out.println("gender is:"+ ahTeck.getEmail());
        System.out.println(ahTeck.toString());

    }
}
