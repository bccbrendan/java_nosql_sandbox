package com.balong;

import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        MongoClient mongoClient = null;
        try
        {
            mongoClient = new MongoClient();
            System.out.println( "Create a MongoClient" );
        }
        catch (java.net.UnknownHostException e)
        {
            System.out.println( "Can't connect to host - UnknownHostException" );
        }
        mongoClient.close();
        System.out.println( "closed mongoClient" );
    }
}
