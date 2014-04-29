package bulletin.board.core.facade;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.extern.java.Log;
import bulletin.board.core.system.Notice;

@Log
public class Board {

	@Getter
	private List<Notice> noticeList = new ArrayList<Notice>();
	
	public Integer getNoticeCount() {
		
		return noticeList.size();
	}

	public void addNotice(Notice notice) {
		
		noticeList.add(notice);
		
		log.info(noticeList.toString());
	}

		
	
}
