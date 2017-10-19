
public class Mammal extends Animal{

	private String name;
	private int move_power;
	public Mammal(String name,int move_power)
	{
		super(name,move_power);
		super.can_move();
	}
	public void can_move()
	{
		System.out.println("I am a mammal");
	}
}
