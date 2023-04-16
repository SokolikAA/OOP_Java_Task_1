import java.util.ArrayList;

public class Tree {
    public static void main(String[] args) {
        Mother mother = new Mother("Елена", 45, "female");
        Father father = new Father("Алексей", 44, "male");
        Daughter daughter = new Daughter("Олеся", 23, "female");
        Son son = new Son("Денис", 25,"male");
        SonWife sonWife = new SonWife("Юля", 23, "female");
        SonSon sonSon = new SonSon("Игорь", 3, "male");


        System.out.println("Глава семьи: " + father.showInfoFather());
        System.out.println("Его жена: " + mother.showInfoMother());
        System.out.println("Их дочь: " + daughter.showInfoDaughter());
        System.out.println("Их сын: " + son.showInfoSon());
        System.out.println("Жена сына: " + sonWife.showInfoSonWife());
        System.out.println("Ребёнок сына: " + sonSon.showInfoSonSon());


    }

}
