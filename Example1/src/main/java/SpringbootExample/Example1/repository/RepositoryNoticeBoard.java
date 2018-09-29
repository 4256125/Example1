package SpringbootExample.Example1.repository;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringbootExample.Example1.model.entity.NoticePost;

@Repository
public interface RepositoryNoticeBoard extends JpaRepository<NoticePost, Integer> {

	NoticePost findByNoticeNum(Integer noticeNum);
	
	Page<NoticePost> findAll(Pageable pageable);
	
	Page<NoticePost> findAllByNoticeTitleLike(String noticeTitle, Pageable pageable);
	
	Page<NoticePost> findAllByNoticeContentLike(String noticeContent, Pageable pageable);
	
	Page<NoticePost> findAllByNoticeMemIdLike(String noticeMemId, Pageable pageable);

	Page<NoticePost> findAllByNoticePostDate(LocalDateTime noticePostDate, Pageable pageable);
	
	Page<NoticePost> findAllByHighlight(boolean highlight, Pageable pageable);
}
