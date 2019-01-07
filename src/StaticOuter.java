/**
 * 〈一句话功能简述〉<br>
 * 〈外部类〉
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class StaticOuter {
    /**
     * 外部类中的私有属性
     */
    private int a = 10;
    /**
     * 外部类中的静态属性
     */
    static int b = 20;

    /**
     * 静态内部类
     */
    public static class StaticInner {
        /**
         * 内部类中的属性
         */
        int b = 30;

        public void test() {
            System.out.println("访问外部类的b：" + StaticOuter.b);
            System.out.println("访问内部类的b：" + b);
        }
    }

    public static void main(String[] args) {
        /**
         * 创建静态内部类对象
         */
        StaticInner staticInner = new StaticInner();
        /**
         * 调用静态内部类中的test方法
         */
        staticInner.test();
    }

}
