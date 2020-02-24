package Interest.InterestCalculation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class Interest 
{
	private static final Logger logg = LogManager.getLogger(Interest.class);
public int calculateSimpleInterest(int amount , int timeInMonths , int interestRate) {
	logg.info("Starting of the method calculateSimpleInterest..........");
	logg.info("Ending of the method calculateSimpleInterest..........");	
		return (( amount * timeInMonths * interestRate)/100 ) ;
		
	}
	public int calculateCompoundInterest(int amount , int timeInMonths , int interestRate) {
		logg.info("Strting of the method calculateCompoundInterest..........");
		logg.info("Ending of the method calculateCompoundInterest..........");
		
		return (int) ((Math.pow( 1 + (interestRate / 100.0), timeInMonths / 12.0 ) * amount) - amount) ; 
		
		
	}

}
