package com.doit.Controller;

import com.doit.Domain.AudioRecorded;
import com.doit.Domain.Chapter;
import com.doit.Repository.RecordedRepository;
import com.doit.Service.RecordService;
import com.doit.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mounika on 28/07/16.
 */
@RestController
@RequestMapping("/records")
public class RecordController {
    private RecordedRepository recordedRepository;
    private RecordService recordService;

    @Autowired
    public RecordController(RecordedRepository recordedRepository,RecordService recordService)
    {
        this.recordedRepository=recordedRepository;
        this.recordService=recordService;
    }

    @RequestMapping(value = "/sub/{chapterId}", method = RequestMethod.GET)
    public List<AudioRecorded> byChId(@PathVariable(value = "chapterId") Long chapterId){
        return recordService.saveByChapterId(chapterId);
    }
}
