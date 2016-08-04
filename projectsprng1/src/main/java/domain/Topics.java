package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "topics",schema="sruthisql")
public class Topics {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int TId;
	private int CId;
	private String TopicName;
	private String TopicDuration;
    @ManyToOne
    @JoinColumn(name="CId")
	public int getTId() {
		return TId;
	}

	public void setTId(int tId) {
		TId = tId;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getTopicName() {
		return TopicName;
	}

	public void setTopicName(String topicName) {
		TopicName = topicName;
	}

	public String getTopicDuration() {
		return TopicDuration;
	}

	public void setTopicDuration(String topicDuration) {
		TopicDuration = topicDuration;
	}

}
