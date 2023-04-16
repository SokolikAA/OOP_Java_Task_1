public class Tree {
    public static void main(String[] args) {
        Mother mother = new Mother("Елена", 42, "female");
        Father father = new Father("Алексей", 43, "male");
        Daughter daughter = new Daughter("Олеся", 23, "female");
        Son son = new Son("Денис", 19,"male");

        System.out.println("Глава семьи: " + father.showInfoFather());
        System.out.println("Его жена: " + mother.showInfoMother());
        System.out.println("Их дочь: " + daughter.showInfoDaughter());
        System.out.println("Их сын: " + son.showInfoSon());
    }

}
