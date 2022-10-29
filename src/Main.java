import proxy.Image;
import proxy.ImageProxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Let's see how Proxy works!\n");

        System.out.println("1. Virtual Proxy");
        // 진행중 : 추후
        System.out.println();

        System.out.println("2. Remote Proxy");
        // 진행중 : 추후
        System.out.println();

        System.out.println("3. Protection Proxy");
        String clientIp = "101.109.4.56";
        String localhostIp = "127.0.0.1";
        Image image3 = new ImageProxy("image3.png", clientIp);
        image3.displayImage();
        Image image4 = new ImageProxy("image3.png", localhostIp);
        image4.displayImage();
    }
}