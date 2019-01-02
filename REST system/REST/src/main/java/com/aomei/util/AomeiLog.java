package com.aomei.util;

import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AomeiLog {
	public void LogInfo(String aomeiinfo) {

		try {

			Logger log = Logger.getLogger("tesglog");
			log.setLevel(Level.ALL);
			Date date = new Date();  
			FileHandler fileHandler = new FileHandler("log/log"+date.getYear()+""+(date.getMonth()+1)+""+date.getDate()+""+".log");
			fileHandler.setLevel(Level.ALL);
			fileHandler.setFormatter(new LogFormatter());
			log.addHandler(fileHandler);
			log.info(aomeiinfo);
			System.out.println(aomeiinfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
