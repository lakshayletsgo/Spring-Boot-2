package com.SpringBoot.SpringBoot3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ChallengeService {

    private Long nextId=1L;
    private List<Challenge> challenges = new ArrayList<>();
    public ChallengeService(){
    }
    public List<Challenge> getAllChallenges(){
        return challenges;
    }
    public boolean addChallenge(Challenge challenge){

        if(challenge!=null){
            challenge.setId(nextId++);
            challenges.add(challenge);
            return true;
        }else return false;
    }

    public Challenge getParticularChallenge(String month) {
        for(Challenge challenge:challenges){
            if(challenge.getMonth().equalsIgnoreCase(month))return challenge;
        }
        return null;
    }

    public boolean changeChallenge(Long id, Challenge updatedChallenge) {
        for(Challenge challenge:challenges){
            if(challenge.getId().equals(id)){
                challenge.setMonth(updatedChallenge.getMonth());
                challenge.setDescription(updatedChallenge.getDescription());
                return true;
            }
        }
        return false;
    }

    public boolean deleteChallenge(Long id) {
        return challenges.removeIf(challenge -> challenge.getId().equals(id));
    }
}
