public class Student {

    private String firstName;
    private String lastName;
	private Address homeAddress;
	private Address schoolAddress;
	
	public Student(){}
	public Student(String f, String l, Address ha, Address sa){
		firstName = f;
		lastName = l;
		homeAddress = ha;
		schoolAddress = sa;
	}
	@Override
    public String toString() {
		String result = firstName + ", " + lastName + ", " +  homeAddress.toString() + ", " + schoolAddress.toString() ;
        return result;
    }
}