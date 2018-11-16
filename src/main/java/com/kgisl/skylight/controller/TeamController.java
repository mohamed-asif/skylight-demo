package com.kgisl.skylight.controller;

import java.util.List;
import java.util.Optional;

import com.kgisl.skylight.model.Team;
import com.kgisl.skylight.service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping(value = "/create")
    public Team create(@RequestBody Team team) {

        return teamService.createTeam(team);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable("id") Long id, @RequestBody Team team) {

        team.setTeamId(id);
        Team updatedTeam = teamService.updateTeam(team);
        return new ResponseEntity<>(updatedTeam, HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public List<Team> getAllTeams() {

        return teamService.getAllTeams();
    }

    @GetMapping("/findby/{id}")
    public ResponseEntity<Team> findByid(@PathVariable Long id) {

        Optional<Team> team = teamService.findTeamByid(id);

        if (team.isPresent())
            return new ResponseEntity<>(team.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable("id") Long id) {

        teamService.deleteTeam(id);
        return new ResponseEntity<>("Team has been deleted!", HttpStatus.OK);
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllTeams() {

        teamService.deleteAllTeams();
        return new ResponseEntity<>("All teams have been deleted!", HttpStatus.OK);
    }

}