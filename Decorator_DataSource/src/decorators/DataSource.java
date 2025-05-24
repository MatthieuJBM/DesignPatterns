package decorators;

// The component interface defines operations taht can be altered by decorators.
public interface DataSource {
    void writeData(String data);

    String readData();
}
