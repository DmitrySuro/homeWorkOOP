public class Main {
    public static void main(String[] args) {
        Trees trees_human = new Trees();
        Human human = new Human("Igor", "Popov", 1955, 1980, "male");
        Human human1 = new Human("Egor", "Opov", 1960, 1970, "male");

        trees_human.add_human(human);
        trees_human.add_human(human1);
        System.out.println(trees_human);

    }

}