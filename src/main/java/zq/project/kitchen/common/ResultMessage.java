package zq.project.kitchen.common;

public class ResultMessage<T> {

	private static final int SUCCESS_CODE = 0;

	private static final int DEFAULT_ERR_CODE = 100;

	private static final String SUCCESS_MSG = "SUCCESS";

	private static final String DEFAULT_ERR_MSG = "ERROR";

	private int code;

	private String message;

	private T result;

	private ResultMessage(int code, String message, T result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}

	public static <T> ResultMessage<T> success() {
		return new ResultMessage<>(SUCCESS_CODE, SUCCESS_MSG, null);
	}

	public static <T> ResultMessage<T> success(T t) {
		return new ResultMessage<>(SUCCESS_CODE, SUCCESS_MSG, t);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

}
