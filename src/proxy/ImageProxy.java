package proxy;

public class ImageProxy implements Image{

    private ImageImpl imageImpl;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if(imageImpl == null) imageImpl = new ImageImpl(fileName);
        imageImpl.displayImage();
    }

}
