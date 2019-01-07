/**
 * 〈一句话功能简述〉<br>
 * 〈外部类Outer〉
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class Outer {
    /**
     * 外部类私有属性
     */
    private int a = 99;
    private int b=10;

    /**
     * 内部类Inner
     */
    public class Inner {
        /**
         * 内部类的成员属性
         */
        int b = 2;

        public void test() {
            System.out.println("访问外部类中的a：" + a);
            System.out.println("访问内部类中的b：" + b);
            System.out.println("使用this访问内部类中的b："+this.b);
            System.out.println("访问外部类中的b："+Outer.this.b);
        }
    }

    public static void main(String[] args) {
        //创建外部类对象
        Outer outer = new Outer();
        //通过outer对象来创建内部类Inner
        Inner inner = outer.new Inner();
        //调用内部类中的test方法
        inner.test();
    }

    public void testInner() {
        Inner inner = new Inner();
        System.out.println(inner.b);
        inner.test();
    }

}
