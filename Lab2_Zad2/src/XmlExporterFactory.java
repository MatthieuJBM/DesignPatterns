public class XmlExporterFactory implements ExporterFactory {
    public Exporter createExporter() {
        return new XmlExporter();
    }
}
