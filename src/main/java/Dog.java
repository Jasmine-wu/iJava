public class Dog {
    String name;
    int age;
    // 类变量，用static修饰
    static String sexClass ="这是一个类变量";
    String sex = "这是一个实例变量";
    private String privateVariable = "这是一个私有的实例变量";
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    public void  setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }

    public void eat() {
        System.out.println("这是一个局部变量");
        String str= "dog eat";
        System.out.println(str);
    }
    public void run() {
        System.out.println("dog run");
    }

    public static void main(String[] args) {
       Dog myDog = new Dog("Bob", 10);

        System.out.println(myDog.name);
        System.out.println(myDog.age);
//        myDog.setAge(20);
        myDog.age=20;
        System.out.println(myDog.age);
//        System.out.println(myDog.getAge());
        myDog.name="Bob update";
//        System.out.println(myDog.getName());
        System.out.println(myDog.name);
        myDog.run();
        myDog.eat();



    }


}
