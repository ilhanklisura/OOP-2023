package week5.lectures.person;

public class WeightWatchersAssociation {
    private double lowestWeightIndex;

    public WeightWatchersAssociation(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
    }

    public boolean isAcceptedAsMember(Person person) {
        if (person.weightIndex() < this.lowestWeightIndex) {
            return false;
        }
        return true;
    }
}

