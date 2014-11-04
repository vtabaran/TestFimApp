package com.fim.actions;

import com.fim.options.CommandLineOption;
import org.apache.commons.cli.CommandLine;

/**
 * Created with IntelliJ IDEA.
 * User: vtabaran
 * Date: 11/3/14
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValidateAction implements Action {

    CommandLine line;
    String filePath;

    public ValidateAction(CommandLine line){
        this.line = line;
        System.out.println(this.getClass().getName());
    }

    @Override
    public void process() {
        if(line!=null){
            if(line.hasOption(CommandLineOption.FilePath.getName())){
                filePath = line.getOptionValue(CommandLineOption.FilePath.getName());
            }
            else {
                System.out.println("No file path");
                return;
            }
            System.out.println("ValidateAction processed");
        }
        else{
            System.out.println("No input");
        }
    }
}
