public class Daughter extends Human{
    public Daughter(String name, Integer age, String gender) {
        super(name, age, gender);
    }
    public String showInfoDaughter(){
        return String.format(this.getName() + ", " + this.getAge() + " года");
    }
}
