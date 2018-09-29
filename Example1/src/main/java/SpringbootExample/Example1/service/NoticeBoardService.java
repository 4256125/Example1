package SpringbootExample.Example1.service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import SpringbootExample.Example1.model.entity.NoticePost;
import SpringbootExample.Example1.repository.RepositoryNoticeBoard;
import antlr.collections.List;



@Service
public class NoticeBoardService {

	@Autowired
	private RepositoryNoticeBoard mRepositoryNoticeBoard;

	public NoticePost getNoticePost(Integer noticeNum) {

		if (!mRepositoryNoticeBoard.existsById(noticeNum)) {
			return null;
		}

		return mRepositoryNoticeBoard.findByNoticeNum(noticeNum);
	}

	public NoticePost postNoticePost(Integer noticeNum, String noticeTitle, String noticeContent, String noticeMemId, boolean highlight) {
		NoticePost noticePost = new NoticePost();

		if (noticeNum == null) {
			noticePost.setNoticeTitle(noticeTitle);
			noticePost.setNoticeContent(noticeContent);
			noticePost.setNoticeMemId(noticeMemId);
			noticePost.setNoticePostDate(LocalDateTime.now());
			noticePost.setNoticeEditDate(LocalDateTime.now());
			noticePost.setHighlight(highlight);
			// noticePost.setNoticeMemId();
			// noticePost.setNoticeAttachedFile(noticeAttachedFile);
		}

		else {
			noticePost = mRepositoryNoticeBoard.findByNoticeNum(noticeNum);
			noticePost.setNoticeTitle(noticeTitle);
			noticePost.setNoticeContent(noticeContent);
			noticePost.setNoticeEditDate(LocalDateTime.now());
			noticePost.setHighlight(highlight);
		}

		mRepositoryNoticeBoard.save(noticePost);
		
		return noticePost;
	}

	public void deleteNoticePost(Integer noticeNum) {

		mRepositoryNoticeBoard.deleteById(noticeNum);
	}


	public Page<NoticePost> searchNoticePost(Integer searchMode, String searchWord, Integer pageNum, Integer pageSize) {
		ArrayList<NoticePost> postList = new ArrayList<NoticePost>();
		Page<NoticePost> noticePostPage = null;
		PageRequest pageRequest = PageRequest.of(pageNum, pageSize, new Sort(Direction.DESC, "noticeNum"));
		
		
		
		switch (searchMode) {

		case 0:
			noticePostPage = mRepositoryNoticeBoard.findAll(pageRequest);
			break;
		// 전체검색
		case 1:
			noticePostPage = mRepositoryNoticeBoard.findAllByNoticeTitleLike(searchWord, pageRequest);
			break;
		// 제목으로 검색
		case 2:
			noticePostPage = mRepositoryNoticeBoard.findAllByNoticeContentLike(searchWord, pageRequest);
			break;
		// 내용으로 검색
		case 3:
			noticePostPage = mRepositoryNoticeBoard.findAllByNoticeMemIdLike(searchWord, pageRequest);
			break;
		// 게시자로 검색
		case 4:
			noticePostPage = mRepositoryNoticeBoard.findAllByHighlight(true, pageRequest);
			break;
		//하이라이트로 검색
		// case 4 :
		// noticePostPage =
		// mRepositoryNoticeBoard.findAllByNoticePostDate(noticePostDate, pageRequest);
		// break;
		// 게시날짜로 검색
		default:
			noticePostPage = mRepositoryNoticeBoard.findAll(pageRequest);
			break;
		// 디폴트 전체검색
		}

		return noticePostPage;
	}
	
	public int getNoticeViewNum(Integer noticeNum) {
		NoticePost noticePost = new NoticePost();
		
		noticePost = mRepositoryNoticeBoard.findByNoticeNum(noticeNum);
		
		noticePost.setNoticeViewNum((noticePost.getNoticeViewNum() != null) ? (noticePost.getNoticeViewNum() + 1) : 1);
		
		mRepositoryNoticeBoard.save(noticePost);
		
		return noticePost.getNoticeViewNum();
	}
	
}
