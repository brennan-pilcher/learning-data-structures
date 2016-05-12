package ds.core;

public class FullStructureException extends Exception {

	public FullStructureException() {
		super("Full structure exception with unspecified message.");
	}

	public FullStructureException(String msg) {
		super("FullStructureException: " + msg);
	}

	public FullStructureException(Throwable cause) {
		super(cause);
	}

	public FullStructureException(String msg, Throwable cause) {
		super("FullStructureException: " + msg, cause);
	}

	public FullStructureException(String msg, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
		super("FullStructureException: " + msg, cause, enableSuppression, writeableStackTrace);
	}

}
