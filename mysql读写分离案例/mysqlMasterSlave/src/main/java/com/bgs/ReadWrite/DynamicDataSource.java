package com.bgs.ReadWrite;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import java.lang.reflect.Field;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.Map;  
import java.util.concurrent.atomic.AtomicInteger;  
import javax.sql.DataSource;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.util.ReflectionUtils; 
/** 
 * 定义动态数据源，实现通过集成Spring提供的AbstractRoutingDataSource，
 * 只需要实现determineCurrentLookupKey方法即可 
 * 由于DynamicDataSource是单例的，线程不安全的，所以采用ThreadLocal保证线程安全，由DynamicDataSourceHolder完成。 
 */ 
public class DynamicDataSource extends AbstractRoutingDataSource{

	//一主一从的话只执行以下放即可
	@Override
	protected Object determineCurrentLookupKey() {
		 // 使用DynamicDataSourceHolder保证线程安全，并且得到当前线程中的数据源key  
        return DynamicDataSourceHolder.getDataSourceKey();
	}
	//一主多从实现方案
	//计划用Nginx实现
}
