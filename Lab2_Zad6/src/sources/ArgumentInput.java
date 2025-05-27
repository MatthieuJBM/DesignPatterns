package sources;

public class ArgumentInput implements InputSource {
    private final String[] args;

    public ArgumentInput(String[] args) {
        this.args = args;
    }

    public String getText() {
        return String.join(" ", args);
    }
}
