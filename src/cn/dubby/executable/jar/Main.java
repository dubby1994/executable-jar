package cn.dubby.executable.jar;

import cn.dubby.executable.jar.random.DubbyRandom;

/**
 * @author dubby
 * @date 2020/2/28 16:25
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World.");

        for (int i = 0; i < 10; ++i) {
            System.out.println(new DubbyRandom().random());
        }
    }

}
