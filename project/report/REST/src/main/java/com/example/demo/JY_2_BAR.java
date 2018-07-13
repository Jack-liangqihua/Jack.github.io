package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aomei.util.Date_Time;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.PointData;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.MarkLine;
import com.github.abel533.echarts.series.Series;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.style.itemstyle.Normal;

@RestController
@RequestMapping("/api")
public class JY_2_BAR {
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/JY_2_BAR", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public GsonOption DB_TEST(@RequestBody Map<String, Object> params) {

		try {
			int UNITS = 1;
			if(params.get("UNITS") != null){ 
				UNITS = Integer.parseInt(params.get("UNITS").toString());
			}
			int decimal = Integer.parseInt(params.get("DECIMAL").toString());
			
			//获取工作日数
			Date_Time dt = new Date_Time();
			int getDutyDays = dt.getDutyDays(params.get("strStartDate").toString(), params.get("strEndDate").toString()); 
			
			//获取机台日总量
			String AOMEI_SQL = " SELECT ARBPL ,C_TIME  ,sum(BEFWEI_FLOAT) as COUNT_BGMNG from \"_SYS_BIC\".\"aomei.prod/ZPPPR_KANBAN_BG\" where C_TIME != \'"+ params.get("strCurDate").toString()+"\'  AND YYYYMM = "+params.get("YYYYMM").toString()+" and XQ != 6 group by ARBPL ,C_TIME order by ARBPL ,C_TIME  ";					 

			List<String> CategoryAxisdata = new ArrayList<>();
			List<Double> bardata = new ArrayList<>(); 
			
			Map<String, Object>  ARBPL_count = null; 
			 
			List<Map<String, Object>> count2day = new ArrayList<Map<String, Object>>();
			
			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
			logs = jdbcTemplate1.queryForList(AOMEI_SQL);
			 
			BigDecimal bg = null;
			double f1 = 0.00;
			
			String ARBPL = "";
			int idx = 0;
//			for (int i = 0; i < logs.size(); i++) {  
//				idx = 0;
//				ARBPL_count = new HashMap<String, Object>();				
//				ARBPL = logs.get(i).get("ARBPL").toString();
////				System.out.println(ARBPL + "++++++++++++++++ARBPL++++++++++++++++++++++");
//				//遍历机台统计数据合并相同机台数据
//				for(int j = 0 ;j<count2day.size();j++){
//					if(ARBPL.equals(count2day.get(j).get("ARBPL").toString())){
//						idx = j;  
//						count2day.get(j) .replace(
//									"COUNT_BGMNG", 
//									Double.parseDouble(count2day.get(j).get("COUNT_BGMNG").toString())+ Double.parseDouble(logs.get(i).get("COUNT_BGMNG").toString())
//								);
//						 
//					}
//				}
//				
//				//当统计里面没有数据时
//				if(idx==0){
//					ARBPL_count.put("ARBPL",ARBPL); 
//					ARBPL_count.put("COUNT_BGMNG", Double.parseDouble(logs.get(i).get("COUNT_BGMNG").toString()));
//					count2day.add(ARBPL_count);
//					CategoryAxisdata.add(ARBPL );
//					//System.out.println(ARBPL + "++++++++++++++++ARBPL++++++++++++++++++++++");
//				}
//
////				System.out.println(idx + "++++++++++++++++idx++++++++++++++++++++++");
//			}
			
			for (int i = 0; i < logs.size(); i++) { 
				idx = 0;
				ARBPL_count = new HashMap<String, Object>();				
				ARBPL = logs.get(i).get("ARBPL").toString();
				
				if(CategoryAxisdata.contains(ARBPL)){
					for(int j = 0 ;j<count2day.size();j++){
						if(ARBPL.equals(count2day.get(j).get("ARBPL").toString())){
							idx = j;  
							count2day.get(j) .replace(
										"COUNT_BGMNG", 
										Double.parseDouble(count2day.get(j).get("COUNT_BGMNG").toString())+ Double.parseDouble(logs.get(i).get("COUNT_BGMNG").toString())
									);
							 
						}
					}
				}else{
					ARBPL_count.put("ARBPL",ARBPL); 
					ARBPL_count.put("COUNT_BGMNG", Double.parseDouble(logs.get(i).get("COUNT_BGMNG").toString()));
					count2day.add(ARBPL_count);
					CategoryAxisdata.add(ARBPL);
				}
			}
			
			
			
			Double jt = 0.00;
			for(int k = 0 ;k<CategoryAxisdata.size();k++){ 
				ARBPL = CategoryAxisdata.get(k).toString();
				for(int c = 0 ;c<count2day.size();c++){ 
					if(CategoryAxisdata.get(k).toString() == count2day.get(c).get("ARBPL").toString()){
						jt = Double.parseDouble(count2day.get(c).get("COUNT_BGMNG").toString())/getDutyDays;
						bg = new BigDecimal(jt / UNITS);
						f1 = bg.setScale(decimal, BigDecimal.ROUND_HALF_UP).doubleValue();
						
						bardata.add(f1);
					} 
					
				}
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

			ValueAxis y = new ValueAxis();   
			y.type(AxisType.value);
			y.axisLabel().formatter("{value}"+params.get("UNITS_NAME").toString());
			option.yAxis(y);

			Bar bar = new Bar(params.get("NAME").toString());
			bar.data(bardata.toArray());
			bar.markPoint().data(new PointData().type(MarkType.max).name("最大值"),
					new PointData().type(MarkType.min).name("最小值"));
			if (params.get("ZHIBIAO") != null) {
				MarkLine markLine = new MarkLine();
				ItemStyle itemStyle = new ItemStyle();
				Normal normal = new Normal();
				normal.setBorderWidth(4);
				LineStyle lineStyle = new LineStyle();
				lineStyle.setType(LineType.dashed);
				lineStyle.setColor("#F00");
				lineStyle.setWidth(2);
				normal.setLineStyle(lineStyle);
				itemStyle.setNormal(normal);
				 
				markLine.setItemStyle(itemStyle);
				  
				ArrayList<Object> data = new ArrayList<>();
			
				List<PointData> zb = new ArrayList<>(); 
				PointData pd = new PointData();
				 
				pd.setName(params.get("ZHIBIAO_NAME").toString());
				pd.setValue(params.get("ZHIBIAO").toString());
				pd.setxAxis(-1);
				pd.setyAxis(Integer.parseInt(params.get("ZHIBIAO").toString())); 
				zb.add(pd);
				data.add(zb);
				pd = new PointData();
				pd.xAxis(CategoryAxisdata.size());
				pd.setyAxis(Integer.parseInt(params.get("ZHIBIAO").toString()));
				zb.add(pd);
				data.add(zb);
				markLine.setData(data);
				bar.setMarkLine(markLine);
				
				 
			}else{
				bar.markLine().data(new PointData().type(MarkType.average).name("平均值"));
			}
			@SuppressWarnings("rawtypes")
			List<Series> series =new ArrayList<Series>();
			series.add(bar); 
			series.get(0).itemStyle().normal().label().setShow(true);
			series.get(0).itemStyle().normal().label().setPosition(Position.top); 
//			series.get(0).itemStyle().normal().label().setFormatter("function(a){return a + 'k'}");
			option.setSeries(series);

			CategoryAxisdata = null;
			bardata = null;
			return option;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
