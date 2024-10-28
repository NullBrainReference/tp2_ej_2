package tp2_ej_2;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		
		var materials = new ArrayList<Material>();
		materials.add(new Bricks(4));
		materials.add(new Wood(5));
		
		var project1 = new Project(40, 50, materials);
		project1.AssignEngineer("Snoop Dog");
		
		System.out.println(project1.toString());
	}
}
