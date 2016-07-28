package com.doit.Service;

import com.doit.Domain.AudioRecorded;
import com.doit.Repository.RecordedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mounika on 28/07/16.
 */
@Service
public class RecordServiceImpl implements RecordService {

    private RecordedRepository recordedRepository;
    public RecordServiceImpl(RecordedRepository recordedRepository)
    {
      this.recordedRepository=recordedRepository;
    }

    @Override
    public List<AudioRecorded> saveByChapterId(Long chapterId) {
        return recordedRepository.saveByChapterId(chapterId);
    }


}
