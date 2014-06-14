import com.practicaljava.lesson6.*;

public class TestPayIncrease {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Rafael");
		System.out.println(emp.INCREASE_CAP);
		
		Person persons[] = new Person[5];
		persons[0] = new Person("um");
		persons[1] = new Employee("dois");
		persons[2] = new Person("tres");
		persons[3] = new Contractor("quatro");
		persons[4] = new Person("cinco");
		
		// for (Employee p : persons) { }  // erro de compilação
		
		for (Person p : persons) {
			System.out.println(p.getName());
		}
	}
}
