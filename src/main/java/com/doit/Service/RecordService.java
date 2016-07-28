package com.doit.Service;

import com.doit.Domain.AudioRecorded;


import java.util.List;

/**
 * Created by mounika on 28/07/16.
 */
public interface RecordService {
    List<AudioRecorded> saveByChapterId(Long chapterId);
}


