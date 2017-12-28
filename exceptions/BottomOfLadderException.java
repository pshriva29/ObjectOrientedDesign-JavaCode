package exceptions;

public class BottomOfLadderException extends Exception
{

	private static final long serialVersionUID = 1L;
	
	public BottomOfLadderException()
	{
		this("You are already at the bottom.");
	}
	
	 public BottomOfLadderException(String str)
	 {
		 super(str);
     }

}
