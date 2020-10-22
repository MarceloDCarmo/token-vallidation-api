package br.com.marcelo.tolken_validation.domain.model;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Token {

	private Long id;
	private Integer tokenNumber;
	private OffsetDateTime init;

	public Token() {
		this.init = OffsetDateTime.now();
		this.tokenNumber = new Random().nextInt(1000000);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTokenNumber() {
		return tokenNumber;
	}

	public Integer generateTolken() {
		if(isUpToDate()) {
			return this.tokenNumber;
		}
		
		this.init = OffsetDateTime.now();
		this.tokenNumber = new Random().nextInt(1000000);
		return this.tokenNumber;		
	}
	
	public boolean isUpToDate() {
		if(OffsetDateTime.now().minusSeconds(30L).isBefore(this.init)) {
			return false;
		}
		return true;
	}
	
	public OffsetDateTime getInit() {
		return init;
	}
	
	public Long getRemainingMilliSeconds() {
		return 30000 - (init.until(OffsetDateTime.now(), ChronoUnit.MILLIS));
	}
}
