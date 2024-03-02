public enum SpeedDegree {
    FAST(" быстро "),
    MIDDLE(" с трудом "),
    SLOW(" медленно ");
    private String description;
    SpeedDegree(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
}
