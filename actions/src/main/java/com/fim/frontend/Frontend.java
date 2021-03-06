package com.fim.frontend;


import com.fim.actions.Action;
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
        Action action;
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
                        action = new FeedNotificationAction(line);
                        action.process();
                        break;
                    case Validate:
                        action = new ValidateAction(line);
                        action.process();
                        break;
                    default:
                        System.out.println("Unknown Action");
                        break;
                }
            }
            else{
                System.out.println("EventType option missed");
            }
        } catch (ParseException e) {
            System.out.println("Invalid Input");
            e.printStackTrace();
        }


    }
}
