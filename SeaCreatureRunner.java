package sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature squidward = new SeaCreature("Squidward");
	squidward.eat();
	squidward.laugh();
	SeaCreature patrick = new SeaCreature("Patrick");
	patrick.eat();
	patrick.laugh();
}
}
