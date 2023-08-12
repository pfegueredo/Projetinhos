package com.invertexto.sistema.modelo;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name = "agenda", url="http://localhost:8080/contato")
@Service
public interface ConsumindoApi {
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	Contato retornaContato();

}
