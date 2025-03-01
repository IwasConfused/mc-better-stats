package io.github.thecsdev.betterstats.api.client.registry;

import static io.github.thecsdev.betterstats.BetterStats.getModID;

import org.jetbrains.annotations.ApiStatus.Internal;

import io.github.thecsdev.betterstats.BetterStats;
import io.github.thecsdev.betterstats.api.client.gui.util.StatsTabUtils;
import io.github.thecsdev.betterstats.client.gui.stats.tabs.FoodStuffsStatsTab;
import io.github.thecsdev.betterstats.client.gui.stats.tabs.GeneralStatsTab;
import io.github.thecsdev.betterstats.client.gui.stats.tabs.ItemStatsTab;
import io.github.thecsdev.betterstats.client.gui.stats.tabs.MobStatsTab;
import io.github.thecsdev.betterstats.client.gui.stats.tabs.MonstersHuntedStatsTab;
import io.github.thecsdev.betterstats.client.gui.stats.tabs.PlayerBadgeStatsTab;
import io.github.thecsdev.tcdcommons.api.client.gui.panel.TPanelElement;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * {@link BetterStats}'s {@link StatsTab}s.
 */
public final class BSStatsTabs
{
	// ==================================================
	private BSStatsTabs() {}
	// ==================================================
	/**
	 * An {@link Integer} corresponding to the yellow color.<p>
	 * Used for group labels featured in {@link StatsTabUtils#initGroupLabel(TPanelElement, Text)}.
	 */
	public static final @Internal int COLOR_SPECIAL = 0xFFFFFF00;
	// --------------------------------------------------
	public static final StatsTab GENERAL         = new GeneralStatsTab();
	public static final StatsTab ITEMS           = new ItemStatsTab();
	public static final StatsTab ENTITIES        = new MobStatsTab();
	public static final StatsTab FOOD_STUFFS     = new FoodStuffsStatsTab();
	public static final StatsTab MONSTERS_HUNTED = new MonstersHuntedStatsTab();
	public static final StatsTab PLAYER_BADGES   = new PlayerBadgeStatsTab();
	// ==================================================
	/**
	 * Registers the {@link BSStatsTabs} to the {@link BSClientRegistries#STATS_TAB} registry.
	 * @apiNote May only be called once.
	 */
	public static void register() {}
	static
	{
		final String modId = getModID();
		BSClientRegistries.STATS_TAB.register(new Identifier(modId, "general"), GENERAL);
		BSClientRegistries.STATS_TAB.register(new Identifier(modId, "items"), ITEMS);
		BSClientRegistries.STATS_TAB.register(new Identifier(modId, "entities"), ENTITIES);
		BSClientRegistries.STATS_TAB.register(new Identifier(modId, "food_stuffs"), FOOD_STUFFS);
		BSClientRegistries.STATS_TAB.register(new Identifier(modId, "monsters_hunted"), MONSTERS_HUNTED);
		BSClientRegistries.STATS_TAB.register(new Identifier(modId, "player_badges"), PLAYER_BADGES);
	}
	// ==================================================
}