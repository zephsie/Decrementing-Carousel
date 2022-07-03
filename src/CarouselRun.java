public class CarouselRun {
    private int position = 0;

    private final int[] elems;

    public CarouselRun(int[] elems) {
        this.elems = elems;
    }

    public int next() {
        int count = 0;

        while (count < elems.length && elems[position %= elems.length] <= 0) {
            position++;
            count++;
        }

        if (count == elems.length) return -1;

        return elems[position++]--;
    }

    public boolean isFinished() {
        for (int var: elems) {
            if (var > 0) {
                return false;
            }
        }

        return true;
    }
}
