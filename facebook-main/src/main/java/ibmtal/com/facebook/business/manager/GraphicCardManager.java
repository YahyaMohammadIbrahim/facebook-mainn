package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.GraphicCardService;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.GraphicCardDao;
import ibmtal.com.facebook.entity.GraphicCard;
import ibmtal.com.facebook.entity.dto.GraphicCardDto;

@Service
public class GraphicCardManager implements GraphicCardService {
private GraphicCardDao graphicCardDao;
	public GraphicCardManager(GraphicCardDao graphicCardDao) {
	super();
	this.graphicCardDao = graphicCardDao;
}
	@Override
	public Result addGraphicCard(GraphicCardDto graphicCardDto) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		result.setSuccess(true);
		GraphicCard graphiccard=new GraphicCard();
		graphiccard.setBrand(graphicCardDto.getBrand());
		graphiccard.setProcessor(graphicCardDto.getProcessor());
		graphiccard.setCorespeed(graphicCardDto.getCorespeed());
		graphiccard.setMaxcorespeed(graphicCardDto.getMaxcorespeed());
		graphiccard.setMemtype(graphicCardDto.getMemtype());
		graphiccard.setMemcapacity(graphicCardDto.getMemcapacity());
		graphiccard.setMemspeed(graphicCardDto.getMemspeed());
		graphiccard.setMeminterface(graphicCardDto.getMeminterface());
		graphiccard.setHdmi(graphicCardDto.getHdmi());
		graphiccard.setDvi(graphicCardDto.getDvi());
		graphiccard.setVgaoutput(graphicCardDto.getVgaoutput());
		graphiccard.setMaxres(graphicCardDto.getMaxres());
		graphiccard.setCooling(graphicCardDto.getCooling());
		graphiccard.setPowercons(graphicCardDto.getPowercons());
		graphiccard.setDirectx(graphicCardDto.getDirectx());
		graphiccard.setOpengl(graphicCardDto.getOpengl());
		graphiccard.setDimensions(graphicCardDto.getDimensions());
        graphiccard.setHdcpsupport(graphicCardDto.isHdcpsupport());
        graphiccard.setVgaslot(graphicCardDto.getVgaslot());
        
        
  		graphicCardDao.save(graphiccard);
		
		result.setErrors(mesaj);
		return result;
	}
	@Override
	public ArrayList<GraphicCard> getAll() {
		return new ArrayList<GraphicCard>(this.graphicCardDao.findAll());
	}

}
