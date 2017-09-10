package com.learningapp.trivia.model;

import java.util.Date;

/**
 * Represents a trivia question. This class is immutable and should be created by
 * the builder {@link TriviaQuestionBuilder}.
 * 
 * @author 
 */
public class TriviaQuestion {

	final private long id;
    final private String question;
    final private String answerA;
    final private String answerB;
    final private String answerC;
    final private String answerD;
    final private String correctAnswer;
    final private String hint;
    final private Date lastUpdated;
    
    /**
     * Constructor. Intentionally package scope. This class should be created by
     * the builder {@link TriviaQuestionBuilder}.
     * 
     * @param id
     * @param question
     * @param answerA
     * @param answerB
     * @param answerC
     * @param answerD
     * @param correctAnswer
     * @param hint 
     */
	public TriviaQuestion(long id, String question, String answerA, String answerB, String answerC, String answerD,
			String correctAnswer, String hint, Date lastUpdated) {
		super();
		this.id = id;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.correctAnswer = correctAnswer;
		this.hint = hint;
		this.lastUpdated = lastUpdated;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @return the answerA
	 */
	public String getAnswerA() {
		return answerA;
	}

	/**
	 * @return the answerB
	 */
	public String getAnswerB() {
		return answerB;
	}

	/**
	 * @return the answerC
	 */
	public String getAnswerC() {
		return answerC;
	}

	/**
	 * @return the answerD
	 */
	public String getAnswerD() {
		return answerD;
	}

	/**
	 * @return the correctAnswer
	 */
	public String getCorrectAnswer() {
		return correctAnswer;
	}

	/**
	 * @return the hint
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * @return the lastUpdated
	 */
	public Date getLastUpdated() {
		return lastUpdated;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answerA == null) ? 0 : answerA.hashCode());
		result = prime * result + ((answerB == null) ? 0 : answerB.hashCode());
		result = prime * result + ((answerC == null) ? 0 : answerC.hashCode());
		result = prime * result + ((answerD == null) ? 0 : answerD.hashCode());
		result = prime * result + ((correctAnswer == null) ? 0 : correctAnswer.hashCode());
		result = prime * result + ((hint == null) ? 0 : hint.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lastUpdated == null) ? 0 : lastUpdated.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TriviaQuestion other = (TriviaQuestion) obj;
		if (answerA == null) {
			if (other.answerA != null)
				return false;
		} else if (!answerA.equals(other.answerA))
			return false;
		if (answerB == null) {
			if (other.answerB != null)
				return false;
		} else if (!answerB.equals(other.answerB))
			return false;
		if (answerC == null) {
			if (other.answerC != null)
				return false;
		} else if (!answerC.equals(other.answerC))
			return false;
		if (answerD == null) {
			if (other.answerD != null)
				return false;
		} else if (!answerD.equals(other.answerD))
			return false;
		if (correctAnswer == null) {
			if (other.correctAnswer != null)
				return false;
		} else if (!correctAnswer.equals(other.correctAnswer))
			return false;
		if (hint == null) {
			if (other.hint != null)
				return false;
		} else if (!hint.equals(other.hint))
			return false;
		if (id != other.id)
			return false;
		if (lastUpdated == null) {
			if (other.lastUpdated != null)
				return false;
		} else if (!lastUpdated.equals(other.lastUpdated))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}
    
    
	
	
}
