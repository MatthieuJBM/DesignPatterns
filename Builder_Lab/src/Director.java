public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Plan getPlan() {
        return builder.getPlan();
    }

    public void ukladaj() {
        builder.newPlan();
        builder.proponujPrzedmiot1();
        builder.proponujPrzedmiot2();
        builder.proponujPrzedmiot3();
    }

}


