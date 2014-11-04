package com.fim.actions;

import com.fim.options.CommandLineOption;
import org.apache.commons.cli.*;

/**
 * Created with IntelliJ IDEA.
 * User: vtabaran
 * Date: 11/3/14
 * Time: 3:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class FeedNotificationAction implements Action {

    private CommandLine line;
    private String inputFilePath, outputPath;

    public FeedNotificationAction(CommandLine line){
        this.line = line;
        System.out.println(this.getClass().getName());
    }

    @Override
    public void process(){
        if(line!=null){
            if(line.hasOption(CommandLineOption.InputFilePath.getName())){
                inputFilePath = line.getOptionValue(CommandLineOption.InputFilePath.getName());
            }
            else {
                System.out.println("No input file path");
                return;
            }
            if(line.hasOption(CommandLineOption.OutputPath.getName())){
                outputPath = line.getOptionValue(CommandLineOption.OutputPath.getName());
            }
            else {
                System.out.println("No output path");
                return;
            }
            System.out.println("FeedAction processed");
        }
        else{
            System.out.println("No input");
        }
    }
}
