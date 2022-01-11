package ibmtal.com.facebook.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.GraphicCardService;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.GlobalNew;
import ibmtal.com.facebook.entity.GraphicCard;
import ibmtal.com.facebook.entity.dto.GraphicCardDto;

@RestController
@RequestMapping("/api/graphiccard")
public class GraphicCardController {
	private GraphicCardService graphicCardService;

	public GraphicCardController(GraphicCardService graphicCardService) {
		super();
		this.graphicCardService = graphicCardService;
	}
	@PostMapping("/GraphicCards")
	public Result newGraphics(@RequestBody GraphicCardDto graphicCardDto) {
		return graphicCardService.addGraphicCard(graphicCardDto);
	}
	@GetMapping("/getall")
	public ArrayList<GraphicCard> getall() {
		return new ArrayList<GraphicCard>(this.graphicCardService.getAll());
	}
}
