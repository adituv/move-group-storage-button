package com.github.adituv.movegroupstoragebutton;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Move Group Storage Button"
)
public class MoveGroupStorageButtonPlugin extends Plugin
{
	private static final int NEW_BUTTON_X_POS = 56;

	@Inject
	private Client client;

	@Subscribe
	private void onWidgetLoaded(WidgetLoaded e)
	{
		if (e.getGroupId() != WidgetID.BANK_GROUP_ID)
		{
			return;
		}

		Widget w = client.getWidget(12,8);
		if (w == null)
		{
			return;
		}

		w.setOriginalX(NEW_BUTTON_X_POS);
		w.revalidate();
	}
}
