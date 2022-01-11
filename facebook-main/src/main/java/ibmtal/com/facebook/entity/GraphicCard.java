package ibmtal.com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="graphiccards")

public class GraphicCard {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int id;
@Column(name="brand")
private String brand;
@Column(name="processor")
private String processor;
@Column(name="corespeed")
private String corespeed;
@Column(name="maxcorespeed")
private String maxcorespeed;
@Column(name="memtype")
private String memtype;
@Column(name="memcapacity")
private String memcapacity;
@Column(name="memspeed")
private String memspeed;
@Column(name="meminterface")
private String meminterface;
@Column(name="hdmi")
private String hdmi;
@Column(name="dvi")
private String dvi;
@Column(name="vgaoutput")
private String vgaoutput;
@Column(name="maxres")
private String maxres;
@Column(name="cooling")
private String cooling;
@Column(name="powercons")
private String powercons;
@Column(name="directx")
private int directx;
@Column(name="opengl")
private double opengl;
@Column(name="dimensions")
private String dimensions;
@Column(name="hdcpsupport")
private boolean hdcpsupport;
@Column(name="vgaslot")
private String vgaslot;
public GraphicCard() {
	super();
}
public GraphicCard(int id, String brand, String processor, String corespeed, String maxcorespeed, String memtype,
		String memcapacity, String memspeed, String meminterface, String hdmi, String dvi, String vgaoutput,
		String maxres, String cooling, String powercons, int directx, double opengl, String dimensions,
		boolean hdcpsupport, String vgaslot) {
	super();
	this.id = id;
	this.brand = brand;
	this.processor = processor;
	this.corespeed = corespeed;
	this.maxcorespeed = maxcorespeed;
	this.memtype = memtype;
	this.memcapacity = memcapacity;
	this.memspeed = memspeed;
	this.meminterface = meminterface;
	this.hdmi = hdmi;
	this.dvi = dvi;
	this.vgaoutput = vgaoutput;
	this.maxres = maxres;
	this.cooling = cooling;
	this.powercons = powercons;
	this.directx = directx;
	this.opengl = opengl;
	this.dimensions = dimensions;
	this.hdcpsupport = hdcpsupport;
	this.vgaslot = vgaslot;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public String getCorespeed() {
	return corespeed;
}
public void setCorespeed(String corespeed) {
	this.corespeed = corespeed;
}
public String getMaxcorespeed() {
	return maxcorespeed;
}
public void setMaxcorespeed(String maxcorespeed) {
	this.maxcorespeed = maxcorespeed;
}
public String getMemtype() {
	return memtype;
}
public void setMemtype(String memtype) {
	this.memtype = memtype;
}
public String getMemcapacity() {
	return memcapacity;
}
public void setMemcapacity(String memcapacity) {
	this.memcapacity = memcapacity;
}
public String getMemspeed() {
	return memspeed;
}
public void setMemspeed(String memspeed) {
	this.memspeed = memspeed;
}
public String getMeminterface() {
	return meminterface;
}
public void setMeminterface(String meminterface) {
	this.meminterface = meminterface;
}
public String getHdmi() {
	return hdmi;
}
public void setHdmi(String hdmi) {
	this.hdmi = hdmi;
}
public String getDvi() {
	return dvi;
}
public void setDvi(String dvi) {
	this.dvi = dvi;
}
public String getVgaoutput() {
	return vgaoutput;
}
public void setVgaoutput(String vgaoutput) {
	this.vgaoutput = vgaoutput;
}
public String getMaxres() {
	return maxres;
}
public void setMaxres(String maxres) {
	this.maxres = maxres;
}
public String getCooling() {
	return cooling;
}
public void setCooling(String cooling) {
	this.cooling = cooling;
}
public String getPowercons() {
	return powercons;
}
public void setPowercons(String powercons) {
	this.powercons = powercons;
}
public int getDirectx() {
	return directx;
}
public void setDirectx(int directx) {
	this.directx = directx;
}
public double getOpengl() {
	return opengl;
}
public void setOpengl(double opengl) {
	this.opengl = opengl;
}
public String getDimensions() {
	return dimensions;
}
public void setDimensions(String dimensions) {
	this.dimensions = dimensions;
}
public boolean isHdcpsupport() {
	return hdcpsupport;
}
public void setHdcpsupport(boolean hdcpsupport) {
	this.hdcpsupport = hdcpsupport;
}
public String getVgaslot() {
	return vgaslot;
}
public void setVgaslot(String vgaslot) {
	this.vgaslot = vgaslot;
}




}
