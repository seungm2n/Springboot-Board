package com.board.back.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "board")
@DynamicInsert			// Insert 시 Null인 필드를 제외하기 위함.
@DynamicUpdate			// Update 시 Null인 필드를 제외하기 위함.
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer board_no;

	@Column(name = "board_type")
	private String type;

	@Column(name = "board_title")
	private String title;

	@Column(name = "board_contents")
	private String contents;

	@Column(name = "board_member_no")
	private Integer memberNo;

	@Column(name = "board_reg_dttm")
	private Date regDttm;
	
	@Column(name = "board_mod_dttm")
	private Date modDttm;

	@Column(name = "board_likes")
	private Integer likes;

	@Column(name = "board_counts")
	private Integer counts;

	public Integer getBoard_no() {
		return board_no;
	}

	public void setBoard_no(Integer board_no) {
		this.board_no = board_no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Integer getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}

	public Date getRegDttm() {
		return regDttm;
	}

	public void setRegDttm(Date regDttm) {
		this.regDttm = regDttm;
	}

	public Date getModDttm() {
		return modDttm;
	}

	public void setModDttm(Date modDttm) {
		this.modDttm = modDttm;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getCounts() {
		return counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
	}

}
