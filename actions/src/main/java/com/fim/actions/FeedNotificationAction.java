package com.fim.actions;

import org.apache.commons.cli.*;

/**
 * Created with IntelliJ IDEA.
 * User: vtabaran
 * Date: 11/3/14
 * Time: 3:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class FeedNotificationAction {

    CommandLine line;

    public FeedNotificationAction(CommandLine line){
        this.line = line;
        System.out.println(this.getClass().getName());
    }
}
