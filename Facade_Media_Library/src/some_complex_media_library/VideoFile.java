package some_complex_media_library;

/**
 * These are some of the classes of a compex 3rd-party video conversion framework.
 * We don't control that code, therefore can't simplify it.
**/
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
