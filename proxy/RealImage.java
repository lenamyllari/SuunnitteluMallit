package proxy;

public class RealImage implements Image{
	private final String filename;
	private final String imageName;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename, String imageName) {
        this.filename = filename;
        loadImageFromDisk();
        this.imageName = imageName;
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

	@Override
	public void showData() {
		System.out.println("Image name: " + imageName);
	}
}
