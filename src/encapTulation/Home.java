package encapTulation;
//Encaptulation
public class Home {
private String hName = "Willo House";
private int hAddress = 8511;
private String hNeighborHood = "East Elmhurst";
public String gethName() {
	return hName;
}
public void sethName(String hName) {
	this.hName = hName;
}
public int gethAddress() {
	return hAddress;
}
public void sethAddress(int hAddress) {
	this.hAddress = hAddress;
}
public String gethNeighborHood() {
	return hNeighborHood;
}
public void sethNeighborHood(String hNeighborHood) {
	this.hNeighborHood = hNeighborHood;
}

}
