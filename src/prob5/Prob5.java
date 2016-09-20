package prob5;

public class Prob5 {
	public static void main(String[] args) {
		Employee pt = new Depart( "홍길동", 5000, "개발부" );
		Employee pt2= new Employee("남달우",3000);
		pt.getInformation();
		pt2.getInformation();
	}
}
