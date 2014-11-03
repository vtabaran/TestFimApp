package com.fim.actions;

import org.apache.commons.cli.CommandLine;

/**
 * Created with IntelliJ IDEA.
 * User: vtabaran
 * Date: 11/3/14
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValidateAction {

    CommandLine line;

    public ValidateAction(CommandLine line){
        this.line = line;
        System.out.println(this.getClass().getName());
    }
}
