public class SonWife extends Human{
    public SonWife(String name, Integer age, String gender) {
        super(name, age, gender);
    }
    public String showInfoSonWife(){
        return String.format(this.getName() + ", " + this.getAge() + " года");
    }
}
