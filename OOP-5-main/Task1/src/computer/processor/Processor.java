package computer.processor;

public class Processor {
    private Frequency frequency;
    private CoreCount coreCount;
    private Creator creator;
    private double weight;

    public Processor(Frequency frequency, CoreCount coreCount, Creator creator, double weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.creator = creator;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", creator=" + creator +
                ", weight=" + weight +
                '}';
    }
}
