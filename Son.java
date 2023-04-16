public class Son extends Human{

    public Son(String name, Integer age, String gender) {
        super(name, age, gender);
    }
    public String showInfoSon(){
        return String.format(this.getName() + ", " + this.getAge() + " года");
    }
}
