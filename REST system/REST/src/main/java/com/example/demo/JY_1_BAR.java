package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.PointData;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Bar;

@RestController
@RequestMapping("/api")
public class JY_1_BAR {
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/JY_1_BAR", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public GsonOption DB_TEST(@RequestBody Map<String, Object> params) {

		try {

			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
			Date date = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DAY_OF_MONTH, -1); //前一天
			date = calendar.getTime();

			String AOMEI_SQL = " select arbpl ,dates, sum(BGMNG_FLOAT) as count_bgmng " + " from \"_SYS_BIC\".\"aomei/ZPPPR_KANBAN_BG\" "
// 					+ " where ( dates = \'" + df.format(date) + "\' AND  times >= 100000 and times <= 235959  ) "// --前一天
//					+ " where ( dates = \'20170408\' AND times >= 100000 and times <= 235959  ) "// --前一天
//					+ " or ( dates =  '" + df.format(new Date()) + "' AND  times >= 000000 and times <= 100000 ) " // --当前日期
//					+ " or (  dates =  '20170408' AND  times >= 000000 and times <= 100000 ) " // --当前日期
					

 					+ " where   dates = " + df.format(date) 
//					+ " where   C_TIME = 20170428" 
					+ " group by arbpl,dates "
					+ " order by arbpl "; 

			List<String> CategoryAxisdata = new ArrayList<>();
			List<Double> bardata = new ArrayList<>(); 
			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
			logs = jdbcTemplate1.queryForList(AOMEI_SQL);
			String sql_in = "";
			String ARBPL = "";
			for (int i = 0; i < logs.size(); i++) {  
				ARBPL = logs.get(i).get("ARBPL").toString();
				CategoryAxisdata.add(ARBPL);
				if(sql_in.indexOf(ARBPL)>-1){  }else
				{
					if(sql_in!=""){
						sql_in +=(",\'"+ARBPL+"\'");
					}else{
						sql_in = "\'"+ARBPL+"\'";
					}
				}
				bardata.add(Double.parseDouble(logs.get(i).get("COUNT_BGMNG").toString()));
			}

			GsonOption option = new GsonOption();
			option.title().text(params.get("NAME").toString()).subtext(params.get("SUBNAME").toString());
			option.tooltip().trigger(Trigger.axis);
			option.legend(params.get("ITEMS").toString());
			option.toolbox().show(true).feature(
					Tool.mark, Tool.dataView,
					new MagicType(Magic.line, Magic.bar).show(true), Tool.restore, Tool.saveAsImage);
			option.calculable(true);
			// option.xAxis(new
			// CategoryAxis().data(CategoryAxisdata.toArray()));

			CategoryAxis x = new CategoryAxis();
			x.data(CategoryAxisdata.toArray());
			x.axisLabel().rotate(45);
			x.axisLabel().interval(0);
			option.xAxis(x);

			option.yAxis(new ValueAxis());

			Bar bar = new Bar("当日产能");
			bar.data(bardata.toArray());
			bar.markPoint().data(new PointData().type(MarkType.max).name("最大值"),
					new PointData().type(MarkType.min).name("最小值"));
			bar.markLine().data(new PointData().type(MarkType.average).name("平均值"));

			
			
			String YearMonth = df.format(date).substring(0, 6);
			//System.out.println(YearMonth);
			
			AOMEI_SQL 	= " select arbpl ,dates, sum(BEFWEI_FLOAT) as SUM_BEFWEI " + " from \"_SYS_BIC\".\"aomei/ZPPPR_KANBAN_BG\" "
						+ " where  arbpl in ( "+ sql_in  +" ) and   YYYYMM = \'201704\'" 
						+ " group by arbpl,dates "
						+ " order by arbpl,dates"; 
			
			//System.out.println(AOMEI_SQL);
			  
			option.series(bar);

			CategoryAxisdata = null;
			bardata = null;
			return option;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
