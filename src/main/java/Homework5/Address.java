package Homework5;

public class Address {
    private String city;
    private String streetName;
    private int postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(!city.isEmpty()){
            this.city = city;
        }else{
            System.out.println("Invalid Data!");
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        if(!streetName.isEmpty()){
            this.streetName = streetName;
        }else{
            System.out.println("Invalid Data!");
        }
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if (postalCode > 0){
            this.postalCode = postalCode;
        }else{
            System.out.println("Invalid Data!");
        }
    }
}
