package factory;

import sources.ConsoleInput;
import sources.InputSource;

public class ConsoleInputFactory extends InputFactory {
    @Override
    public InputSource createInput() {
        return new ConsoleInput();
    }
}
