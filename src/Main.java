import proxy.Image;
import proxy.ImageProxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Let's see how Proxy works!\n");

        Image image3 = new ImageProxy("image3.png");
        image3.displayImage();

//        System.out.println("1. Virtual Proxy");
//        System.out.println("2. Remote Proxy");
//        System.out.println("3. Protection Proxy");
    }
}