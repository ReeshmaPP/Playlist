package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {

	@Id  
	//defining id as column name  
	@Column  
	private int id;  
	//defining name as column name  
	@Column  
	private String songname;  
	@Column  
	private String singer;  
	//defining playlist as column name  
	@Column  
	private String playlist;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getPlaylist() {
		return playlist;
	}
	public void setPlaylist(String playlist) {
		this.playlist = playlist;
	}
	
	
	
}
