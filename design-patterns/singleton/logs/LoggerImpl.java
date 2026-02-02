import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

import java.time.LocalDateTime;

public class LoggerImpl implements Logger{

    private static LoggerImpl instance = null;
    private PrintWriter writer;
    private String filePath;

    private LoggerImpl(){

    }

    public static LoggerImpl getInstance(){
        if(instance == null){
            synchronized(LoggerImpl.class){
                if(instance == null){
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }


    @Override
    public void log(String level, String message){

        if(writer == null){
            throw new IllegalStateException("Log file not set");
        }

        LocalDateTime timeStamp = LocalDateTime.now();
        writer.println(timeStamp +"[" +level +"]" +message);
    }

    @Override
    public void setLogFiles(String filepath){
        try{
            this.filePath = filepath;
            writer = new PrintWriter(new FileWriter(filepath, true));
        }catch (IOException e){
            System.out.println("Failed to set Log files : " +e.getMessage());
        }
    }

    @Override
    public void flush(){
        if(writer != null){
            writer.flush();
        }
    }

    @Override
    public void clear(){
        if(writer != null){
            writer.close();
            writer = null;
        }
    }
}