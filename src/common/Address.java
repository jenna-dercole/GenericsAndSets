package common;

public class Address {
    private String address1;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String email;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.address1 != null ? this.address1.hashCode() : 0);
        hash = 89 * hash + (this.city != null ? this.city.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if ((this.address1 == null) ? (other.address1 != null) : !this.address1.equals(other.address1)) {
            return false;
        }
        if ((this.zipCode == null) ? (other.zipCode != null) : !this.zipCode.equals(other.zipCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address: " + address1 + "\n" + "City: " + city + "\n"
                + "State: " + state + "\n" + "Zip Code: " + zipCode + "\n" 
                + "Phone Number: " + phone + "\n" + "Email address: " + email;
    }

    public static void main(String[] args) {
        Address add1 = new Address();
        add1.setAddress1("1500 N 53rd St");
        add1.setCity("Milwaukee");
        add1.setState("Wisconsin");
        add1.setZipCode("53208");
        add1.setPhone("262-442-1987");
        add1.setEmail("jeanfskldf@gamdklf");
        
        System.out.println(add1.toString());
    }
    

}
