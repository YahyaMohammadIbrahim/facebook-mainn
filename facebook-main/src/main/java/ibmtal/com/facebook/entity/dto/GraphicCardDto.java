package ibmtal.com.facebook.entity.dto;

public class GraphicCardDto {
	private int id;
	private String brand;
	private String processor;
	private String corespeed;
	private String maxcorespeed;
	private String memtype;
	private String memcapacity;
	private String memspeed;
	private String meminterface;
	private String hdmi;
	private String dvi;
	private String vgaoutput;
	private String maxres;
	private String cooling;
	private String powercons;
	private int directx;
	private double opengl;
	private String dimensions;
	private boolean hdcpsupport;
	private String vgaslot;
	public GraphicCardDto() {
		super();
	}
	public GraphicCardDto(int id, String brand, String processor, String corespeed, String maxcorespeed, String memtype,
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
