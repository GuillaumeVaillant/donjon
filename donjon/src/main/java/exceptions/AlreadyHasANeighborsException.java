package exceptions;

public class AlreadyHasANeighborsException extends Exception  {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public AlreadyHasANeighborsException () {
		System.out.println("this Room has already a neighboors from this side ");
	}
}