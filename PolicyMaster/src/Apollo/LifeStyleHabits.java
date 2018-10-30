package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LifeStyleHabits" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public class LifeStyleHabits {
private String BeerBottle;
private String LiquorPeg;
private String	Pouches;
private String	Smoking;
private String	WineGlass;
public String getBeerBottle() {
	return BeerBottle;
}
@XmlElement(name="BeerBottle",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setBeerBottle(String beerBottle) {
	BeerBottle = beerBottle;
}
public String getLiquorPeg() {
	return LiquorPeg;
}
@XmlElement(name="LiquorPeg",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setLiquorPeg(String liquorPeg) {
	LiquorPeg = liquorPeg;
}
public String getPouches() {
	return Pouches;
}
@XmlElement(name="Pouches",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setPouches(String pouches) {
	Pouches = pouches;
}
public String getSmoking() {
	return Smoking;
}
@XmlElement(name="Smoking",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setSmoking(String smoking) {
	Smoking = smoking;
}
public String getWineGlass() {
	return WineGlass;
}
@XmlElement(name="WineGlass",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setWineGlass(String wineGlass) {
	WineGlass = wineGlass;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("LifeStyleElement [BeerBottle=").append(BeerBottle).append(", LiquorPeg=").append(LiquorPeg)
			.append(", Pouches=").append(Pouches).append(", Smoking=").append(Smoking).append(", WineGlass=")
			.append(WineGlass).append("]");
	return builder.toString();
}
}
