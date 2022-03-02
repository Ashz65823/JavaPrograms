package Pack2;
import Pack1.Hello;//.* is not recommended
import Pack1.Training;
import Pack1.Welcome;

public class Main {

	public static void main(String[] args) {
		Welcome w=new Welcome();//have to import package
		w.greet();
		Hello h=new Hello();
		h.test();
		Training t=new Training();
		System.out.println(t);
	}

}
