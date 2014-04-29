package bulletin.board.core.facade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bulletin.board.core.system.DummyItem;
import bulletin.board.core.system.DummyUser;
import bulletin.board.core.system.Notice;
import bulletin.board.core.system.NoticeType;

public class BoardTest {

	@Test
	public void constructBoard() {
		
		Board board = new Board();
		
		assertEquals(new Integer(0), board.getNoticeCount());
	}
	
	@Test
	public void addANotice() {
		
		Board board = new Board();
		
		board.addNotice(new Notice(NoticeType.SUPPLY, new DummyUser(), new DummyItem(), 10, 20));		
		
		assertEquals(new Integer(1), board.getNoticeCount());
	}
		
}
