class Address {
    private String street;
    private String city;
    private Geo geo;

    public Address(String street, String city, Geo geo) {
        this.street = street;
        this.city = city;
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", geo=" + geo +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Geo getGeo() {
        return geo;
    }
}