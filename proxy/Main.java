package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Image> imageList = new ArrayList<>();
		imageList.add(new ProxyImage("HiRes_10MB_Photo1", "dinasaurus"));
		imageList.add(new ProxyImage("HiRes_10MB_Photo2", "lion"));
		imageList.add(new ProxyImage("HiRes_10MB_Photo3", "tiger"));
		imageList.add(new ProxyImage("HiRes_10MB_Photo4", "elephant"));
		
		System.out.println("Show data");
        for (Image image : imageList) {
			image.showData();
		}

        System.out.println("\nLoad & display images");
        for (Image image : imageList) {
			image.displayImage();
		}
	}
}
