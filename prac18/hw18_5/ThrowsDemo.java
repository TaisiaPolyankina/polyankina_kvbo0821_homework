package polyankina_kvbo0821.prac18.hw18_5;

public class ThrowsDemo {
    public void getDetails(String key) {

        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("An exception has occurred. Your Dreamcast will be destroyed...");
        }

    }
}
