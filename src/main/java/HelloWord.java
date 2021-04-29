public class HelloWord {


    // java主函数,一个类里面只能有一个主函数
    public static void main(String[] args) {

        // 基本类型
        int a = 4;
        boolean isTrue = true;

        // 引用类型
        String name = "我是张三";

        System.out.println(a);
        System.out.println(isTrue);
        System.out.println(name);

        if(a > 5){
            System.out.println("a > 5");
        }else{
            System.out.println("a < 5");

        }

    }

}
