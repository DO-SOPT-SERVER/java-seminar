public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello world!");

        Poketmon2 pikachu = new Poketmon2();
        System.out.println(pikachu.name);
        System.out.println(pikachu.type);

        pikachu.name = "피카츄";
        pikachu.type = PoketmonType.ELECTRIC;

        System.out.println(pikachu.name);
        System.out.println(pikachu.type);

        AquaPoketmon kkobugi = new AquaPoketmon("꼬부기");
        System.out.println(kkobugi.name);
        System.out.println(kkobugi.type);

        Child child = new Child();
        child.인사();
    }
}