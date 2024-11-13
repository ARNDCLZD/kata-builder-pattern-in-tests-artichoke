package info.dmerej;

public class UserBuilder {
  private User currentUser;

  public UserBuilder(){
    this.currentUser = new User("test", "test@gmail.com", 100, true, new Address("line1","line2","testCity","zipCode","testLand"));
  }

  public void buildName(){
    this.currentUser.setName("test");
  }

  public void buildEmail(){
    this.currentUser.setEmail("test@email.com");
  }

  public void buildAge(boolean isMinor){
    this.currentUser.setAge(isMinor ? 16 : 21);
  }

  public void buildAddress(boolean isForeigner){
    this.currentUser.setAddress(isForeigner ?
      new Address(
      "33 quai d'Orsay",
      "",
      "Paris",
      "75007",
      "France"
      ) :
      new Address(
        "51 Franklin Street",
        "Fifth Floor",
        "Boston",
        "02110",
        "USA"
      ));
  }

  public void buildVerified(boolean isVerified){
    this.currentUser.setVerified(isVerified);
  }

  public User getResult(){
    return this.currentUser;
  }

  public void reset(){
    this.currentUser = new User("test", "test@gmail.com", 100, true, new Address("line1","line2","testCity","zipCode","testLand"));
  }
}
