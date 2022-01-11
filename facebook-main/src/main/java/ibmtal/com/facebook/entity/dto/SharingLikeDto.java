package ibmtal.com.facebook.entity.dto;

public class SharingLikeDto {
private int id;
private String liketime;
private int shareingid;
private int userid;
public SharingLikeDto() {
	super();
}
public SharingLikeDto(int id, String liketime, int shareingid, int userid) {
	super();
	this.id = id;
	this.liketime = liketime;
	this.shareingid = shareingid;
	this.userid = userid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLiketime() {
	return liketime;
}
public void setLiketime(String liketime) {
	this.liketime = liketime;
}
public int getShareingid() {
	return shareingid;
}
public void setShareingid(int shareingid) {
	this.shareingid = shareingid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
}
