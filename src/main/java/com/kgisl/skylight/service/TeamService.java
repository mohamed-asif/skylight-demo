package com.kgisl.skylight.service;

import java.util.List;
import java.util.Optional;

import com.kgisl.skylight.model.Team;


public interface TeamService {
        
        public List<Team> getAllTeams() ;    

        public Optional<Team> findTeamByid(Long id);    

        public Team createTeam(Team team);
        
        public Team updateTeam(Team team) ; 
               
        public void deleteTeam(Long id) ;

        public void deleteAllTeams();
    
}