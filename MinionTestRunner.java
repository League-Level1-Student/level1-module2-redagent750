package minion;

public class MinionTestRunner {
public static void main(String []args) {
	MinionTest stuart = new MinionTest("Stuart", 1, "Yellow", "");
	System.out.println(stuart.getName());
	System.out.println(stuart.getColor());
	System.out.println(stuart.setMaster("Napoleon"));
	
	MinionTest dave = new MinionTest("Dave", 2, "yellow", "");
	System.out.println(dave.getName());
	System.out.println(dave.getColor());
	System.out.println(dave.setMaster("Napoleon"));
}
}
