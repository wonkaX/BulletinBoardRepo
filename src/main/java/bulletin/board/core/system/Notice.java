package bulletin.board.core.system;

import bulletin.board.core.facade.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Notice {

	@Getter 
	@NonNull
	private NoticeType type;
	
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
