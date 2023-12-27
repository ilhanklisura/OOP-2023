package week5.labs.storage;

import week5.labs.boxes.Thing;

public abstract class Box {
    private double maxWeight;
    private double currentWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void add(ToBeStored item) {
        if (this.currentWeight + item.weight() <= this.maxWeight) {
            this.currentWeight += item.weight();
        }
    }

    @Override
    public String toString() {
        return "Box with a weight of: " + currentWeight + " kg";
    }

    public abstract boolean isInTheBox(Thing thing);

    public abstract void add(Thing thing);
}
