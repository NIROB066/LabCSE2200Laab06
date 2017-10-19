
public class Main_class {

	public static void main(String[] args) {
		Animal an=new Animal("Horse",15);
		an.can_move();
		Animal ov=new Oviparaous("Oviparous",90);
		ov.can_move();
		Oviparaous OV=new Oviparaous("Ovi",99);
		OV.can_move();
		Mammal m=new Mammal("Mammal",89);
		Birds B=new Birds("Bird",789);
		Land l=new Land("Lands",78);
		Water w=new Water("Water",567);
		Mammal LL=new Land("MammalLand",7800);
		LL.can_move();
		Animal ani=new Animal("Ni",90);
		ani.variadic("Ani","io");
	}

}
