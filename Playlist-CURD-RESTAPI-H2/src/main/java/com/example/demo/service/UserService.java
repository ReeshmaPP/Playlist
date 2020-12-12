package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Playlist;
import com.example.demo.entity.Song;

import com.example.demo.repository.PlaylistRepo;
import com.example.demo.repository.SongRepo;



@Service
public class UserService {

	
	
	@Autowired
	PlaylistRepo plyrepo;
	
	@Autowired
	SongRepo songrepo;
	
	public Playlist savePlaylist(Playlist playlist) {
		return plyrepo.save(playlist);
	}
	
	public String deletePlaylist(Playlist playlist) {
		
		 plyrepo.delete(playlist);
		 
		 return "Deleted";
	}
	
	public String deleteSong(Song song) {
		
		songrepo.delete(song);;
		 
		 return "Deleted";
	}
	
	public Song saveSong(Song song)
	{
		songrepo.save(song);
		return song;
		
	}
	
	
	
	public List<Playlist> getAllPlaylist() {
		// TODO Auto-generated method stub
		return plyrepo.findAll();
	}

	

}
