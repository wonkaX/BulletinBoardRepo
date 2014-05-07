package bulletin.board.core.system;

import bulletin.board.core.facade.Item;

public class DummyItem implements Item {
	
	public Integer getId() {
		
		return 1;
	}
	
	public String getName() {
				
		return "Dummy";
	}

	@Override
	public int hashCode() {
		
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	
}
