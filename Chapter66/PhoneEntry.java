class PhoneEntry
{
  private String name;    // name of a person
  private String lastName;   // their phone number
  private String phone;   // their phone number
  

  public PhoneEntry( String n, String l, String p )
  {
    name = n; lastName = l; phone = p; 
  }
  
  public String getFirstName()  {return name;}
  public String getLastName()  {return lastName;}
  public String getPhone() {return phone;}
}
