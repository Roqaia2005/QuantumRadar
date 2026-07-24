public abstract class Rule {
    protected String description;//description of the rule differ based on type
    protected double fee;


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }



    abstract Violation check(Observation observation);
}



