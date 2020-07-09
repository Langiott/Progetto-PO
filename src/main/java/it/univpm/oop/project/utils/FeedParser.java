package it.univpm.oop.project.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vdurmont.emoji.EmojiManager;

import it.univpm.oop.project.model.Attachment;
import it.univpm.oop.project.model.Comment;
import it.univpm.oop.project.model.Feed;
import it.univpm.oop.project.model.Media;
import it.univpm.oop.project.model.Post;
import it.univpm.oop.project.model.Stats;

public class FeedParser {
//dato un feed mi da stats
	

	public static Stats getStats(Feed feed) {
		
		boolean hasEmoticon = false;
		int hashtagComments = 0 ;
		int mediaComments = 0;
		int commentsLength = 0;
		int sumCommentsLength = 0;
		int numberComments = 0;
		int minCommentsLength = 2147483647;
		int maxCommentsLength = 0;
		
		double averageCommentsLength = 0.0;
		
		for (int i=0; i<feed.getData().size(); i++) {
			Post post = feed.getData().get(i);
			for (int j=0; j<post.getData().size(); j++) {
				Comment comment = post.getData().get(j);
				String message = comment.getMessage();
				numberComments++;
				sumCommentsLength += message.length();
				if(message.length()>maxCommentsLength) maxCommentsLength= message.length();
				if(message.length()<minCommentsLength) minCommentsLength= message.length();
				
				//hashtag
				Pattern patt = Pattern.compile("(#\\w+)\\b");
	            Matcher match = patt.matcher(message);
	            if(match.find()) {
	                 hashtagComments++;  
	                 }
	            
	            //emoticon
	            if(EmojiManager.containsEmoji(message)) hasEmoticon = true;
	            
	            //media
	            Attachment attach= comment.getAttachment();
	            Media media = attach.getMedia();
	            if(!media.equals(null)) mediaComments++;
	            
	            
			}
			
		}
		averageCommentsLength = sumCommentsLength / numberComments;
		
		return new Stats( mediaComments,  hashtagComments,  commentsLength,  averageCommentsLength,
				 minCommentsLength,  maxCommentsLength,  hasEmoticon);
		 
	
	}
	
	
	
}
