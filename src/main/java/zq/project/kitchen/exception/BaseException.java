package zq.project.kitchen.exception;

public class BaseException extends RuntimeException {

	private int code;

	public BaseException(String reason) {
		super(reason);
	}

	public BaseException(String reason, int code) {
		super(reason);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
