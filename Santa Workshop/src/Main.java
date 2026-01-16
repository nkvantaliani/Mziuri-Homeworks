public class Main {
    public static void main(String[] args) {

        Elf elf1 = new Elf("mimi", "mimichka", 120, 5, "ToyMaker");

        elf1.makeToy();
        elf1.wrapGifts();
        System.out.println(elf1);


        Reindeer r1 = new Reindeer("kiko", "kiki",4, 85,"red");
        r1.fly();
        System.out.println("Fitness: " + r1.checkFitnessLevel());

        Child c1 = new Child("Nata", 8);
        c1.addWish("doll");
        Child c2 = new Child("Mari", 3);
        c2.addWish("phone");

        Santa santa = new Santa("Santa", "Claus", 100);
        santa.addChild(c1);
        santa.addChild(c2);
        System.out.println("Nice children: " + santa.checkNaughtyOrNiceList());
        santa.deliverGifts();

        Snowman snowman = new Snowman(2, "Red",false);
        snowman.decorate("Scarf");
        snowman.makeMagical();
        snowman.melt();
        System.out.println(snowman);

    }

}