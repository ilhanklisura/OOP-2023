package week5.labs.boxes;

import week5.labs.storage.Box;

public class MaxWeightBox extends Box {
    private double maxWeight;

    public MaxWeightBox(double maxWeight) {
        super(maxWeight);
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

    @Override
    public void add(Thing thing) {

    }
}


