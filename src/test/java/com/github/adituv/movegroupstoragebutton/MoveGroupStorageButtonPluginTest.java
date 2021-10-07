package com.github.adituv.movegroupstoragebutton;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MoveGroupStorageButtonPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MoveGroupStorageButtonPlugin.class);
		RuneLite.main(args);
	}
}