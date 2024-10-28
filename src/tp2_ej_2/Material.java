package tp2_ej_2;

public abstract class Material {
	protected float costPerTon;
	protected float weight;
	
	public float GetCost() {
		return costPerTon * weight;
	}
	public float GetWeight() {
		return weight;
	}
}
