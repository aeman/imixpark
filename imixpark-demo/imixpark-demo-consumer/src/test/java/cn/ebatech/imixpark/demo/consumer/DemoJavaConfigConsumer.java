package cn.ebatech.imixpark.demo.consumer;


public class DemoJavaConfigConsumer {
    public static void main(String[] args) {
        // add `javaconfig` to args
        String[] customArgs = new String[]{"javaconfig"};
        com.alibaba.dubbo.container.Main.main(customArgs);
    }
}
