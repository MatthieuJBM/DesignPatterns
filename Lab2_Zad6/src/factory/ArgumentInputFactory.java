package factory;

import sources.ArgumentInput;
import sources.InputSource;

public class ArgumentInputFactory extends InputFactory {
    private final String[] args;

    public ArgumentInputFactory(String[] args) {
        this.args = args;
    }

    @Override
    public InputSource createInput() {
        return new ArgumentInput(args);
    }
}
