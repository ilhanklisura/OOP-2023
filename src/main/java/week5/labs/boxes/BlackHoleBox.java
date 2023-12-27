package week5.labs.boxes;

import week5.labs.storage.Box;

public class BlackHoleBox extends Box {
    public BlackHoleBox() {
        super(Double.MAX_VALUE);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

    @Override
    public void add(Thing thing) {

    }
}
