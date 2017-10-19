
public class Insects extends Oviparaous {

	private String name;
	private int move_power;
	public Insects(String name,int move_power)
	{
		super(name,move_power);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("I am an Insect");
	}
}
