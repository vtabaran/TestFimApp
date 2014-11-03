package com.fim.options;

/**
 * Created with IntelliJ IDEA.
 * User: vtabaran
 * Date: 11/3/14
 * Time: 4:55 PM
 * To change this template use File | Settings | File Templates.
 */
public enum EventType {

    NewFeed("NEW_FEED"),
    Validate("VALIDATE"),
    UnknownType("");

    String type;

    EventType(String type){
        this.type = type;
    }

    public static EventType fromString(String t){
        for(EventType event: EventType.values()){
            if(event.getType().equals(t)) return event;
        }
        return UnknownType;
    }

    String getType(){
        return type;
    }


}
