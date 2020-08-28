package com.stockmarket.companydata.models;

public class companyfields {
	private String companyName;
	private int Turnover;
	private String ceo;
	private String boD;
	private String stockExchanges;
	private String sector;
	private String desc;
	private String stockCode;
	
	public companyfields() {
		
	}
	
	public companyfields(String companyName, int turnover, String ceo, String boD, String stockExchanges, String sector,
			String desc, String stockCode) {
		super();
		this.companyName = companyName;
		Turnover = turnover;
		this.ceo = ceo;
		this.boD = boD;
		this.stockExchanges = stockExchanges;
		this.sector = sector;
		this.desc = desc;
		this.stockCode = stockCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getTurnover() {
		return Turnover;
	}
	public void setTurnover(int turnover) {
		Turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoD() {
		return boD;
	}
	public void setBoD(String boD) {
		this.boD = boD;
	}
	public String getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	
}
