package Rewards.Gems;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class GemGenerator extends ItemGenerator {
	@Override
	public IGameItem createItem() {
		return new GemRewards();
	}
}