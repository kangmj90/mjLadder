package com.mj.ladder.game;

import java.io.Serializable;

public class MemberLadderId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int memberSeq;
	private int ladderSeq;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + memberSeq;
		result = prime * result + ladderSeq;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberLadderId other = (MemberLadderId) obj;
		if (memberSeq != other.memberSeq)
			return false;
		if (ladderSeq != other.ladderSeq)
			return false;
		return true;
	}
	
}
