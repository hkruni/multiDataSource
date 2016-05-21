package com.cmdi.yjs.dataSource;

/**
 * 
 * 
 * @author liuyu
 */
public class DataSourceSwitcher {
	@SuppressWarnings("rawtypes")
	private static final ThreadLocal contextHolder = new ThreadLocal();

	@SuppressWarnings("unchecked")
	public static void setDataSource(String dataSource) {
		contextHolder.set(dataSource);
	}

	public static void setWrite() {
		clearDataSource();
	}

	public static void setRead() {
		setDataSource("read");
	}

	public static String getDataSource() {
		String dataSource = (String) contextHolder.get();

		return dataSource;
	}

	public static void clearDataSource() {
		contextHolder.remove();
	}
}
