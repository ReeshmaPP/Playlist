package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Playlist;
import com.example.demo.entity.Song;

import com.example.demo.service.UserService;


@RestController
@RequestMapping("/playlist")
public class UserController {

	@Autowired
	UserService service;
	
	
	
	@GetMapping("/getplaylist")
	public List<Playlist> getPlaylist() {

		return service.getAllPlaylist();

	}
	
	@PostMapping("/addplaylist/{name}")
	public Playlist addPlaylist(@PathVariable("name") String name) {

		Playlist ply = new Playlist();
		ply.setName(name);
		ply.setId(1);
		
		
		return service.savePlaylist(ply);

	}
	
	@DeleteMapping("/playlistDelete/{name}")
	public String deletePlaylist(@PathVariable("name") String name) {

		Playlist ply = new Playlist();
		ply.setName(name);
		ply.setId(1);
		
		
		return service.deletePlaylist(ply);

	}
	
	@DeleteMapping("/songDelete/{songname}/{playlist}")
	public String deleteSong(@PathVariable("songname") String songname,@PathVariable("playlist") String playlist) {

		Song sng = new Song();
		sng.setId(1);
		sng.setPlaylist(playlist);
		sng.setSinger("albin");
		sng.setSongname(songname);
		
		
		
		return service.deleteSong(sng);

	}
	
	@RequestMapping(value={"/addSong"},
			produces = "application/json",
			method = RequestMethod.POST)
	@ResponseBody
	public Song addSong(@RequestBody Song song) {

		
		return service.saveSong(song);

	}
	
	
	
}
