package cn.dubby.executable.jar.random;

import java.util.Random;

/**
 * @author dubby
 * @date 2020/2/28 16:45
 */
public class DubbyRandom {

    private static String[] arrays = {"Hello, World.", "MANIFEST.MF", "jar cmf jar-file existing-manifest input-file(s)"};

    public String random() {
        return arrays[new Random().nextInt(arrays.length)];
    }

}
