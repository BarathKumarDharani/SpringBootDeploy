/**
 * 
 */
package com.firstproject.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author USER
 * hello
 */
@Entity
public class Alien {

	@Id
	public Integer aid;
	public String acolor;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}

}
