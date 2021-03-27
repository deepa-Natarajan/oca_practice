package ExceptionConcept;


class FallingInRiverException extends Exception{}
class DropOarException extends Exception{}


 class RiverRafting {
	
	void crossRapid(int degree) throws FallingInRiverException{
		System.out.println("Cross Rapid");
		if(degree>10) throw new FallingInRiverException();
		
	}
	void rowRaft(String state) throws DropOarException{
		System.out.println("Row Raft");
		if(state.equalsIgnoreCase("Nervous")) throw new DropOarException();
	}

}

class TestRiverRafting{
	
	public static void main(String[] args) {
		RiverRafting rf= new RiverRafting();
		try {
			rf.crossRapid(7);
			rf.rowRaft("Nervous");
			System.out.println("Enjoy river Rafting");
			
//		}catch (FallingInRiverException e1) {
//			System.out.println("FallingInRiverException caught");
			
		}catch (DropOarException e2) {
			System.out.println("DropOarException caught");
			
		} catch (FallingInRiverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("Pay the fee");
		}
		
		System.out.println("Check your wallet and go home");

		
	}
}
