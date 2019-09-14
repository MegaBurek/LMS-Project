package lms.dto;

public class EvaluationPointsDTO {
	
	private int maxPoints;
	private int pointsAchieved;
	
	public EvaluationPointsDTO() {
	}
	
	
	public EvaluationPointsDTO(int maxPoints, int pointsAchieved) {
		this.maxPoints = maxPoints;
		this.pointsAchieved = pointsAchieved;
	}


	public int getMaxPoints() {
		return maxPoints;
	}
	public void setMaxPoints(int maxPoints) {
		this.maxPoints = maxPoints;
	}
	public int getPointsAchieved() {
		return pointsAchieved;
	}
	public void setPointsAchieved(int pointsAchieved) {
		this.pointsAchieved = pointsAchieved;
	}
	
	

}
