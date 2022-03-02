package com.zensar.training.ui;

import com.zensar.training.bean.Exectable;
import com.zensar.training.bean.Executable2;

public class Main3 {

	public static void main(String[] args) {
		Executable2 exectable;
		/*exectable=new Exectable() {
			
			@Override			
			public void execute() {			//though this is method it is like object passing
				System.out.println("Helloo ppl");
			}
		};
		exectable.execute();//object creation
*/		exectable=(Integer obj,String sobj)->{
			System.out.println(sobj+obj.intValue());
			};//execute method body
		exectable.execute(23,"Ash ");
		
		//instered of creating object we create execution method
		exectable=(Integer obj,String sobj)->{
			System.out.println(sobj+obj.doubleValue());
		};
		exectable.execute(53,"Savi ");
		//type specification is not needed
		
	}

}
