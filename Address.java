public class Address {

    private String streetAddress;
    private String city;
	private String state;
	private int zipCode;
	
	public Address(){}
	public Address(String sa, String c, String s, int z){
		streetAddress = sa;
		city = c;
		state = s;
		zipCode = z;
	}
	@Override
    public String toString() {
		String result = streetAddress + ", " + city + ", " +  state + ", " +  zipCode;
        return result;
    }
}