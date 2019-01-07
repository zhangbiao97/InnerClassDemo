/**
 * 〈一句话功能简述〉<br>
 * 〈外部类〉
 *
 * @author Administrator
 * @create 2019/1/7
 */
public class MethodOuter {
    /**
     * 外部类中的方法
     */
    public void show(){
        /**
         * 常量
         */
        final int a=25;
        /**
         * 变量
         */
        int b=10;
        /**
         * 方法内部类
         */
        class MethodInner{
            /**
             * 方法内部类中的属性
             */
            int c=20;

            /**
             * 方法内部类中的方法
             */
            public void print(){
                System.out.println("访问外部类中的方法中的常量a："+a);
                System.out.println("访问内部类中的属性c："+c);
            }
        }
        /**
         * 创建方法内部类的对象
         */
        MethodInner methodInner=new MethodInner();
        /**
         * 调用方法内部类中的print方法
         */
        methodInner.print();
    }

    public static void main(String[] args) {
        MethodOuter methodOuter=new MethodOuter();
        methodOuter.show();
    }
}
