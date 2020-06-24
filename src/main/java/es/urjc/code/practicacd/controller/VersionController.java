package es.urjc.code.practicacd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.urjc.code.practicacd.dto.VersionDto;

@RestController
public class VersionController {
	
	private final String version;
	private final String status;
	
	@Autowired
	public VersionController(@Value("${practicacd.version:1.0}") String version, @Value("${practicacd.status:OK}") String status) {
		this.version = version;
		this.status = status;
	}

	@GetMapping("/me/version")
	public ResponseEntity<VersionDto> getVersion() {
		return new ResponseEntity<>(new VersionDto.Builder().withVersion(version).withStatus(status).build(), HttpStatus.OK);
	}
}
