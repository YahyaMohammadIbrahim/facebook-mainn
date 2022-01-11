package ibmtal.com.facebook.business.services;



import java.util.ArrayList;

import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.GlobalNew;
import ibmtal.com.facebook.entity.Sharing;
import ibmtal.com.facebook.entity.dto.GlobalNewDto;



public interface GlobalNewService {
Result addGlobalNews (GlobalNewDto globalNewDto);
ArrayList<GlobalNew> getAll();
}
