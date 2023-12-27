package week5.labs.boxes;

import week5.labs.storage.Box;

public class OneThingBox extends Box {
    private boolean hasThing;

    public OneThingBox() {
        super(Double.MAX_VALUE);
        this.hasThing = false;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

    @Override
    public void add(Thing thing) {
        if (!hasThing) {
            hasThing = true;
        }
    }
}
