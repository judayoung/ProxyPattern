package proxy;

public class ImageProxy implements Image {

    private ImageImpl imageImpl;
    private String fileName;
    private String clientIp;

    public ImageProxy(String fileName, String clientIp) {
        this.fileName = fileName;
        this.clientIp = clientIp;
    }

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (isBlocked(clientIp)) {
            printIsBlocked();
            return;
        }

        if (imageImpl == null) imageImpl = new ImageImpl(fileName);
        imageImpl.displayImage();
    }

    private boolean isBlocked(String ip) {
        /*
         * . 으로 나누고 싶었는데, 마침 정규식에서 . 이 모든 문자를 의미해서 ㅠㅠ
         * ArrayIndexOutOfBoundsException : Index 0 out of bounds for length 0
         * 에러가 발생했다.
         */
        String[] ipArray = ip.split("[.]");
        String firstIp = ipArray[0];
        if (firstIp.equals("127")) return false;
        else return true;
    }

    private void printIsBlocked() {
        System.out.println("해당 ip(" + clientIp + ")는 이미지를 사용할 수 없습니다.");
    }

}
