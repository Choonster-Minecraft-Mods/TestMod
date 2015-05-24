package com.choonster.testmod.util;

import com.choonster.testmod.TestMod;
import cpw.mods.fml.common.FMLLog;

import java.util.logging.Level;

public class Logger {
	public static void log(Level level, String format, Object... data) {
		FMLLog.log(TestMod.MODID, level, format, data);
	}

	public static void log(Level level, Throwable throwable, String format, Object... data) {
		FMLLog.log(TestMod.MODID, level, throwable, format, data);
	}


	public static void severe(String format, Object... data) {
		log(Level.SEVERE, format, data);
	}

	public static void severe(Throwable throwable, String format,
							  Object... data) {
		log(Level.SEVERE, throwable, format, data);
	}

	public static void warning(String format, Object... data) {
		log(Level.WARNING, format, data);
	}

	public static void info(String format, Object... data) {
		log(Level.INFO, format, data);
	}

	public static void fine(String format, Object... data) {
		log(Level.FINE, format, data);
	}
}
