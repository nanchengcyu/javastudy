package cn.nanchengyu.interface_;

/**
 * ClassName: American
 * Package: cn.nanchengyu.interface_
 * Description:
 *
 * @Author 南城余
 * @Create 2023/11/5 17:58
 * @Version 1.0
 */
public class American implements Eatable {

    @Override
    public void eat() {
        System.out.println("美国人用刀叉吃饭");
    }
}
