package com.fim.frontend;


import com.fim.actions.FeedNotificationAction;
import com.fim.actions.ValidateAction;
import com.fim.options.CommandLineOption;
import com.fim.options.EventType;
import org.apache.commons.cli.*;

/**
 * Created with IntelliJ IDEA.
 * User: vtabaran
 * Date: 11/3/14
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */



public class Frontend {

    public static void main(String[] args){
        Options options = new Options();
        for(CommandLineOption option: CommandLineOption.values()){
            options.addOption(new Option(option.getName(), true, option.getDescription()));
        }
        CommandLineParser parser = new PosixParser();
        try {
            CommandLine line = parser.parse( options, args );
            if(line.hasOption(CommandLineOption.EventType.getName())){
                String event = line.getOptionValue(CommandLineOption.EventType.getName());
                switch (EventType.fromString(event))  {
                    case NewFeed:
                        new FeedNotificationAction(line);
                        break;
                    case Validate:
                        new ValidateAction(line);
                        break;
                    default:
                        System.out.println("Unknown Action");
                }
            }
        } catch (ParseException e) {
            System.out.println("Invalid Input");
            e.printStackTrace();
        }


    }
}
