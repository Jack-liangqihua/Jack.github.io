package com.aomei.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Time {

	public static String formatDate(Date date) {
		String formDate = "";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		formDate = format.format(date);

		return formDate;
	}
	
	
	public  String formatDate(Date date,String Simple) {
		String formDate = "";
		SimpleDateFormat format = new SimpleDateFormat(Simple);
		formDate = format.format(date);

		return formDate;
	}

	public static Date formatDate(String date) throws ParseException {
		Date time = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		time = format.parse(date);

		return time;

	}

	/**
	 * 计算指定年度共有多少个周。
	 * 
	 * @param year
	 *            格式 yyyy ，必须大于1900年度 小于9999年
	 * @return
	 */
	public static int getWeekNumByYear(final int year) {
		if (year < 1900 || year > 9999) {
			throw new NullPointerException("年度必须大于等于1900年小于等于9999年");
		}
		int result = 52;// 每年至少有52个周 ，最多有53个周。
		String date = getYearWeekFirstDay(year, 53);

		if (date.substring(0, 4).equals(year + "")) { // 判断年度是否相符，如果相符说明有53个周。
			// System.out.println(date);
			result = 53;
		}
		return result;
	}

	/**
	 * 计算某年某周的开始日期
	 * 
	 * 
	 * @param yearNum
	 *            格式 yyyy ，必须大于1900年度 小于9999年
	 * 
	 * @param weekNum
	 *            1到52或者53
	 * @return 日期，格式为yyyy-MM-dd
	 */
	public static String getYearWeekFirstDay(int yearNum, int weekNum) {

		Calendar cal = Calendar.getInstance();
		cal.setFirstDayOfWeek(Calendar.SUNDAY); // 设置每周的第一天为星期日
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);// 每周从周日开始

		// 上面两句代码配合，才能实现，每年度的第一个周，是包含第一个星期日的那个周。

		cal.setMinimalDaysInFirstWeek(7); // 设置每周最少为7天

		cal.set(Calendar.YEAR, yearNum);
		cal.set(Calendar.WEEK_OF_YEAR, weekNum);

		// 分别取得当前日期的年、月、日
		return formatDate(cal.getTime());
	}

	
	/***
	 * 计算两个日期之间的工作日
	 * @param strStartDate
	 * @param strEndDate
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public int getDutyDays(String strStartDate, String strEndDate) {

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = df.parse(strStartDate);
			endDate = df.parse(strEndDate);
		} catch (ParseException e) {
			System.out.println("非法的日期格式,无法进行转换");
			e.printStackTrace();
		}
		int result = 0;
		while (startDate.compareTo(endDate) <= 0) {
			if (startDate.getDay() != 0)
				result++;
			startDate.setDate(startDate.getDate() + 1);
		}
		return result;

	}
	
	
	public String  nowtime(){ 
  	  
		String RE = "";
		Date mydate = new Date();
        mydate.setTime(mydate.getTime()-24*60*60*1000);
    
        int str =   mydate.getYear();
        int mm = mydate.getMonth()+1;
        if(mydate.getMonth()>9){
         str += mm;
        }
        else{
        	RE = str + "0" + mm;
        }
        if(mydate.getDate()>9){
        	RE += str + mydate.getDate();
        }
        else{
        	RE += str + "0" + mydate.getDate();
        }
        
        return RE;
      }
	
	
}
