package org.jointheleague.api.cheetah.Cheetah_Search.service;

import org.jointheleague.api.cheetah.Cheetah_Search.repository.LocRepository;
import org.jointheleague.api.cheetah.Cheetah_Search.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {

    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public List<Result> getResults(String query){
        return locRepository.getResults(query);
    }

}
