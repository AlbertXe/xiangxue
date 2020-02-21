package ch2_concurrent;

/**
 * 懒汉 双重检查
 * 86150
 * SingleDcl
 * 2020/2/21 12:34
 */
public class SingleDcl {
    static SingleDcl singleDcl;

    public SingleDcl() {
    }

    public SingleDcl getInstance() {
        if (singleDcl == null) {
            synchronized (SingleDcl.class) {
                if (singleDcl == null) {
                    singleDcl = new SingleDcl();
                }
            }
        }
        return singleDcl;
    }
}
