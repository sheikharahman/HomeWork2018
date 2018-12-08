package encapTulation;

public class testMyHome {
       //Encaptulations 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Home h1 = new Home();//Constructor/Encaptualtion 
      h1.sethName("Jackson House Apartment");
      h1.sethAddress(8511);
      h1.sethNeighborHood("Jackson Heights");
      System.out.println(h1.gethName() +","+h1.gethAddress()+","+h1.gethNeighborHood());
      Home h2 = new Home();
      h2.sethName("Webstar Hall");
      h2.sethAddress(8513);
      h2.sethNeighborHood("Jackson Heights");
      System.out.println(h2.gethName()+","+ h2.gethAddress()+","+h2.gethNeighborHood());
      Home reHome = new Home();//Returning method
      String hn = reHome.gethName();
      int adds =reHome.gethAddress();
      String nh = reHome.gethNeighborHood();
      
      System.out.println(hn +","+ adds+","+nh);
	}

}
