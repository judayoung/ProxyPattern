package proxy;

public class ImageImpl implements Image {

    private String fileName;


    public ImageImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying : " + fileName);
    }
}
