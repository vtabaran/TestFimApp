package com.fim.options;

/**
 * Created with IntelliJ IDEA.
 * User: vtabaran
 * Date: 11/3/14
 * Time: 4:41 PM
 * To change this template use File | Settings | File Templates.
 */
public enum CommandLineOption {
    EventType("eventType", "Type of event"),
    InputFilePath("inputFilePath", "inputFilePath"),
    OutputPath("outputPath", "outputPath"),
    FilePath("filePath", "filePath");


    private String name;
    private String description;

    CommandLineOption(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
}
