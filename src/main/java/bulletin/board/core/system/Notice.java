package bulletin.board.core.system;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import bulletin.board.core.facade.Item;
import bulletin.board.core.facade.User;

@RequiredArgsConstructor
public class Notice {

	@Getter 
	@NonNull
	private NoticeType type;
	
	@Getter
	@NonNull
	private User user;
	
	@Getter 
	@NonNull
	private Item item;
	
	@Getter 
	@Setter 
	@NonNull
	private Integer amount;
	
	@Getter 
	@Setter 
	@NonNull
	private Integer pricePerItem;

	
}
