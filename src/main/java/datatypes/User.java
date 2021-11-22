package datatypes;

public class User {
    public String name;
    public String username;
    public String email;
    public String phone;
    public String website;
    public Address address;
    public Company company;

    public class Company {
        public String name;
        public String catchPhrase;
        public String bs;
    }

    public class Address {
        public String street;
        public String suite;
        public String city;
        public String zipcode;
        public Geo geo;
    }

    public class Geo {
        public String lat;
        public String lng;
    }
}
