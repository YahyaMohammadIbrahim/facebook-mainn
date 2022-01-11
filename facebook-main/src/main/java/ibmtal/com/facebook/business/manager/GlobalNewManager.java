package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.GlobalNewService;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.GlobalNewDao;
import ibmtal.com.facebook.entity.GlobalNew;
import ibmtal.com.facebook.entity.Sharing;
import ibmtal.com.facebook.entity.SharingLike;
import ibmtal.com.facebook.entity.dto.GlobalNewDto;

@Service
public class GlobalNewManager implements GlobalNewService {
	private GlobalNewDao globalNewDao;
	@Autowired
	public GlobalNewManager(GlobalNewDao globalNewDao) {
		super();
		this.globalNewDao = globalNewDao;
	}

	@Override
	public Result addGlobalNews(GlobalNewDto globalNewDto) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		result.setSuccess(true);
		GlobalNew globalnew=new GlobalNew();
		globalnew.setCaption(globalNewDto.getCaption());
		globalnew.setContent(globalNewDto.getContent());
		globalnew.setCreatedate(globalNewDto.getCreatedate());
		globalnew.setIsactive(globalNewDto.isIsactive());
		globalnew.setPhoto(globalNewDto.getPhoto());
		globalnew.setShortcontent(globalNewDto.getShortcontent());
		
		globalNewDao.save(globalnew);
		

		
		
		result.setErrors(mesaj);
		return result;
	}

	@Override
	public ArrayList<GlobalNew> getAll() {
		return new ArrayList<GlobalNew>(this.globalNewDao.findAll());
		
	}

}
