package zq.project.kitchen.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import zq.project.kitchen.common.ResultMessage;

@RestControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(BaseException.class)
	public ResultMessage<Void> handleBaseException(BaseException e) {
		return ResultMessage.error(e.getCode(), e.getMessage());
	}

	@ExceptionHandler(Exception.class)
	public ResultMessage<Void> handleBaseException(Exception e) {
		e.printStackTrace();
		return ResultMessage.error(ResultMessage.DEFAULT_ERR_CODE, ResultMessage.DEFAULT_ERR_MSG);
	}

}
