public class JsonExporterFactory implements ExporterFactory {
    public Exporter createExporter() {
        return new JsonExporter();
    }
}
