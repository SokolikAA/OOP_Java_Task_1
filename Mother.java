public class Mother extends Human{
    public Mother(String name, Integer age, String gender) {
        super(name, age, gender);
    }
    public String showInfoMother(){
        return String.format(this.getName() + ", " + this.getAge() + " года");
    }
}
