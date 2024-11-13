package info.dmerej;

public class User {
  private String name;
  private String email;
  private int age;
  private boolean verified;
  private Address address;

  public User(String name, String email, int age, boolean verified, Address address){
    this.name = name;
    this.email = email;
    this.age = age;
    this.verified = verified;
    this.address = address;
  }

  public User(String name, String email){
    this.name = name;
    this.email = email;
  }

  public User(){
    this.name = "testUser";
    this.email = "test@email.com";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isVerified() {
    return verified;
  }

  public void setVerified(boolean verified) {
    this.verified = verified;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
