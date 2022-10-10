public class TestStudent {
    public static void main(String []args){
		Address a1=new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
		Address a2=new Address("21 Jump Street", "Lynchburg", "VA", 24551);
		Student s1=new Student("Thomas","Watson", a2,a1);
		System.out.println(s1.toString());
    }
}