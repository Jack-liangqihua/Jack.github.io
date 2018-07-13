
package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
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
public class Echart_Bar_TV {
 
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/Echart_Bar_TV", method = RequestMethod.POST ,produces="application/json;charset=utf-8;") 
	@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
	public GsonOption DB_TEST(  @RequestBody  Map<String, Object> params) {
		 
		try { 
			List<String> CategoryAxisdata = new ArrayList<>();
			List<Double> bardata = new ArrayList<>();
			
			int decimal = Integer.parseInt(params.get("DECIMAL").toString());
			BigDecimal bg = null;
			double f1 = 0.00;
			int UNITS = 1;
			if(params.get("UNITS") != null){ 
				UNITS = Integer.parseInt(params.get("UNITS").toString());
			}
		 
			List<Map<String, Object>> logs = new ArrayList<Map<String, Object>>();
			 
			System.out.println(params.get("SQL").toString());
			logs = jdbcTemplate1.queryForList(params.get("SQL").toString()); 
			String ARBPL = "";
			for (int i = 0; i < logs.size(); i++) {  
				ARBPL = logs.get(i).get(params.get("X").toString()).toString();
				CategoryAxisdata.add(ARBPL);
				bg = new BigDecimal(Double.parseDouble(logs.get(i).get(params.get("Y").toString()).toString()) / UNITS);
				f1 = bg.setScale(decimal, BigDecimal.ROUND_HALF_UP).doubleValue();
				bardata.add(f1);
			}
			
			
			
			GsonOption option = new GsonOption();
			option.title().text(params.get("NAME").toString()).subtext(params.get("SUBNAME").toString());
			option.tooltip().trigger(Trigger.axis);
			option.legend(params.get("ITEMS").toString());
			option.toolbox().show(true).feature(Tool.mark, Tool.dataView,
					new MagicType(Magic.line, Magic.bar).show(true), Tool.restore, Tool.saveAsImage);
			
//			option.legend().orient(Orient.vertical).x("(function(value){ return value.toFixed(2);})()");
			option.calculable(true);
//			option.xAxis(new CategoryAxis().data(CategoryAxisdata.toArray()));
			
			CategoryAxis x =  new CategoryAxis();
			x.data(CategoryAxisdata.toArray());
			x.axisLabel().rotate(45);
			x.axisLabel().interval(0); 
			option.xAxis(x);
			
			ValueAxis y = new ValueAxis();   
			y.type(AxisType.value);
			y.axisLabel().formatter("{value}"+params.get("UNITS_NAME").toString());
			option.yAxis(y);

			Bar bar = new Bar("数据");
			if(bardata.size()<5){
				bar.barWidth(25);
			}
			
			bar.data(bardata.toArray());
			bar.markPoint().data(new PointData().type(MarkType.max).name("最大值"),
					new PointData().type(MarkType.min).name("最小值"));
			//bar.markLine().data(new PointData().type(MarkType.average).name("平均值"));
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
			
//			option.series(bar);
			
			CategoryAxisdata= null;
			bardata 		= null;
		 //System.out.println(option);
			return option;

		} catch (Exception e) {
			e.printStackTrace();
		}  
		// System.out.println(ds);

		return null;
	}

}
