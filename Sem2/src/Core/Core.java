package Core;

import Abstractions.ItemGenerator;
import Rewards.Buratino.BuratinoGenerator;
import Rewards.Gems.GemGenerator;
import Rewards.Gold.GoldGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Core {
	public void run() {

		List<ItemGenerator> generatorList = new ArrayList<>();
		generatorList.add(new GemGenerator());
		generatorList.add(new GoldGenerator());
		generatorList.add(new BuratinoGenerator());

		int min = 0;
		int max = 2;

		for (int i = 0; i < 10; i++) {
			int idx = ThreadLocalRandom.current().nextInt(min, max + 1);
			ItemGenerator itemGenerator = generatorList.get(idx);
			System.out.println(itemGenerator.openReward());
		}
	}
}