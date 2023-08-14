package com.training.loggingtesting;

import com.training.loggingtesting.training.entities.MyMusic;
import com.training.loggingtesting.training.repo.IMyMusicRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataMongoTest
public class DataMongoMusicTest {

    @Autowired
    private IMyMusicRepo repo;

    @Test
    public void findMusicByNameSpec(){


        //saving Mymusic instance in the collection
        repo.save(new MyMusic("Wah Wah Ram ji", Arrays.asList("Sonu Nigam"),"bollywood"));
        MyMusic musicFound = repo.findByName("Wah Wah Ram ji");
        assertEquals("Wah Wah Ram ji",musicFound.getName());
        assertEquals("bollywood",musicFound.getGenre());
    }



    @Test
    public void collectionNotEmpty(){

        assertThat(repo.findAll()).isNotEmpty();

    }
}

