package ibmtal.com.facebook.business.services;

import java.util.ArrayList;

import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.GraphicCard;
import ibmtal.com.facebook.entity.dto.GraphicCardDto;

public interface GraphicCardService {
	Result addGraphicCard (GraphicCardDto graphicCardDto);
	ArrayList<GraphicCard> getAll();
}
