public class Human {
    private String name;

    private Integer age;
    private String gender;

    public Human(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String showInfo() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +'\'' +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

       public Integer getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
