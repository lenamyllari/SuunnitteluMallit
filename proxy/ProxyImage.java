package proxy;

public class ProxyImage implements Image{
	private final String filename;
	private final String imageName;
    private RealImage image;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename, String imageName) {
        this.filename = filename;
        this.imageName = imageName;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename, imageName);
        }
        image.displayImage();
    }

	@Override
	public void showData() {
		System.out.println("Image name: " + imageName);		
	}
}
