package it.univpm.oop.project.utils;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.json.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.univpm.oop.project.model.*;


public class JSONParser {


	public JSONParser() {
	ObjectMapper objectMapper = new ObjectMapper() ; 

    try {
        Feed feed = objectMapper.readValue(new File("JSONFile.json"), Feed.class);
        //bisogna creare il file json

        printParsedObject(feed);
    } catch (IOException e) {
       e.printStackTrace();
    }
	}
	
    private static void printParsedObject(Feed feed) {
        printData(feed.getData());
    }

    
    private static void printData(List<Post> data) {
        System.out.println("Page Posts:");
        for(Post post : data) {
        	System.out.println("**********");
            printPost(post);
        }
    }

    private static void printPost(Post post) {
        System.out.println("\n\tPost Id                   : " + post.getId());
        printComment(post.getData());
        
    }
    
    private static void printComment(List<Comment> data) {
    	System.out.println("\nComments:");
    	System.out.println("**********");
    	for(Comment comment: data) {
    		 System.out.println("\tComment Id                : " + comment.getId());
    		 System.out.println("\tMessage                   : " + comment.getMessage());
    		 System.out.println("\tAttachment                   : " + comment.getAttachment().toString());
    		 System.out.println("\n");
    	}
    
   
}
}
