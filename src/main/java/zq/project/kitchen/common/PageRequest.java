package zq.project.kitchen.common;

public class PageRequest {

	private int pageNo = 1;

	private int pageSize = 15;

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

	public int getLimit() {
		return pageSize;
	}

	public int getOffset() {
		return (pageNo - 1) * pageSize;
	}

}
