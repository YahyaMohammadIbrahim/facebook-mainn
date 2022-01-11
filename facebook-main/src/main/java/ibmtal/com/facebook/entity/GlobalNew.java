package ibmtal.com.facebook.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="globalnews")
public class GlobalNew {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="caption")
	private String caption;
	@Column(name="shortcontent")
	private String shortcontent;
	@Column(name="content")
	private String content;
	@Column(name="photo")
	private String photo;
	@Column(name="createdate")
	private String createdate;
	@Column(name="isactive")
	private boolean isactive;
	@Column(name="viewcount")
	private int viewcount;
	public GlobalNew() {
		super();
	}
	public GlobalNew(int id, String caption, String shortcontent, String content, String photo, String createdate,
			boolean isactive, int viewcount) {
		super();
		this.id = id;
		this.caption = caption;
		this.shortcontent = shortcontent;
		this.content = content;
		this.photo = photo;
		this.createdate = createdate;
		this.isactive = isactive;
		this.viewcount = viewcount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getShortcontent() {
		return shortcontent;
	}
	public void setShortcontent(String shortcontent) {
		this.shortcontent = shortcontent;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	

}
