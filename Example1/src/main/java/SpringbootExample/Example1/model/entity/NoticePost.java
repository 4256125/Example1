package SpringbootExample.Example1.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "NOTICE_POST")
public class NoticePost {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NOTICE_NUM")
	private Integer noticeNum;
	
	@Column(name = "NOTICE_TITLE")
	private String noticeTitle;
	
	@Column(name = "NOTICE_CONTENT")
	private String noticeContent;
	
	@Column(name = "NOTICE_POST_DATE")
	private LocalDateTime noticePostDate;
	
	@Column(name = "NOTICE_EDIT_DATE")
	private LocalDateTime noticeEditDate;
	
	@Column(name = "NOTICE_VIEW_NUM")
	private Integer noticeViewNum;
	
	@Column(name = "NOTICE_MEM_ID")
	private String noticeMemId;
	
	@Column(name = "NOTICE_ATTACHED_FILE")
	private String noticeAttachedFile;

	@Column(name = "HIGHLIGHT")
	private boolean highlight;
}
