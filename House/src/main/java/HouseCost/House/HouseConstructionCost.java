package HouseCost.House;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





/**
 * Hello world!
 *
 */
public class HouseConstructionCost 
{
	private static final Logger logg = LogManager.getLogger(HouseConstructionCost.class);
	
public int calculateHouseConstrucionCost(boolean standardMaterials , boolean aboveStandardMaterials , boolean highStandardMaterials , boolean automatedHome , int area) {
		
		logg.info("Starting of the method calculateHouseConstrucionCost..........");
		logg.info("Ending of the method calculateHouseConstrucionCost..........");
		
		if(standardMaterials)
			return 1200 * area ; 
		
		else if(aboveStandardMaterials)
		return 1500 * area ; 
		
		else if(highStandardMaterials == true && automatedHome == false)
			return 1800 * area ;
		
		else if(highStandardMaterials == true && automatedHome == true)
			return 2500 * area ; 
		return 0 ;
		
	}
}
