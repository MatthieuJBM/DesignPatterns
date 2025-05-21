import java.util.List;

public class XmlExporter implements Exporter{
    public void export(List<Student> students, String filename) {
        // Tu zapis do XML
        System.out.println("Eksport do XML: " + filename);
    }

}
