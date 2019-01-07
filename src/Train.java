/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class Train {

    public void print(final String name){
        new Person() {
            {

            }
            @Override
            public void eat() {
                System.out.println(name);
            }
        }.eat();
    }

    public static void main(String[] args) {
        Train train=new Train();
        train.print("哈哈");
    }

}
