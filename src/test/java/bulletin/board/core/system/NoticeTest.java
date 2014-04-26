package bulletin.board.core.system;

import org.junit.Test;

public class NoticeTest {

	@Test
	public void noticeConstructionFailure() {
		
		Notice notice = new Notice(null, null, 10, 5);
		
		assertNull(notice);
	}
}
