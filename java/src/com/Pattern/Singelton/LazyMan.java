package com.Pattern.Singelton;

import javax.swing.text.LabelView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//懒汉式
public class LazyMan {
    private volatile static LazyMan lazyMan;
    //设置一个私有的标志
    private static boolean code = false;
    private LazyMan(){
        //解决反射破坏单例模式,1.加锁，但是如果不使用构造器，都直接使用反射，还是会出现问题
       /* synchronized (LazyMan.class){
            if (lazyMan!=null){
                throw  new RuntimeException("不要试图使用反射破坏异常");
            }
        }*/
        //解决反射破坏单例模式,1.设置一个私有的标志,但是通过反射可以拿到这个变量，使这个变量私有化后，又不行了
        synchronized (LazyMan.class) {
            if (code == false) {
                code = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }

        System.out.println(Thread.currentThread().getName()+"   ok");
    }


    public static LazyMan getInstance() {
        //加锁，并两次检测
        if (lazyMan==null){
            synchronized (LazyMan.class){
                if (lazyMan==null) {
                    lazyMan = new LazyMan();//不是原子性操作
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象指向这个空间
                     *
                     *
                     * 有可能被虚拟机进行指令重排---加volatile
                     *
                     */
                }
            }

        }

            return lazyMan;
    }
    //单线程下----可以，并发下没有锁不ok


    public static void main(String[] args) throws Exception {
        /*for (int i=0;i<10;i++){
            new Thread(()->{
                lazyMan.getInstance();
            }).start();
        }*/

        //遇到反射

        //LazyMan lazyMan = LazyMan.getInstance();
        Constructor<LazyMan> declaredConstructor=LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        //拿到变量
        Field code = LazyMan.class.getDeclaredField("code");
        code.setAccessible(true);

        LazyMan lazyMan = declaredConstructor.newInstance();
        code.set(lazyMan,false);
        LazyMan lazyMan2 = declaredConstructor.newInstance();
        System.out.println(lazyMan2);
        System.out.println(lazyMan);
    }

}
