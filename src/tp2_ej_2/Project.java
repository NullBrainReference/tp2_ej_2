package tp2_ej_2;

import java.util.List;

public class Project {
	private float x;
	private float y;
	private List<Material> materialsRequiered;
	private String engineerName;
	
	public Project(float x, float y, List<Material> materials) {
		this.x = x;
		this.y = y;
		this.materialsRequiered = materials;
	}
	
	public void AssignEngineer(String name) {
		this.engineerName = name;
	}
	
	public float CalculateTotalCost() {
		float total = 0;
		for (Material material : materialsRequiered) {
			total += material.GetCost();
		}
		
		total += x * y * 2000;
		total *= 1.4f;
		
		return total;
	}
	
	public int GetBuildDays() {
		int days = 0;
		
		days += x * y;
		
		for (Material material : materialsRequiered) {
			days += material.GetWeight() * 10;
		}
		
		return days;
	}
	
@	Override
	public String toString() {
		return String.format("Project led by %s will cost %s and takes %s days to build",
				engineerName == null ? "-" : engineerName,
				CalculateTotalCost(),
				GetBuildDays()
				);
	}
}
