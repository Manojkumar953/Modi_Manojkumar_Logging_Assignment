package HouseCost.House;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class HouseConstructionCostTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	/* 
    	 * test case for the house construction cost estimation
    	 * 
    	 */
        HouseConstructionCost obj = new HouseConstructionCost() ;
        
        assertEquals(2400 , obj.calculateHouseConstrucionCost(true,false,false,false,2)) ; 
        
        assertEquals(3000 , obj.calculateHouseConstrucionCost(false,true,false,false,2)) ;
        
        assertEquals(3600 , obj.calculateHouseConstrucionCost(false,false,true,false,2)) ;
        
        assertEquals(5000 , obj.calculateHouseConstrucionCost(false,false,true,true,2)) ;
   
    }
}
