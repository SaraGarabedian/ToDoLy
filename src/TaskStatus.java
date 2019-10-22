public enum TaskStatus {
    TODO("To do."), DONE("Done.");
    private String name;

    TaskStatus(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static TaskStatus getValueFromString(String status) throws Exception{
       switch (status){
           case "To do.":
               return TODO;
           case "Done.":
               return DONE;
           default: throw new Exception("Not a status");
       }
    }
}
