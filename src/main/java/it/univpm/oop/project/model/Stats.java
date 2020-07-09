package it.univpm.oop.project.model;
/**
 * Model Stats
 * @author Andrea
 *
 */
public class Stats {

	private int mediaComments;
	private int hashtagComments;
	private int commentsLength;
	private double averageCommentsLength;
	private int minCommentsLength;
	private int maxCommentsLength;
	private boolean hasEmoticon;
	
	public Stats(int mediaComments, int hashtagComments, int commentsLength, double averageCommentsLength,
			int minCommentsLength, int maxCommentsLength, boolean hasEmoticon) {
		super();
		this.mediaComments = mediaComments;
		this.hashtagComments = hashtagComments;
		this.commentsLength = commentsLength;
		this.averageCommentsLength = averageCommentsLength;
		this.minCommentsLength = minCommentsLength;
		this.maxCommentsLength = maxCommentsLength;
		this.hasEmoticon = hasEmoticon;
	}

	public int getMediaComments() {
		return mediaComments;
	}

	public int getHashtagComments() {
		return hashtagComments;
	}

	public int getCommentsLength() {
		return commentsLength;
	}

	public double getAverageCommentsLength() {
		return averageCommentsLength;
	}

	public int getMinCommentsLength() {
		return minCommentsLength;
	}

	public int getMaxCommentsLength() {
		return maxCommentsLength;
	}

	public boolean isHasEmoticon() {
		return hasEmoticon;
	}

	@Override
	public String toString() {
		return "Stats [mediaComments=" + mediaComments + ", hashtagComments=" + hashtagComments + ", commentsLength="
				+ commentsLength + ", averageCommentsLength=" + averageCommentsLength + ", minCommentsLength="
				+ minCommentsLength + ", maxCommentsLength=" + maxCommentsLength + ", hasEmoticon=" + hasEmoticon + "]";
	}

	
	
	
}
