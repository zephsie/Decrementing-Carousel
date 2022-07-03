public class DecrementingCarousel {
    private final int[] elems;

    private int num = 0;

    private boolean lock = false;

    public DecrementingCarousel(int capacity) {
        elems = new int[capacity];
    }

    public boolean addElement(int element){
        if (num < elems.length && element > 0 && !lock) {
            elems[num++] = element;
            return true;
        }

        return false;
    }

    public CarouselRun run(){
        if (!lock) {
            lock = true;
            return new CarouselRun(elems);
        } else return null;
    }
}
