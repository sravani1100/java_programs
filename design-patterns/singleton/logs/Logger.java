
public interface Logger{

    void log(String level, String message);
    void setLogFiles(String filepath);
    void flush();
    void clear();

}