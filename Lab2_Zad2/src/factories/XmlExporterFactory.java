package factories;

import exporters.Exporter;
import exporters.XmlExporter;

public class XmlExporterFactory implements ExporterFactory {
    public Exporter createExporter() {
        return new XmlExporter();
    }
}
