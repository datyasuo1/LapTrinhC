package Thi;

public class Fight {
    private int number;
    private  String destination;

    public Fight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }
    public Fight() {
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }
    public void display(){
        System.out.println("So hieu chuyen bay la:"+number);
        System.out.println("Noi den:"+destination);
    }
}
