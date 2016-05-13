package ds.core;

public class EmptyStructureException extends Exception {

	public EmptyStructureException() {
		super("Empty structure exception with unspecified message.");
	}

	public EmptyStructureException(String msg) {
		super("EmptyStructureException: " + msg);
	}

	public EmptyStructureException(Throwable cause) {
		super(cause);
	}

	public EmptyStructureException(String msg, Throwable cause) {
		super("EmptyStructureException: " + msg, cause);
	}

	public EmptyStructureException(String msg, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
		super("EmptyStructureException: " + msg, cause, enableSuppression, writeableStackTrace);
	}

}
