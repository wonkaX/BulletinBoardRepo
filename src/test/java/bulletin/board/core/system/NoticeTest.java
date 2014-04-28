package bulletin.board.core.system;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NoticeTest {

	@Test
	public void noticeConstructionFailure() {
		
		Notice notice = null;
		
		try {
			notice = new Notice(null, null, null, 10, 5);
		} catch(NullPointerException npex) {
			;
		}
		
		assertNull(notice);
	}
	
	@Test
	public void noticeConstruction() {
		
		Notice notice = new Notice(NoticeType.SUPPLY, new DummyUser(), new DummyItem(), 10, 5);
		
		assertNotNull(notice);
		assertEquals(NoticeType.SUPPLY, notice.getType());
		assertEquals(new DummyUser(), notice.getUser());
		assertEquals(new DummyItem(), notice.getItem());
		assertEquals(new Integer(10), notice.getAmount());
		assertEquals(new Integer(5), notice.getPricePerItem());
	}
	
}
