/*
Design and implement a class called Flight that represents an airline flight. 
It should contain instance data that represents the airline name, flight number, 
and the flight’s origin and destination cities. Define the Flight constructor to accept
 and initialize all instance data. Include getter and setter methods for all instance data. 
 Include a toString method that returns a one-line description of the flight.
  Create a driver class calledFlightTest, whose main method instantiates and updates 
  several Flight objects.
*/
public class Flight{
    private String airlineName;
    private int flightNumber;
    private String flightOr;
    private String flightDest;
public Flight(String a, int b, String c, String d){
    this.airlineName = a;
    this.flightNumber = b;
    this.flightOr = c;
    this.flightDest = d;
}
public String getAirlineName(){
return airlineName;
}
public int getFlightNumber(){
    return flightNumber;
}
public String getFlightOr(){
    return flightOr;
}
public String getFlightDest(){
    return flightDest;
}
public void setAirlineName(String newName){
    airlineName = newName;
}
public void setFlightNumber(int newFlightNum){
    flightNumber = newFlightNum;
}
public void setFlightOr(String newOrigin){
    flightOr = newOrigin;
}
public void setFlightDest(String newDest){
    flightDest = newDest;
}
public String toString(){
    return "The Airline " + getAirlineName() + 
    " Flight Number " + getFlightNumber() + 
    " will depart " + getFlightOr() + 
    "and arrive at " + getFlightDest();
}
}
