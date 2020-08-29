package com.stockmarket.sectorservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
import javax.persistence.ManyToOne;

//@Table(name="company")
@Entity
public class Company {
    @Id
    private Integer id;
    private String name;
    private String ceo;
//    private Integer sector_id;
    private Integer contant_id;
    private Integer stock_exchange_id;
    private String brief;
    private String code;
    
//    @OneToOne(mappedBy="company")
//    private SectorCompany sectorCompany;
    @ManyToOne
    private Sector sector;
    public Sector getSector() {
		return sector;
	}
    
	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Company() {

    }

    public Company(Integer id, String name, String ceo, Integer sector_id, Integer contant_id, Integer stock_exchange_id, String brief,
                   String code) {
        super();
        this.id = id;
        this.name = name;
        this.ceo = ceo;
//        this.sector_id = sector_id;
        this.contant_id = contant_id;
        this.stock_exchange_id = stock_exchange_id;
        this.brief = brief;
        this.code = code;
        this.sector=new Sector(sector_id,"","");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

//    public int getSector_id() {
//        return sector_id;
//    }
//
//    public void setSector_id(int sector_id) {
//        this.sector_id = sector_id;
//    }

    public int getContant_id() {
        return contant_id;
    }

    public void setContant_id(int contant_id) {
        this.contant_id = contant_id;
    }

    public int getStock_exchange_id() {
        return stock_exchange_id;
    }

    public void setStock_exchange_id(int stock_exchange_id) {
        this.stock_exchange_id = stock_exchange_id;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
