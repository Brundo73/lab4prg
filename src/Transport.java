public abstract class Transport {
    public final SpeedDegree speedDegree;

    protected Transport(SpeedDegree speedDegree) {
        this.speedDegree = speedDegree;
    }
    public abstract void transport(String[] pass);
}
