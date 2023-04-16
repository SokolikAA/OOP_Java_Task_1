public class SonSon extends Human{
    public SonSon(String name, Integer age, String gender) {
        super(name, age, gender);
    }
    public String showInfoSonSon(){
        return String.format(this.getName() + ", " + this.getAge() + " года");
    }
}
