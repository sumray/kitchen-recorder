package zq.project.kitchen.common;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> {

	private int pageNo;

	private int pageSize;

	private List<T> data;

	private long totalCount;

	public PageResult(int pageNo, int pageSize) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}

	public PageResult(int pageNo, int pageSize, List<T> data, long totalCount) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.data = data == null ? new ArrayList<>() : data;
		this.totalCount = totalCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

}
