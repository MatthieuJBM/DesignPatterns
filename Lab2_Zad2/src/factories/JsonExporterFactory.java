package factories;

import exporters.Exporter;
import exporters.JsonExporter;

public class JsonExporterFactory implements ExporterFactory {
    public Exporter createExporter() {
        return new JsonExporter();
    }
}
