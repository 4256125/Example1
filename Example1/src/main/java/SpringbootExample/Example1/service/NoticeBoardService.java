package SpringbootExample.Example1.service;

import org.springframework.stereotype.Service;

@Service
public class NoticeBoardService {
//
//	@Autowired
//	private RepositoryNoticeBoard mRepositoryNoticeBoard;
//
//	public NoticePost getNoticePost(Integer noticeNum) {
//
//		if (!mRepositoryNoticeBoard.exists(noticeNum)) {
//			return null;
//		}
//
//		return mRepositoryNoticeBoard.findByNoticeNum(noticeNum);
//	}
//
//	public NoticePost postNoticePost(Integer noticeNum, String noticeTitle, String noticeContent, String noticeMemId, boolean highlight) {
//		NoticePost noticePost = new NoticePost();
//
//		if (noticeNum == null) {
//			noticePost.setNoticeTitle(noticeTitle);
//			noticePost.setNoticeContent(noticeContent);
//			noticePost.setNoticeMemId(noticeMemId);
//			noticePost.setNoticePostDate(LocalDateTime.now());
//			noticePost.setNoticeEditDate(LocalDateTime.now());
//			noticePost.setHighlight(highlight);
//			// noticePost.setNoticeMemId();
//			// noticePost.setNoticeAttachedFile(noticeAttachedFile);
//		}
//
//		else {
//			noticePost = mRepositoryNoticeBoard.findOne(noticeNum);
//			noticePost.setNoticeTitle(noticeTitle);
//			noticePost.setNoticeContent(noticeContent);
//			noticePost.setNoticeEditDate(LocalDateTime.now());
//			noticePost.setHighlight(highlight);
//		}
//
//		mRepositoryNoticeBoard.save(noticePost);
//		
//		return noticePost;
//	}
//
//	public void deleteNoticePost(Integer noticeNum) {
//
//		mRepositoryNoticeBoard.delete(noticeNum);
//	}
//
////	public void patchNoticePost(Integer noticeNum, String noticeTitle, String noticeContent, boolean highlight) {
////		NoticePost noticePost = new NoticePost();
////
////		noticePost = mRepositoryNoticeBoard.findOne(noticeNum);
////
////		noticePost.setNoticeTitle(noticeTitle);
////		noticePost.setNoticeContent(noticeContent);
////		noticePost.setNoticeEditDate(LocalDateTime.now());
////		noticePost.setHighlight(highlight);
////		// noticePost.setNoticeAttachedFile(noticeAttachedFile);
////
////		mRepositoryNoticeBoard.save(noticePost);
////	}
//
//	public Page<NoticePost> searchNoticePost(Integer searchMode, String searchWord, Integer pageNum, Integer pageSize) {
//		List<NoticePost> postList = new ArrayList<NoticePost>();
//		Page<NoticePost> noticePostPage = null;
//		PageRequest pageRequest = new PageRequest(pageNum, pageSize, new Sort(Direction.DESC, "noticeNum"));
//		
//		
//		
//		switch (searchMode) {
//
//		case 0:
//			noticePostPage = mRepositoryNoticeBoard.findAll(pageRequest);
//			break;
//		// 전체검색
//		case 1:
//			noticePostPage = mRepositoryNoticeBoard.findAllByNoticeTitleLike(searchWord, pageRequest);
//			break;
//		// 제목으로 검색
//		case 2:
//			noticePostPage = mRepositoryNoticeBoard.findAllByNoticeContentLike(searchWord, pageRequest);
//			break;
//		// 내용으로 검색
//		case 3:
//			noticePostPage = mRepositoryNoticeBoard.findAllByNoticeMemIdLike(searchWord, pageRequest);
//			break;
//		// 게시자로 검색
//		case 4:
//			noticePostPage = mRepositoryNoticeBoard.findAllByHighlight(true, pageRequest);
//			break;
//		//하이라이트로 검색
//		// case 4 :
//		// noticePostPage =
//		// mRepositoryNoticeBoard.findAllByNoticePostDate(noticePostDate, pageRequest);
//		// break;
//		// 게시날짜로 검색
//		default:
//			noticePostPage = mRepositoryNoticeBoard.findAll(pageRequest);
//			break;
//		// 디폴트 전체검색
//		}
//
//		return noticePostPage;
//	}
//	
//	public int getNoticeViewNum(Integer noticeNum) {
//		NoticePost noticePost = new NoticePost();
//		
//		noticePost = mRepositoryNoticeBoard.findByNoticeNum(noticeNum);
//		
//		noticePost.setNoticeViewNum((noticePost.getNoticeViewNum() != null) ? (noticePost.getNoticeViewNum() + 1) : 1);
//		
//		mRepositoryNoticeBoard.save(noticePost);
//		
//		return noticePost.getNoticeViewNum();
//	}
//	
}
