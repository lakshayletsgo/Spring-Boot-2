package com.SpringBoot.SpringBoot3;

import org.apache.coyote.Response;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/challenges")
public class ChallengeController {
    private ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService){
        this.challengeService = challengeService;
    }

    @GetMapping
    public ResponseEntity<List<Challenge>> getChallenges(){return new ResponseEntity<>(challengeService.getAllChallenges(),HttpStatus.OK);}

    @PostMapping
    public ResponseEntity<String> addChallenge(@RequestBody Challenge challenge){
        return challengeService.addChallenge(challenge)?new ResponseEntity<>("Challenge Added Successfully", HttpStatus.CREATED):new ResponseEntity<>("Challenge Not Added",HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/{month}")
    public ResponseEntity<Challenge> getparticularChallenge(@PathVariable String month){
        Challenge challenge = challengeService.getParticularChallenge(month);
        if(challenge!=null)return new ResponseEntity<>(challenge, HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> changeChallenge(@PathVariable Long id, @RequestBody Challenge updatedChallenge){
        boolean isUpdated = challengeService.changeChallenge(id, updatedChallenge);
        if(isUpdated)return new ResponseEntity<>("Successfully Updated Challenge",HttpStatus.ACCEPTED);
        else return new ResponseEntity<>("Error while updating the challenge",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id){
        boolean isDeleted = challengeService.deleteChallenge(id);
        if(isDeleted)return new ResponseEntity<>("Successfully Deleted the challenge",HttpStatus.OK);
        else return  new ResponseEntity<>("Not Able to delete the challenge",HttpStatus.BAD_REQUEST);
    }
}
