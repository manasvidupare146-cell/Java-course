package OOPExample;

import java.awt.print.Book;

class Passenger {

    String seatno = "A139 Emirates";
    String name = "Petter Parkar";
    String destination = "Mexico";

}
class Booking extends Passenger{

    Booking(String Bookingno, String Airlinesname, String Destinationname ) {
        System.out.println("Bookingno: " + Bookingno);
        System.out.println("Airlinesname: " + Airlinesname);
        System.out.println("Destinationname: " + Destinationname);
        System.out.println("Passenger Details: " + seatno + "| Name: " + name + "| Destination: " + destination);

    }
}

public class SingleInheritenceExample {
    public static void main(String[] args) {
        Booking no = new Booking("A139","Emirates" ,"Mexico");

    }
}
