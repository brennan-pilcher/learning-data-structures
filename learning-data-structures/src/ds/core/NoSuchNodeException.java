package ds.core;

public class NoSuchNodeException extends Exception {

	public NoSuchNodeException() {
		super("No such node exception with unspecified message.");
	}

	public NoSuchNodeException(String msg) {
		super("NoSuchNodeException: " + msg);
	}

	public NoSuchNodeException(Throwable cause) {
		super(cause);
	}

	public NoSuchNodeException(String msg, Throwable cause) {
		super("NoSuchNodeException: " + msg, cause);
	}

	public NoSuchNodeException(String msg, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
		super("NoSuchNodeException: " + msg, cause, enableSuppression, writeableStackTrace);
	}

}