package com.eric.moonshineonme.cm.controller;

import com.eric.moonshineonme.cm.pojo.entity.Note;
import com.eric.moonshineonme.cm.service.INoteService;
import com.eric.moonshineonme.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * Description:
 * </P>
 *
 * @author wangfei
 * @since 2020-07-09
 */
@RestController
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private INoteService noteService;

    @RequestMapping("/eric")
    public Result<List<Note>> getEricNotes() {
        List<Note> list = noteService.list();
        return Result.success(list);
    }
}
