package bulletin.board.core.system;

import bulletin.board.core.facade.User;

public class DummyUser implements User {

	public Integer getId() {
		
		return 1;
	}
	
	public String getName() {
		
		return "DummyUser";
	}
	
	@Override
	public int hashCode() {
		
		return 51;
	}

	@Override
	public boolean equals(Object obj) {
		
		return true;
	}

}
