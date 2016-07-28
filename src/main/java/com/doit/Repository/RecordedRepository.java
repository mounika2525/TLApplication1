package com.doit.Repository;

import com.doit.Domain.AudioRecorded;
import com.doit.Domain.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by mounika on 28/07/16.
 */
public interface RecordedRepository extends JpaRepository<AudioRecorded,Long>
{
    @Query(value="insert into AUDIO_RECORDED(chapterid) values(?1)")
    List<AudioRecorded> saveByChapterId(@Param("chapterId") Long chapterId);
}
