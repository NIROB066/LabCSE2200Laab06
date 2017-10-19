
public class Animal {
	private String name;
	private int move_power;

	public Animal(String name,int move_power)
	{
		this.name=name;
		this.move_power=move_power;
	}
	public void can_move()
	{
		System.out.println("Name of Animal: "+this.name);
		System.out.println("Move Power: "+this.move_power);
		System.out.println("I am a animal");
	}
	public void variadic(String... Strs)
	{
		for (String str : Strs)
	        System.out.println("I am a varadic");
	    }
	}
	
	
