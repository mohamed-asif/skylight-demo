package com.kgisl.skylight.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.kgisl.skylight.model.Team;
import com.kgisl.skylight.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team createTeam(Team team) {

        return teamRepository.saveAndFlush(team);
    }

    @Override
    public Team updateTeam(Team team) {

        Optional<Team> team1 = teamRepository.findById(team.getTeamId());

        if (team1.isPresent()) {
            Team _team = team1.get();
            _team.setTeamId(team.getTeamId());
            _team.setTeamId(team.getTeamId());
            return teamRepository.save(_team);
        } else {
            return team;
        }
    }

    @Override
    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        teamRepository.findAll().forEach(teams::add);
        return teams;
    }

    @Override
    public Optional<Team> findTeamByid(Long id) {
        Optional<Team> team = teamRepository.findById(id);
        return team;
    }

    @Override
    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }

    @Override
    public void deleteAllTeams() {
        teamRepository.deleteAll();
    }

}
