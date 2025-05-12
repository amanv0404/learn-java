

package multithreading.assignment4;

import java.util.concurrent.Callable;

public class ImageProcessor implements Callable<String> {
    private final int imageId;

    public ImageProcessor(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public String call() throws Exception{
        Thread.sleep(100); // processing delay
        return "Image "+imageId+" processed";
    }


}
