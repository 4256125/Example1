package SpringbootExample.Example1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noticeBoard")
public class ControllerNoticeBoard {
//
//	@Autowired
//	private NoticeBoardService mNoticeBoardService;
//
//	@GetMapping("/getNoticePost")
//	public NoticePost getNoticePost(
//			@RequestParam(value = "noticeNum", required = true) Integer noticeNum) {
//
//        return mNoticeBoardService.getNoticePost(noticeNum);
//	}
//	//게시글 조회 기능
//	
//	@PostMapping("/postNoticePost")
//	public NoticePost postNoticePost (@RequestBody NoticePost noticePost) {
//
//		return mNoticeBoardService.postNoticePost(noticePost.getNoticeNum(), noticePost.getNoticeTitle(), noticePost.getNoticeContent(), noticePost.getNoticeMemId(), noticePost.isHighlight());
//	}
//	//게시글 작성기능
//
//	@DeleteMapping("/deleteNoticePost")
//	public boolean deleteNoticePost(
//			@RequestParam(value = "noticeNum", required = true) Integer noticeNum) {
//
//		mNoticeBoardService.deleteNoticePost(noticeNum);
//		
//		return true;
//	}
//	//게시글 삭제기능
//
//	@PostMapping("/patchNoticePost")
//	public NoticePost patchNoticePost (@RequestBody NoticePost noticePost) {
//
//		
//		return mNoticeBoardService.postNoticePost(noticePost.getNoticeNum(), noticePost.getNoticeTitle(), noticePost.getNoticeContent(), noticePost.getNoticeMemId(), noticePost.isHighlight());
//		
//	}
//	//게시글 수정기능
//	
//	@GetMapping("/searchNoticePost")
//	public Page<NoticePost> searchNoticePost(
//			@RequestParam(value = "searchMode", required = false) Integer searchMode,
//			@RequestParam(value = "searchWord", required = false) String searchWord,
//			@RequestParam(value = "pageNum", required = false) Integer pageNum,
//			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
//		
//		return mNoticeBoardService.searchNoticePost(searchMode, searchWord, pageNum, pageSize);
//	}
//	//게시글 검색기능 / 게시글 검색하여 Page형태로 전달
//	
//	@GetMapping("/getNoticeViewNum")
//	public int getNoticeViewNum(
//			@RequestParam(value = "noticeNum", required = true) Integer noticeNum) {
//
//        return mNoticeBoardService.getNoticeViewNum(noticeNum);
//	}
//	//게시글 조회수 조회 기능
//	
}
