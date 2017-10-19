
public class Land extends Mammal{

	private String name;
	private int move_power;
	public Land(String name,int move_power)
	{
		super(name,move_power);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("I am an Land");
	}
}
