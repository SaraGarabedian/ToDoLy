public enum TaskStatus {
    TODO("To do."), DONE("Done.");
    private String name;
    private TaskStatus(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
