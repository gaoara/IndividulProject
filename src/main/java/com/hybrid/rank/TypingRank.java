package com.hybrid.rank;

public class TypingRank {
	
	private String RankName;
	private String RankScore;
	
	public TypingRank(){
		
	}
	public TypingRank(String RankName, String RankScore){
		this.RankName = RankName;
		this.RankScore = RankScore;
	}
	public String getRankName() {
		return RankName;
	}
	public void setRankName(String rankName) {
		RankName = rankName;
	}
	public String getRankScore() {
		return RankScore;
	}
	public void setRankScore(String rankScore) {
		RankScore = rankScore;
	}
}
