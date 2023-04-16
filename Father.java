public class Father extends Human{

    public Father(String name, Integer age, String gender) {
        super(name, age, gender);
    }
    public String showInfoFather(){
        return String.format(this.getName() + ", " + this.getAge() + " года");
    }
}
