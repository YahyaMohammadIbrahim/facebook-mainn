package ibmtal.com.facebook.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.GlobalNewService;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.GlobalNew;
import ibmtal.com.facebook.entity.Sharing;
import ibmtal.com.facebook.entity.dto.GlobalNewDto;

@RestController
@RequestMapping("/api/globalnew")
public class GlobalNewController {
private GlobalNewService globalNewService;

public GlobalNewController(GlobalNewService globalNewService) {
	super();
	this.globalNewService = globalNewService;
	
}
@PostMapping("/GlobalNews")
public Result newGlobal(@RequestBody GlobalNewDto globalnewDto) {
	return globalNewService.addGlobalNews(globalnewDto);
}
@GetMapping("/getall")
public ArrayList<GlobalNew> getall() {
	return new ArrayList<GlobalNew>(this.globalNewService.getAll());
}
}
